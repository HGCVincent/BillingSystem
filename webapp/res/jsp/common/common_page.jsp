<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:c="http://java.sun.com/jstl/core">
	
<ui:composition>
     <div class="col-md-4 offset-md-8">
					<nav aria-label="Page navigation example">
					  <ul class="pagination pagination-sm">
						<li class="#{Page.isFristPage ? 'page-item disabled' : 'page-item'}">
						    <a class="page-link" href="#" onclick="openPage(this)"><span style="font-size: smaller;">首页</span></a>
						</li>
						<li class="#{Page.isFristPage ? 'page-item disabled' : 'page-item'}">
						    <a class="page-link" href="#" onclick="openPage(this)">&#60;&#60;</a>
						</li>
						<c:forEach items = "#{Page.pageNums}"
						    var="pageItem" varStatus="pageStatus">
							<li class="#{pageItem == Page.currentPage? 'page-item active' : 'page-item'}">
							    <a class="page-link" href="#" onclick ="openPage(this)">#{pageItem}</a>
							</li>
						</c:forEach>
					    <li class="#{Page.isLastPage ? 'page-item disabled' : 'page-item'}">
					        <a class="page-link" href="#" onclick="openPage(this)">&#62;&#62;</a>
					    </li>
					    <li class="#{Page.isLastPage ? 'page-item disabled' : 'page-item'}">
					        <a class="page-link" href="#" onclick="openPage(this)"><span style="font-size: smaller;">末页</span></a>
					    </li>
					  </ul>
					</nav>
				</div>
				<div class="col-md-12" style="background-color: #D3D9DF;">
					<span style="font-size: smaller;">
					当前第#{Page.currentPage}页,
					有#{Page.endRow - Page.startRow + 1}条记录,
					共有#{Page.totalPages}页,
					总计#{Page.totalRecords}条记录</span>
				</div>
</ui:composition>
	
</html>
