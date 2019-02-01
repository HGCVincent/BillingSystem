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

function search(){
	$("#form\\:pageNum").val("");
	$("#form\\:searchButton").click();
}

function resetCriteria(){
	$("#form\\:accountId").val("");
	$("#form\\:customerName").val("");
	$("#form\\:accountName").val("");
}

function modify(t){
	$("#bank_tbale").find("tr").not("thead tr").remove();
	var index = $(t).attr('id').substring($(t).attr('id').indexOf('_')+1);
	var splitBank = $("#accountName_" + index).text().split(";");
	addBank_tr(splitBank,$("#ID_"+index).text());
	$("#form\\:account_id").val($("#ID_"+index).text());
	$("#form\\:cust_name").val($("#customerName_" + index).text());
	$("#account_pop_up").modal('show');
}

function addBank_tr(splitBank,id){
	var bank_tr="";
	AccountInfoView.findBankInfo(id,{
		callback:function(data){
			var index = 0;
			for(var key in data){
				index++;
				bank_tr += "<tr>";
				if(data[key].isdefault == "Y"){
					bank_tr += "<td align='center'><input type='radio' name='default' checked='checked'></input></td>";
				}else{
				    bank_tr += "<td align='center'><input type='radio' name='default'></input></td>";
				}
			    bank_tr += "<td><span id='bankName_" +index+ "'>" +　data[key].taxInvName +　"</span></td>";
			    bank_tr += "<td align='center'><span id='bankAccount_" + index + "'>"+ data[key].bankAccount +"</span></td>";
			    bank_tr += "<td align='center'><button id='delete_"+ index +"' type='button' class='btn btn-primary btn-sm' title='删除' onclick='deleteAccounInfo(this)'><span class='oi oi-delete' title='icon name' aria-hidden='true'/></button></td>";
			    bank_tr += "</tr>";
			}
			$("#index").text(index);
			$("#bank_tbale").append(bank_tr);
		}
	});	
}

function deleteAccounInfo(t){
	var index = $(t).attr('id').substring($(t).attr('id').indexOf('_')+1);
	var id = $("#form\\:account_id").val();
	var bankName = $("#bankName_"+index).text();
	AccountInfoView.deleteAccount(id,bankName,{
		callback : function(data){
			if(data){
				$(t).parent().parent().remove();
			}
		}
	});
}

function addModifytr(){
	var index = parseInt($("#index").text()) + 1;
	var bank_tr="<tr>";
	bank_tr += "<td align='center'><input type='radio' name='default' id='default_>"+ index +"<'/input></td>";
	bank_tr += "<td><input type='text' id='bankName_" +index+ "' style='border:none'></input></td>";
    bank_tr += "<td align='center'><input type='text' id='bankAccount_" + index + "'style='border:none'></input></td>";
    bank_tr += "<td align='center'><button id='delete_"+ index +"' type='button' class='btn btn-primary btn-sm' title='删除' onclick='deleteAccounInfo(this)'><span class='oi oi-delete' title='icon name' aria-hidden='true'/></button>";
    bank_tr += "<button id='confirm_"+ index +"' type='button' class='btn btn-primary btn-sm' title='确认' onclick='modifyConfirm(this)'><span class='oi oi-check' title='icon name' aria-hidden='true'/></button></td>";
    bank_tr += "</tr>";
    $("#bank_tbale").append(bank_tr);
    $("#index").text(index);
}

function modifyConfirm(t){
	constructAccountInfoObj();
	var index = $(t).attr('id').substring($(t).attr('id').indexOf('_')+1);
	accountInfoObj.taxInvName = $("#bankName_" + index).val();
	accountInfoObj.bankAccount = $("#bankAccount_" + index).val();
	AccountInfoView.addAccountInfo(JSON.stringify(accountInfoObj),{
		callback: function(){
			
		}
	});
}