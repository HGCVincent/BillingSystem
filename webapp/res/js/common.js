//分页按钮的function
function openPage(t){      
	var pageNum = $(t).text();
	var currentPage = $("#currentPageNum").val();
	var totalPages = $("#totalPages").val();
	switch(pageNum)
	{
	case "首页":
		$("#form\\:pageNum").val("1");
		break;
	case "末页":
		$("#form\\:pageNum").val(totalPages);
		break;
	case "<<":
		$("#form\\:pageNum").val(parseInt(currentPage) - 1);
		break;
	case ">>":
	    $("#form\\:pageNum").val(parseInt(currentPage) + 1);
	    break;
	default:
		$("#form\\:pageNum").val(pageNum);
	}
	$("#form\\:searchButton").click();
}

function showLoadingPage(){
	
}