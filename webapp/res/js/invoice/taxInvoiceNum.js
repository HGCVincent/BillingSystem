var taxInvNumObj = {
	taxInvType:null,
	taxDate:null,
	taxInvBatch:null,
	taxFrom:null,
	taxTo:null,
	office:null,
	currency:null,
	assignTo:null,
	remarks:null
}

function constructtaxInvNumObj(){
	taxInvNumObj.taxInvType = $("#taxInvType").val();
    taxInvNumObj.taxDate = $("#Calendar_taxDate").val();
    taxInvNumObj.taxInvBatch = $("#form\\:taxInvBatch").val(); 
    taxInvNumObj.taxFrom = $("#form\\:taxInv_No_From").val();
    taxInvNumObj.taxTo = $("#form\\:taxInv_No_To").val();
    taxInvNumObj.office = $("#office").val();
    taxInvNumObj.currency = $("#selectOption_currency").val(); 
	taxInvNumObj.assignTo = $("#selectOption_assignTo").val();
	taxInvNumObj.remarks = $("#form\\:remarks").val();
}


function search(){
	$("#form\\:pageNum").val("");
	$("#form\\:searchButton").click();
}

function createButton(){
	$("#create_pop_up").modal('show');
}

function popUpConfirm(){
	constructtaxInvNumObj();
	TaxInvoiceNumView.createTaxInvNum(JSON.stringify(taxInvNumObj),{
		callback:function(data){
				$("#create_pop_up").modal('hide');
				$("#form\\:searchButton").click();
		},
    	errorHandler:function(message){
			alert("Remote server error, please try again later ");
                return false;
		},
		async:false
	});
}

function clearTag(){
	$("#taxInvType").val("");
    $("#Calendar_taxDate").val("");
    $("#form\\:taxInvBatch").val(""); 
    $("#form\\:taxInv_No_From").val("");
    $("#form\\:taxInv_No_To").val("");
    $("#office").val("请选择");
    $("#selectOption_currency").val("请选择"); 
	$("#selectOption_assignTo").val("请选择");
	$("#form\\:remarks").val("");
}

$(document).ready(
	    function() {
	    	$("#create_pop_up").on('hide.bs.modal',clearTag);
	    }
);