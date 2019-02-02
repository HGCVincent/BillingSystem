var accountInfoObj = {
	accountId:"",
	custName:"",
	taxInvName:"sddda",
	bankAccount:"123",
	isdefault:"",
	currency:""
}

function constructAccountInfoObj(){
	accountInfoObj.accountId = $("#form\\:account_id").val();
	accountInfoObj.custName = $("#form\\:cust_name").val();
//	accountInfoObj.taxInvName = $("#form\\:pty_name").val();
//	accountInfoObj.bankAccount = $("#form\\:pty_tel").val();
	accountInfoObj.isdefault = "N";
	accountInfoObj.currency = "CNY";
    
}

//显示的搜索按钮的功能
function search(){
	$("#form\\:pageNum").val("");
	$("#form\\:searchButton").click();
}

//重置按钮的功能
function resetCriteria(){
	$("#form\\:accountId").val("");
	$("#form\\:customerName").val("");
	$("#form\\:accountName").val("");
}

//编辑按钮的功能
function modify(t){
	$("#bank_tbale").find("tr").not("thead tr").remove();
	var index = $(t).attr('id').substring($(t).attr('id').indexOf('_')+1);
	var splitBank = $("#accountName_" + index).text().split(";");
	addBank_tr(splitBank,$("#ID_"+index).text());
	$("#form\\:account_id").val($("#ID_"+index).text());
	$("#form\\:cust_name").val($("#customerName_" + index).text());
	$("#account_pop_up").modal('show');
}

//构造给银行信息表格
function addBank_tr(splitBank,id){
	var bank_tr="";
	AccountInfoView.findBankInfo(id,{
		callback:function(data){
			var index = 0;
			for(var key in data){
				index++;
				bank_tr += "<tr>";
				if(data[key].isdefault == "Y"){
					bank_tr += "<td align='center'><input type='radio' name='default' checked='checked' id='isdefault_"+ index +"'/></td>";
				}else{
				    bank_tr += "<td align='center'><input type='radio' name='default' id='isdefault_"+ index +"'/></td>";
				}
			    bank_tr += "<td><input type='text' id='bankName_" +index+ "' style='border:none' readonly='true' value='" + data[key].taxInvName +  "'/></td>";
			    bank_tr += "<td><input type='text' id='bankAccount_" +index+ "' style='border:none' readonly='true' value='" + data[key].bankAccount + "'/></td>";
			    bank_tr += "<td align='center'><button id='delete_"+ index +"' type='button' class='btn btn-primary btn-sm' title='删除' onclick='deleteAccountInfo(this)'><span class='oi oi-delete' title='icon name' aria-hidden='true'/></button></td>";
			    bank_tr += "</tr>";
			}
			$("#index").text(index);
			$("#bank_tbale").append(bank_tr);
		},
		errorHandler: function (message) {
            alert("Remote server error, please try again later ");
            return false;
        },
        async: false
	});	
}

//删除银行信息按钮功能
function deleteAccountInfo(t){
	var index = $(t).attr('id').substring($(t).attr('id').indexOf('_')+1);
	var id = $("#form\\:account_id").val();
	var bankName = $("#bankName_"+index).val();
	AccountInfoView.deleteAccount(id,bankName,{
		callback : function(data){
			if(data){
				$(t).parent().parent().remove();
			}
		},
		errorHandler: function (message) {
            alert("Remote server error, please try again later ");
            return false;
        },
        async: false
	});
}

//添加空白可编辑的银行信息行
function addModifytr(){
	var index = parseInt($("#index").text()) + 1;
	var bank_tr="<tr>";
	bank_tr += "<td align='center'><input type='radio' name='default' id='isdefault_"+ index +"'/></td>";
	bank_tr += "<td><input type='text' id='bankName_" +index+ "' style='border:none'></input></td>";
    bank_tr += "<td><input type='text' id='bankAccount_" + index + "'style='border:none'></input></td>";
    bank_tr += "<td align='center'><button id='delete_"+ index +"' type='button' class='btn btn-primary btn-sm' title='删除' onclick='removeModifyTr(this)'><span class='oi oi-delete' title='icon name' aria-hidden='true'/></button>";
    bank_tr += "&#8195;<button id='confirm_"+ index +"' type='button' class='btn btn-primary btn-sm' title='确认' onclick='modifyConfirm(this)'><span class='oi oi-check' title='icon name' aria-hidden='true'/></button></td>";
    bank_tr += "</tr>";
    $("#bank_tbale").append(bank_tr);
    $("#index").text(index);
}

//添加银行信息的确认按钮功能
function modifyConfirm(t){
	constructAccountInfoObj();
	var index = $(t).attr('id').substring($(t).attr('id').indexOf('_')+1);
	accountInfoObj.taxInvName = $("#bankName_"+index).val();
	accountInfoObj.bankAccount = $("#bankAccount_" + index).val();
	AccountInfoView.addAccountInfo(JSON.stringify(accountInfoObj),{
		callback: function(){
			$(t).remove();
			$("#delete_"+index).attr('onclick','deleteAccountInfo(this)');
			$("#bankName_"+index).attr('readonly','true');
			$("#bankAccount_"+ index).attr('readonly','true');
		},
		errorHandler: function (message) {
            alert("Remote server error, please try again later ");
            return false;
        },
        async: false
	});
}

//移除空白的银行信息行
function removeModifyTr(t){
	$(t).parent().parent().remove();
}

//modal保存按钮的功能
function saveModal(){
	var checkedRadio = $('input[name="default"]:checked');
	var index = checkedRadio.attr('id').substring(checkedRadio.attr('id').indexOf('_')+1);
	var bankName = $("#bankName_"+index).val();
	var id = $("#form\\:account_id").val();
	AccountInfoView.updateIsDefault(id,bankName,{
		callback:function(){
			
		},
		errorHandler: function (message) {
            alert("Remote server error, please try again later ");
            return false;
        },
        async: false
	});
}