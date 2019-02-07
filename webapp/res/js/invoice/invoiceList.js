var invId;
var custId;
var currentMonth;
var version;

var invliceListProfileObj = {
		seqId:null,
		invId:null,
		invRefNo:null,
		billComp:null,
		custId:null,
		custName:null,
		invDt:null
}

function constructinvliceListProfileObj(prefix){
	invliceListProfileObj.invId = $(prefix + "invId").val();
	invliceListProfileObj.invRefNo = $(prefix + "invRefNo").val();
	invliceListProfileObj.invDt = $("#Calendar_invDT").val();
	invliceListProfileObj.billComp　=　$("#selectOption").val();
	invliceListProfileObj.custName = $(prefix + "custName").val();
	invliceListProfileObj.custId = $(prefix + "custId").val();
}

function resetCriteria(){
	
}

function search(){
	$("#form\\:pageNum").val("");
	$("#form\\:searchButton").click();
}

function getThePKOfinvoiceList(t){
	var index = $(t).attr('id').substring($(t).attr('id').indexOf('_')+1);
	custId = $("#custId_"+index).text();
	invId = $("#invId_"+index).text();
	currentMonth = $("#currentMonth_"+index).text();
	version = $("#invVersion_"+index).text();
}

function confirmButton(t){
	getThePKOfinvoiceList(t);
	$("#confirm_pop_up").modal('show');
}


function confirmPopUp(){
	InvoiceListView.makeTheStatusToConfirm(invId,custId,version,currentMonth,{
		callback:function(data){
			if(data){
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

function cancelButton(t){
	getThePKOfinvoiceList(t);
	$("#cancel_pop_up").modal('show');
}

function cancelPopUp(){
	InvoiceListView.makeTheStatusToCancel(invId,custId,version,currentMonth,{
		callback:function(data){
			if(data){
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

function createButton(){
	InvoiceListView.getMaxInvId({
    	callback:function(data){
    		$("#form\\:create_invId").val(data);
    		$("#form\\:create_invRefNo").val(data);
    	},
    	errorHandler:function(message){
			alert("Remote server error, please try again later ");
                return false;
		},
		async:false
    });
	$("#create_pop_up").modal('show');
}

function getCustomerInfo(){
	var id = $("#form\\:create_custId").val();
	if(id != null){
		InvoiceListView.getCustomerProfileById(id,{
	    	callback:function(data){
	    		$("#form\\:create_custName").val(data.custName);
	    	},
	    	errorHandler:function(message){
				alert("Remote server error, please try again later ");
	                return false;
			},
			async:false
	    });
	}
}

function createPopUpConfirm(){
	constructinvliceListProfileObj("#form\\:create_");
	InvoiceListView.saveInvoiceList(JSON.stringify(invliceListProfileObj),{
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
	})
}

function closeModal(){
	$("#form\\:create_invId").val("");
	$("#form\\:create_invRefNo").val("");
	$("#form\\:create_custId").val("");
	$("#form\\:create_custName").val("");
	$("#Calendar_invDT").val("");
	$("#selectOption").val("");
}

$(document).ready(
	    function() {
	    	$("#create_pop_up").on('hide.bs.modal',closeModal);
	    }
);