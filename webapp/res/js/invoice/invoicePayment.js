var EMPTY_DATE = "yyyy-mm-dd";
var accountid = "";
function search(){
	$("#form\\:pageNum").val("");
	$("#form\\:searchButton").click();
}

function setDateFormat(strdate) {
    var dt = new Date(strdate);
    var seperator1 = "-";
    var year = dt.getFullYear();
    var month = dt.getMonth() + 1;
    var strDate = dt.getDate();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >=1 && strDate <=9){
        strDate = "0" + strDate;
    }
    strdate = year + seperator1 + month + seperator1 + strDate;
    if(strdate == "NaN-NaN-NaN"){
        strdate = EMPTY_DATE;
    }
    return strdate
}

function historyButton(t){
	var rowIndex = $(t).attr('id').substring($(t).attr('id').indexOf('_')+1);
	var paymentSeq = $("#paymentSeq_"+rowIndex).val();
	var paymentId = $("#paymentId_"+rowIndex).val();
	var bank_tr="";
	InvoicePaymentView.getInvoicePaymentHistory(paymentId,{
		callback:function(data){
			$("#history_table").find("tr").not("thead tr").remove();
			var index = 0;
			var history = eval("(" + data + ")");
			for(var i=0 ; i < history.length ; i++){
				index++;
				bank_tr += "<tr>";
				if(history[i].dateOfSettlement == null){
					bank_tr += "<td><input size='5' type='text' id='dateOfSettlement_" +index+ "' style='border:none' readonly='true'/></td>";
				}
				else{
					bank_tr += "<td><input size='5' type='text' id='dateOfSettlement_" +index+ "' style='border:none' readonly='true' value='" + history[i].dateOfSettlement +  "'/></td>";
				}
				bank_tr += "<td><input size='5' type='text' id='paymentAmt_" +index+ "' style='border:none' readonly='true' value='" + history[i].paymentAmt +  "'/></td>";
			    bank_tr += "<td><input size='5' type='text' id='paymentCurrency_" +index+ "' style='border:none' readonly='true' value='" + history[i].paymentCurrency + "'/></td>";
			    bank_tr += "<td><input size='5' type='text' id='payer_" +index+ "' style='border:none' readonly='true' value='" + history[i].payer + "'/></td>";
			    bank_tr += "<td><input size='5' type='text' id='payerAccount_" +index+ "' style='border:none' readonly='true' value='" + history[i].payerAccount + "'/></td>";
			    bank_tr += "<td><input size='5' type='text' id='settlementRemark_" +index+ "' style='border:none' readonly='true' value='" + history[i].settlementRemark + "'/></td>";
			    bank_tr += "<td><input size='5' type='text' id='status_" +index+ "' style='border:none' readonly='true' value='" + history[i].status + "'/></td>";
			    if(history[i].modifyDate == null){
			    	bank_tr += "<td><input size='5' type='text' id='modifyDate_" +index+ "' style='border:none' readonly='true'/></td>";
				}
			    else{
			    	var modifyDate = (history[i].modifyDate.year+1900) + "/" + (history[i].modifyDate.month+1) + "/" + history[i].modifyDate.date;
			    	bank_tr += "<td><input size='5' type='text' id='modifyDate_" +index+ "' style='border:none' readonly='true' value='" + modifyDate + "'/></td>";
			    }
			    bank_tr += "<td><input size='5' type='text' id='modifyBy_" +index+ "' style='border:none' readonly='true' value='" + history[i].modifyBy + "'/></td>";
			    bank_tr += "</tr>";
			}
			$("#history_table").append(bank_tr);
		},
		errorHandler: function (message) {
	        alert("Remote server error, please try again later ");
	        return false;
	    },
	    async: false
	});
	$("#history_pop_up").modal('show');
}

function modifyButton(t){
	var listIndex;
    var custId
    listIndex = $(t).attr('id').substring($(t).attr('id').indexOf('_')+1);
    custId = $("#custId_" + listIndex).text();
    redrawPayerSelectOneMenu(custId);
    initialInput(listIndex);
    editTagOfModify();
    $("#modify_pop_up").modal('show');
}

