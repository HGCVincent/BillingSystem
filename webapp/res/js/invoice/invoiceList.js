var invId;
var custId;
var currentMonth;
var version;

function resetCriteria(){
	
}

function search(){
	$("#form\\:pageNum").val("");
	$("#form\\:searchButton").click();
}

function confirmButton(t){
	var index = $(t).attr('id').substring($(t).attr('id').indexOf('_')+1);
	custId = $("#custId_"+index).text();
	invId = $("#invId_"+index).text();
	currentMonth = $("#currentMonth_"+index).text();
	version = $("#invVersion_"+index).text();
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