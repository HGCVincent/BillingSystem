var temp;
var isUpdate;


var customerProfileObj = {
		custId:null,
		custName:null,
		langType:null,
		country:null,
		county:null,
		city:null,
		adminName:null,
		adminTel:null,
		adminEmail:null,
		acctBdOwner:null,
		acctBdOwnerTel:null,
		acctBdOwnerEmail:null,
		addr1:null,
		addr2:null,
		addr3:null,
		addr4:null,
		shortName:null
	}

function constructCustomerProfileObj(prefix){
	if(!isUpdate){
		customerProfileObj.custName = $(prefix + "name").val();
		customerProfileObj.langType = $(prefix + "lang").val();
		customerProfileObj.country =$(prefix + "country").val();
		customerProfileObj.county =$(prefix + "county").val();
		customerProfileObj.city = $(prefix + "city").val();
		customerProfileObj.shortName = $(prefix + "shortname").val();
	}
	customerProfileObj.custId = $(prefix + "id").val();
	customerProfileObj.adminName = $(prefix + "admin").val();
	customerProfileObj.adminTel = $(prefix + "adminTel").val();
	customerProfileObj.adminEmail = $(prefix + "adminEmail").val();
	customerProfileObj.acctBdOwner　=　$(prefix + "acct").val();
	customerProfileObj.acctBdOwnerTel = $(prefix + "acctTel").val();
	customerProfileObj.acctBdOwnerEmail = $(prefix + "acctEmail").val();
	customerProfileObj.addr1 = $(prefix + prefix + "addr1").val();
	customerProfileObj.addr2 = $(prefix + "addr2").val();
	customerProfileObj.addr3 = $(prefix + "addr3").val();
	customerProfileObj.addr4 = $(prefix + "addr4").val();
}

function resetCriteria(){
	$("#custId").val("");
	$("#custName").val("");
	$("#custShortName").val("");
}

function search(){
	$("#form\\:pageNum").val("");
	$("#form\\:searchButton").click();
}

function createCustomerProfile(t){
	isUpdate = false;
	$("#create_pop_up").modal("show");
}

function viewMoreInfo(t){
	var index = $(t).attr('id').substring($(t).attr('id').indexOf('_')+1);
	var id = $("#custId_"+index).text();
	CustomerProfileView.getCustomerProfileById(id,{
		callback:function(data){
			$("#form\\:more_id").val(data.custId);
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
	$("#form\\:create_lang").val($("#selectOption_lang").val());
}

function createPopUpConfirm(){
	constructCustomerProfileObj("#form\\:create_");
	CustomerProfileView.saveCustomerProfile(JSON.stringify(customerProfileObj),isUpdate,{
		callback:function(data){
			if(data){
				$("#create_pop_up").modal('hide');
				$("#form\\:searchButton").click();
			}
		},
		errorHandler:function(message){
			alert("Remote server error, please try again later ");
			    return false;
		},
		async:false
	});
}

function morePopUpConfirm(){
	constructCustomerProfileObj("#form\\:more_");
	CustomerProfileView.saveCustomerProfile(JSON.stringify(customerProfileObj),isUpdate,{
		callback:function(data){
			if(data){
				makeTheTagReadOnly();
				$("#save").hide();
			}
		},
		errorHandler:function(message){
			alert("Remote server error, please try again later ");
			    return false;
		},
		async:false
	});
}

function ModifyCustmorInfo(){
	isUpdate = true;
	$("#save").show();
	makeTheTagModifiable();
}

function makeTheTagModifiable(){
	$("#form\\:more_admin").removeAttr("readonly");
	$("#form\\:more_admin").css("border","");
	$("#form\\:more_adminTel").removeAttr("readonly");
	$("#form\\:more_adminTel").css("border","");
	$("#form\\:more_adminEmail").removeAttr("readonly");
	$("#form\\:more_adminEmail").css("border","");
	$("#form\\:more_acct").removeAttr("readonly");
	$("#form\\:more_acct").css("border","");
	$("#form\\:more_acctTel").removeAttr("readonly");
	$("#form\\:more_acctTel").css("border","");
	$("#form\\:more_acctEmail").removeAttr("readonly");
	$("#form\\:more_acctEmail").css("border","");
	$("#form\\:more_addr1").removeAttr("readonly");
	$("#form\\:more_addr1").css("border","");
	$("#form\\:more_addr2").removeAttr("readonly");
	$("#form\\:more_addr2").css("border","");
	$("#form\\:more_addr3").removeAttr("readonly");
	$("#form\\:more_addr3").css("border","");
	$("#form\\:more_addr4").removeAttr("readonly");
	$("#form\\:more_addr4").css("border","");
}

function makeTheTagReadOnly(){
	$("#form\\:more_admin").attr("readonly","true");
	$("#form\\:more_admin").css("border","none");
	$("#form\\:more_adminTel").attr("readonly","true");
	$("#form\\:more_adminTel").css("border","none");
	$("#form\\:more_adminEmail").attr("readonly","true");
	$("#form\\:more_adminEmail").css("border","none");
	$("#form\\:more_acct").attr("readonly","true");
	$("#form\\:more_acct").css("border","none");
	$("#form\\:more_acctTel").attr("readonly","true");
	$("#form\\:more_acctTel").css("border","none");
	$("#form\\:more_acctEmail").attr("readonly","true");
	$("#form\\:more_acctEmail").css("border","none");
	$("#form\\:more_addr1").attr("readonly","true");
	$("#form\\:more_addr1").css("border","none");
	$("#form\\:more_addr2").attr("readonly","true");
	$("#form\\:more_addr2").css("border","none");
	$("#form\\:more_addr3").attr("readonly","true");
	$("#form\\:more_addr3").css("border","none");
	$("#form\\:more_addr4").attr("readonly","true");
	$("#form\\:more_addr4").css("border","none");
}

function clearTag(prefix){
    $(prefix + "name").val("");
	$(prefix + "lang").val("");
	$("#selectOption_lang").val("请选择");
	$(prefix + "country").val("");
	$(prefix + "county").val("");
	$(prefix + "city").val("");
	$(prefix + "shortname").val("");
	$(prefix + "id").val("");
	$(prefix + "admin").val("");
	$(prefix + "adminTel").val("");
	$(prefix + "adminEmail").val("");
	$(prefix + "acct").val("");
	$(prefix + "acctTel").val("");
	$(prefix + "acctEmail").val("");
	$(prefix + "addr1").val("");
	$(prefix + "addr2").val("");
	$(prefix + "addr3").val("");
	$(prefix + "addr4").val("");
}

function closeModal(){
	clearTag("#form\\:create_");
}

$(document).ready(
	    function() {
	    	$("#create_pop_up").on('hide.bs.modal',closeModal);
	    }
);