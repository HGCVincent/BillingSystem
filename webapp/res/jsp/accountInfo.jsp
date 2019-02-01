<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:c="http://java.sun.com/jstl/core"> 
   
<ui:composition template="./common/navbar.jsp">
    <ui:define name="content">
       <link rel="stylesheet" href="../css/open-iconic-bootstrap.css"/>
       <script type="text/javascript" src='../js/common.js'></script>
	   <script type='text/javascript' src='/BillingSystem/dwr/engine.js'></script>
	   <script type="text/javascript" src="/BillingSystem/dwr/util.js"></script>
	   <script type="text/javascript" src='../js/customer/accountInfo.js'></script>
       <script type='text/javascript' src='/BillingSystem/dwr/interface/AccountInfoView.js'></script>
       
       <div class="container-fluid">
		   <div class="row">
			   <div class="col-md-12">
					<h4>客户银行账号信息管理</h4>
			   </div>
		   </div>
	       <div class="row" style="border: 1px solid #B9BBBE; padding-bottom: 5px;">
				<div class="col-md-12" style="background-color: #34CE57;font-style: italic;">
					<strong>Search by</strong>
				</div>
				<div class="col-md-11 searchCriteria">
					<table style="margin-top: 2px;">
						<tr>
							<td>ID:</td>
							<td>	
								<input jsfc="h:inputText" value="#{accountInfoView.accountInfoCriteria.accountId}"
									   id="accountId" size="20"></input>
							</td>
							<td width="100">&#160;</td>
							
							<td>客户名字:</td>
							<td>
								<input jsfc="h:inputText" value="#{accountInfoView.accountInfoCriteria.custName}"
									   id="customerName" size="20"></input>
							</td>
						</tr>
						<tr>
							<td>银行账号名字:</td>
							<td>
								<input jsfc="h:inputText" id="accountName" size="20"></input>
							</td>
							<td width="100">&#160;</td>	
						</tr>
					</table>
				</div>
				<div class="col-md-3 offset-9" align="right">
					<button id="reset" type="button" class="btn btn-primary btn-sm"
					        onclick="resetCriteria()">
						<span class="oi oi-reload" title="icon name" aria-hidden="true">重置</span>
					</button>
					<button type="button" class="btn btn-primary btn-sm" onclick="search()">
						<span class="oi oi-magnifying-glass" title="icon name" aria-hidden="true"></span>搜索
					</button>
					<input style="display:none;" jsfc="h:commandButton" value="Search"
						   id="searchButton" onclick="showLoadingPage()"
						   action="#{accountInfoView.doSearch()}" />
				</div>
			</div>
			<c:if test="#{accountInfoView.searched}">
				<div id="details" class="row" style="border: 1px solid #B9BBBE;">
					<div class="col-md-12" style="background-color: #D3D9DF;font-style: italic;">
						<strong>Details</strong>
					</div>
					<div class="col-md-12" style="margin-top: 2px;">
						<table class="table table-hover table-bordered table-condensed">
							<thead>
								<tr>
									<td>ID</td>
									<td>客户名字</td>
									<td>客户银行账户</td>
									<td>操作</td>
								</tr>
							</thead>
							<c:forEach items = "#{accountInfoView.records}" 
							           var="accountInfo" varStatus="status">
								<tr>
									<td align="center" id="ID_#{status.index+1}">#{accountInfo.accountId}</td>
									<td align="center" id="customerName_#{status.index+1}">#{accountInfo.customerName}</td>
									<td align="center" id="accountName_#{status.index+1}">#{accountInfo.accountNameGroup}</td>
									<td align="center">
										<button id="modify_#{status.index+1}" type="button" class="btn btn-primary btn-sm" title="编辑"
										        data-toggle="modal" data-target="#accountInfo_pop_up" onclick="modify(this)">
											<span class="oi oi-pencil" title="icon name" aria-hidden="true" />
										</button>
                                    </td>
								</tr>
							</c:forEach>
						</table>
					</div>
					
					<ui:include src="./common/common_page.jsp">
					    <ui:param name="Page" value="#{accountInfoView.page}"/>
					</ui:include>
					
					<h:inputHidden id="pageNum" value="#{accountInfoView.pageNum}"></h:inputHidden>
	                <input type="hidden" id="currentPageNum" value="#{accountInfoView.page.currentPage}" />
	                <input type="hidden" id="totalPages" value="#{accountInfoView.page.totalPages}" />
				</div>
			</c:if>
		</div>
		<ui:include src="./accountInfo_pop_up.jsp"></ui:include>
    </ui:define>
</ui:composition> 

</html>