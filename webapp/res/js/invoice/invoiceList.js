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

var itemObj ={
		itemDesc:null,
		billPeriodFrom:null,
		billPeriodTo:null,
		price:null,
		currency:null,
		amt:null
}

function constructinvliceListProfileObj(prefix){
	invliceListProfileObj.invId = $(prefix + "invId").val();
	invliceListProfileObj.invRefNo = $(prefix + "invRefNo").val();
	invliceListProfileObj.invDt = $("#Calendar_invDT").val();
	invliceListProfileObj.billComp　=　$("#selectOption").val();
	invliceListProfileObj.custName = $(prefix + "custName").val();
	invliceListProfileObj.custId = $(prefix + "custId").val();
}

function constructItemObj(i){
	itemObj.itemDesc=$("#item_desc"+i).val();
	itemObj.billPeriodFrom=$("#Calendar_starDT"+i).val();
	itemObj.billPeriodTo=$("#Calendar_endDT"+i).val();
	itemObj.price=$("#inv_price"+i).val();
	itemObj.currency=$("#selectOption"+i).val();
	itemObj.amt=$("#inv_amt"+i).val();
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
	$("#index").text('1');
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
	var itemSum = parseInt($("#index").text());
	var itemArr = new Array(itemSum);
	for(var n=0;n<itemSum;n++){
		constructItemObj(n+1);
		itemArr.push(itemObj);
	}
	InvoiceListView.saveInvoiceList(JSON.stringify(invliceListProfileObj),itemArr,{
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

function saveInvoiceItem(itemArr){
	InvoiceListView.saveInvoiceItem(itemArr,{
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

function closeModal(){
	$("#form\\:create_invId").val("");
	$("#form\\:create_invRefNo").val("");
	$("#form\\:create_custId").val("");
	$("#form\\:create_custName").val("");
	$("#Calendar_invDT").val("");
	$("#selectOption").val("");
}

function addModifytr(){
	var index = parseInt($("#index").text()) + 1;
	var item_tr="<tr>";
	item_tr += "<td><input type='text' name='item_desc' id='item_desc"+ index +"' size='10' maxlength='100' " +
			        "style='border:none;'/></td>";                                 
	item_tr += "<td><div class='input-group date' id='datetimepickerStarDT"+index+"' data-target-input='nearest'>" +
			           "<input id='Calendar_starDT"+index+"' type='text' size='5' class='form-control datetimepicker-input' data-target='#datetimepickerStarDT"+index+"'/>" +
			           "<div class='input-group-append' data-target='#datetimepickerStarDT"+index+"' data-toggle='datetimepicker'>" +
			           "<div class='input-group-text'><i class='oi oi-calendar'></i></div>" +
			           "</div></div>" +
			           "<script type='text/javascript'>$(function () {$('#datetimepickerStarDT"+index+"').datetimepicker({format: 'L'});});</script>"+
			           "</td>";
	item_tr += "<td><div class='input-group date' id='datetimepickerEndDT"+index+"' data-target-input='nearest'>" +
					    "<input id='Calendar_endDT"+ index +"' type='text' size='5' class='form-control datetimepicker-input' data-target='#datetimepickerEndDT"+index+"'/>" +
					    "<div class='input-group-append' data-target='#datetimepickerEndDT"+index+"' data-toggle='datetimepicker'>" +
					    "<div class='input-group-text'><i class='oi oi-calendar'></i></div>" +
					    "</div></div>" +
					    "<script type='text/javascript'>$(function () {$('#datetimepickerEndDT"+index+"').datetimepicker({format: 'L'});});</script>"+
					    "</td>";
    item_tr += "<td><input type='text' name='inv_price' id='inv_price"+ index +"' size='2' maxlength='100' " +
    		         "style='border:none;'/></td>";
    item_tr += "<td><input type='text' name='txn_quantity' id='txn_quantity"+index+"' size='1' maxlength='100'" +
    		         "style='border:none;'/></td>";
    item_tr += "<td><select id='selectOption"+index+"' onchange='Change()' style='width:80px;'>" +
    		            "<option value=''>请选择</option>" +
    		            "<option value='USD'>USD</option>" +
    		            "<option value='CNY'>CNY</option>" +
    		        "</select>" +
    		        "<input style='display:none;' size='20' maxlength='100' id='option_selected"+index+"'/>" +
    		        "<script type='text/javascript'>function Change(){$('#option_selected"+index+"').val($('#selectOption"+index+"').val());}</script>" +
    		    "</td>";
    item_tr += "<td><input type='text' name='inv_amt' id='inv_amt"+ index +"' size='5' maxlength='100' style='border:none;'/></td>";
    item_tr += "</tr>";
    $("#item_tbale").append(item_tr);
    $("#index").text(index);
}

$(document).ready(
	    function() {
	    	$("#create_pop_up").on('hide.bs.modal',closeModal);
	    }
);