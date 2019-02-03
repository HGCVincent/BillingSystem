var temp;
function resetCriteria(){
	$("#custId").val("");
	$("#custName").val("");
	$("#custShortName").val("");
}

function search(){
	$("#form\\:pageNum").val("");
	$("#form\\:searchButton").click();
}

function viewMoreInfo(t){
//	$("#form\\:more_admin").attr('readonly','true');
//	$("#form\\:more_adminTel").attr('readonly','true');
//	$("#form\\:more_adminEmail").attr('readonly','true');
//	$("#form\\:more_acct").attr('readonly','true');
//	$("#form\\:more_acctTel").attr('readonly','true');
//	$("#form\\:more_acctEmail").attr('readonly','true');
//	$("#form\\:more_addr1").attr('readonly','true');
//	$("#form\\:more_addr2").attr('readonly','true');
//	$("#form\\:more_addr3").attr('readonly','true');
//	$("#form\\:more_addr4").attr('readonly','true');
	var index = $(t).attr('id').substring($(t).attr('id').indexOf('_')+1);
	var id = $("#custId_"+index).val();
	CustomerProfileView.getCustomerProfileById(id,{
		callback:function(data){
			$("#form\\:more_admin").val(data.adminName);
			$("#form\\:more_adminTel").val(data.adminTel);
			$("#form\\:more_adminEmail").val(data.adminEmail);
			$("#form\\:more_acct").val(data.acctBdOwner);
			$("#form\\:more_acctTel").val(data.acctBdOwnerTel);
			$("#form\\:more_acctEmail").val(data.acctBdOwnerEmail);
			$("#form\\:more_addr1").val(data.addr1);
			$("#form\\:more_addr2").val(data.addr2);
			$("#form\\:more_addr3").val(data.addr3);
			$("#form\\:more_addr4").val(data.addr4);
		},
		errorHandler:function(message){
			alert("Remote server error, please try again later ");
                return false;
		},
		async:false
	})
	$("#more_pop_up").modal("show");
}

function deleteCustomerProfile(t){
	temp = t;
	$("#alert_pop_up").modal("show");
}

function deletePopUpConfirm(){
	var index = $(temp).attr('id').substring($(temp).attr('id').indexOf('_') + 1);
	var id = $("#custId_"+index).text();
	CustomerProfileView.deleteCustomerProfileById(id,{
		callback:function(){
			$(temp).parent().parent().remove();
			$("#alert_pop_up").modal('hide');
		},
		errorHandler:function(message){
			alert("Remote server error, please try again later ");
			    return false;
		},
		async:false
	})
	
}

function languageChange(){
	
}

function createPopUpConfirm(){
	
}

function morePopUpConfirm(){
	
}