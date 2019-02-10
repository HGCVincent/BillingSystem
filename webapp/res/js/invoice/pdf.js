function getData(rowIndex){
	var invoiceId = $("#invId_"+rowIndex).text();
	var custid = $("#custId_"+rowIndex).text();
	var custName = $("#custName_"+rowIndex).text();
    var totalCurrency = $("#currency_" + rowIndex).text();
    var currentMonth = $("#currentMonth_"+rowIndex).text();
	var data ={
		"rowIndex":(rowIndex),
		"Customer_Id":(custid),
		"Customer_Name":(custName),"CS_INVOICE_NUMBER":(invoiceId),
		"Address1":(""),"Address2":(""),"Address3":(""),"Address4":(""),
		"ATTN_Name": (""),"ATTN_Tel":(""),"Total_Currency":(totalCurrency),
		"ATTN_Email":(""),"Ddte":(""),
		"Bill_RefNo1":(""),"ATTN_Ext_Email":(""),
		"CurrentMonth":(currentMonth),
		"Amounts":("")
	};
	getInvoiceCustomerMessage(custid,data);
    replaceXMLCharacter(data);
    getInvoiceItem(invoiceId, data);
	return data;
}

function replaceXMLCharacter(data){
    for (var x in data) {
            data[x] = data[x].replace(/&/g, "&amp;").replace(/</g,"&lt;").replace(/>/g,"&gt;").replace(/'/g,"&apos;").replace(/"/g,"&quot;");
    }
}

function getInvoiceCustomerMessage(custid,data){
	InvoiceListView.getInvoiceCustomerMessageById(custid,{
		callback :function(a){
			for(var mes in a){
				if(a[mes]==null) data[mes] = "";
				else data[mes] = a[mes];
			}
		},
		async: false
	});
}

function getInvoiceItem(invoiceId,data){
    InvoiceListView.findInvoiceItem(data["CS_INVOICE_NUMBER"],data["Customer_Id"],data["CurrentMonth"],{
        callback : function(items){
               CNInvoiceItems(items,data);
        },
        async:false
    });
}

function CNInvoiceItems(items,data) {
    var amounts = 0;
    var tdStr = "";
    var delrow = 0;
    var i = items.length;
    for(var j=0;j<i;j++){
        tdStr = tdStr + "<tr>";
        amounts = amounts + items[j].itemAmt;
        tdStr = tdStr + "<td>" +
                            (items[j].itemDesc == null ? "" :
                                items[j].itemDesc.replace(/&/g, "&amp;").replace(/</g,"&lt;")
                                                 .replace(/>/g,"&gt;").replace(/'/g,"&apos;")
                                                 .replace(/"/g,"&quot;")) +
                            (items[j].billPeriodFrom == null ? "" : " [" + items[j].billPeriodFrom + " - ") +
                            (items[j].billPeriodTo == null ? "" : items[j].billPeriodTo + "]") +
                        "</td>";
        tdStr = tdStr + "<td>" + (items[j].price == null ? "" : items[j].price) + "</td>";
        tdStr = tdStr + "<td>" + (items[j].price == null ? "" : items[j].price) + "</td>";
        if(parseInt(items[j].itemAmt)<0){
            tdStr = tdStr + "<td>" + "(" + Math.abs(items[j].itemAmt) + ")" + "</td></tr>";
        }
        else {
            tdStr = tdStr + "<td>" + (items[j].itemAmt == null ? "" : items[j].itemAmt) + "</td></tr>";
        }
        var DescLenth = items[j].itemDesc.length + items[j].itemDesc.length + items[j].itemDesc.length + 6;
        while((DescLenth - 120 )> 0){
            delrow++;
            DescLenth = DescLenth - 120;
        }
    }
    for(;(i+delrow)<10;i++){
        tdStr = tdStr + "<tr><td></td><td></td><td></td><td></td></tr>";
    }
    data["Items"] = tdStr;
    data["Amounts"] = amounts;
//    absAmounts(amounts,data);
}

function previewPDFInvoice(t){
	var rowIndex = $(t).attr('id').substring($(t).attr('id').indexOf('_') + 1);
//	$("#inv_loading").show();
	var ds = JSON.stringify(getData(rowIndex));
    var form = $("<form method='post' target='_blank'></form>");
    form.attr({"action":"preview_PDFInvoice.jsp"});
    var input = $("<input type='hidden'>");
    input.attr({"name":"name"});
    input.val(ds);
    form.append(input);
    $("html").append(form);
    form.submit();
    $("#inv_loading").hide();
	// window.open("preview_PDFInvoice.jsp?name="+encodeURIComponent(encodeURIComponent(ds)));
}

