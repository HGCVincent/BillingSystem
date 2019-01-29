var temp;
var isUpdte;
var rowIndex;
var issuingPartyObj = {
    partyId:"",
    partyName:"",
    address:"",
    partyTel:"",
    bankName:"",
    bankAccount:"",
    currency:""
}

function search(){
	$("#form\\:pageNum").val("");
	$("#form\\:searchButton").click();
}

function resetCriteria(){
	$("#form\\:partyName").val("");
	$("#form\\:partyAddress").val("");
	$("#form\\:Account").val("");
	$("#form\\:bankName").val("");
}

function constructIssuingPartyObj(){
	issuingPartyObj.partyId = $("#form\\:pty_id").val();
	issuingPartyObj.address = $("#form\\:pty_addr").val();
    issuingPartyObj.partyName = $("#form\\:pty_name").val();
    issuingPartyObj.partyTel = $("#form\\:pty_tel").val();
    issuingPartyObj.bankName = $("#form\\:pty_bankName").val();
    issuingPartyObj.bankAccount = $("#form\\:pty_bankAccount").val();
    issuingPartyObj.currency = $("#selectOption_currency").val();
}

function initialInput(listIndex) {
//    $("#form\\:rowIndex").val(listIndex);
    $("#form\\:pty_id").val($("#partyId_"+listIndex).text());
    $("#form\\:pty_name").val($("#partyName_"+listIndex).text());
    $("#form\\:pty_tel").val($("#partyTel_"+listIndex).text());
    $("#form\\:pty_addr").val($("#partyAddr_"+listIndex).text());
    $("#form\\:pty_bankName").val($("#partyBankName_"+listIndex).text());
    $("#form\\:pty_bankAccount").val($("#partyBankAccount_"+listIndex).text());
    $("#selectOption_currency").val($("#partyBankCurrency_"+listIndex).text());
}

function saveIssuingPtyInfo(){
	constructIssuingPartyObj();
	IssuingPartyView.updateOrAddInvoiceItem(JSON.stringify(issuingPartyObj),isUpdate,{
		callback: function (data) {
			$("#form\\:searchButton").click();
        },
        errorHandler: function (message) {
            alert("Remote server error, please try again later ");
            return false;
        },
        async: false
	});
}

function modifyIssuingPtyInfo(){
	constructIssuingPartyObj();
	IssuingPartyView.updateOrAddInvoiceItem(JSON.stringify(issuingPartyObj),isUpdate,{
		callback: function (data) {
			var obj = eval("(" + data + ")");
			$("#issuingParty_pop_up").modal('hide');
			if (obj[0].result) {
                if (isUpdate) {
                	$("#partyId_"+rowIndex).innerHTML = obj[0].pty_id;
                	$("#partyName_" + rowIndex).text(obj[0].pty_name);
                    $("#partyTel_" + rowIndex).text(obj[0].pty_tel);
                    $("#partyAddr_" + rowIndex).text(obj[0].pty_address);
                    $("#partyBankName_" + rowIndex).text(obj[0].bank_name);
                    $("#partyBankAccount_" + rowIndex).text(obj[0].bank_account);
                    $("#partyBankCurrency_" + rowIndex).text(obj[0].currency);
                }
            }
        },
        errorHandler: function (message) {
            alert("Remote server error, please try again later ");
            return false;
        },
        async: false
	});
}

function popUpConfirm(){
	if(!isUpdate){
		saveIssuingPtyInfo();
	}
	else{
		modifyIssuingPtyInfo()
	}
}

function deleteIssuingParty(t){
	temp = t;
	$("#delete_pop_up").modal('show');
}

function deleteIssuingParty_confirm(){
	var listIndex = $(temp).attr('id').substring($(temp).attr('id').indexOf('_')+1);
	var ptyId = $("#partyId_" + listIndex).text();
    IssuingPartyView.deleteIssuingParty($("#partyId_" + listIndex).text(),{
            callback:function (statue) {
            	    $("#form\\:pageNum").val("");
                	$("#form\\:searchButton").click();
            },
            errorHandler:function (message) {
                alert("Remote server error, please try again later ");
                return false;
            },
            async:false
    });
}

function changeTitleForPopUp(t){
	var title = $(t).attr("title");
	switch(title){
	case "添加":
		isUpdate = false;
		break;
	case "编辑":
		isUpdate = true;
		rowIndex = $(t).attr('id').substring($(t).attr('id').indexOf('_')+1);
		initialInput(rowIndex);
		break;
	}
	$("#myModalLabel").text(title);
}

function closeModal(){
	$("#form\\:pty_id").val("");
    $("#form\\:pty_name").val("");
    $("#form\\:pty_tel").val("");
    $("#form\\:pty_addr").val("");
    $("#form\\:pty_bankName").val("");
    $("#form\\:pty_bankAccount").val("");
    $("#selectOption_currency").val("请选择");
}

$(document).ready(
    function() {
    	$("#issuingParty_pop_up").on('hide.bs.modal',closeModal);
    }
);