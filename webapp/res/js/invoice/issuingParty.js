var temp;
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
	issuingPartyObj.address = $("#form\\:pty_addr").val();
    issuingPartyObj.partyName = $("#form\\:pty_name").val();
    issuingPartyObj.partyTel = $("#form\\:pty_tel").val();
    issuingPartyObj.bankName = $("#form\\:pty_bankName").val();
    issuingPartyObj.bankAccount = $("#form\\:pty_bankAccount").val();
    issuingPartyObj.currency = $("#selectOption_currency").val();
}

function saveIssuingPtyInfo(){
	constructIssuingPartyObj();
	IssuingPartyView.updateOrAddInvoiceItem(JSON.stringify(issuingPartyObj),{
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

function deleteIssuingParty(t){
	temp = t;
	$("#delete_pop_up").modal('show');
}

function deleteIssuingParty_confirm(){
	var listIndex = $(temp).attr('id').substring($(temp).attr('id').indexOf('_')+1);
	var ptyId = $("#partyId_" + listIndex).text();
    IssuingPartyView.deleteIssuingParty($("#partyId_" + listIndex).text(),{
            callback:function (statue) {
                	$("#form\\:searchButton").click();
            },
            errorHandler:function (message) {
                alert("Remote server error, please try again later ");
                return false;
            },
            async:false
    });
}