function redrawPayerSelectOneMenu(custId) {
	$("#selectPayer").find("[name='payerOption']").remove();
	$("#selectPayerAccount").find("[name = 'payerAccountOption']").remove();
    InvoicePaymentView.getAccountByCustomerId(custId,{
        callback: function (data) {
            var strPayer = "";
            var obj = data;
            accountid = obj[0].accountId;
            for (var i in obj){
                strPayer = strPayer + "<option name='payerOption' value=\"" + obj[i].taxInvName +"\">" + obj[i].taxInvName + "</option>";
            }
            $("#selectPayer").append(strPayer);
        },
        errorHandler:function (message) {
            alert("Remote server error, please try again later  1");
            return false;
        },
        async:false
    });
}

function initialInput(listIndex) {
    $("#form\\:paymentSeq").val($("#paymentSeq_"+listIndex).text());
    $("#form\\:custId").val($("#custId_"+listIndex).text());
    $("#form\\:paymentStatus").val($("#status_"+listIndex).text());
    $("#form\\:custName").val($("#custName_"+listIndex).text());
    $("#form\\:invRefNo").val($("#invRefNo_"+listIndex).text());
    $("#form\\:invCurr").val($("#invoiceCurrency_"+listIndex).text());
    $("#form\\:invAmt").val($("#invoiceAmt_"+listIndex).text());
    $("#selectPaymentCurrency").val($("#paymentCurrency_"+listIndex).text());
    $("#form\\:paymentCurrency").val($("#paymentCurrency_"+listIndex).text());
    $("#form\\:paymentAmt").val($("#paymentAmt_"+listIndex).text());
    $("#form\\:paymentDate").val($("#paymentDate"+listIndex).text());
    $("#Calendar_BankInDate").val(setDateFormat($("#dateOfSettlement_"+listIndex).text()));
    $("#Calendar_PaymentDate").val(setDateFormat($("#paymentDate_"+listIndex).text()));
    $("#form\\:billingCompany").val($("#billComp_"+listIndex).text());

    if($("#payer_"+listIndex).text() !=""){
    	$("#selectPayer").val($("#payer_"+listIndex).text());
    }
    $("#form\\:inputPayer").val($("#payer_"+listIndex).text());

    if($("#payer_"+listIndex).text() != ""){
        selectPayerChange($("#payer_"+listIndex).text());
    }
    $("#form\\:inputPayerAccount").val($("#payerAccount_"+listIndex).text());
    $("#selectPayerAccount").val($("#payer_account_"+listIndex).text());
}

function selectPayerChange(payer) {
    $("#selectPayerAccount").find("[name = 'payerAccountOption']").remove()
    $("#form\\:inputPayer").val(payer);
    InvoicePaymentView.getPayerAccount(payer,accountid,{
        callback: function (data) {
                var strPayerAccount = "";
                var obj = data;
                for (var i in obj) {
                    strPayerAccount = strPayerAccount + "<option name='payerAccountOption' value=\"" + obj[i].bankAccount + "\">" + obj[i].bankAccount + "</option>";
                }
                $("#selectPayerAccount").append(strPayerAccount);
        },
        errorHandler:function (message) {
            alert("Remote server error, please try again later 2");
            return false;
        },
        async:false
    });
}

function editTagOfModify() {
    $("#form\\:custId").attr("readonly","true");
    $("#form\\:custId").css("border","none");
    $("#form\\:custName").attr("readonly","true");
    $("#form\\:custName").css("border","none");
    $("#form\\:invRefNo").attr("readonly","true");
    $("#form\\:invRefNo").css("border","none");
    $("#form\\:invCurr").attr("readonly","true");
    $("#form\\:invCurr").css("border","none");
    $("#form\\:invAmt").attr("readonly","true");
    $("#form\\:invAmt").css("border","none");
}

function setSelection(t)
{
    $("#form\\:input" + t.name).val(t.value);
}

function createPopUpConfirm(){
	$("#form\\:saveButton").click();
}