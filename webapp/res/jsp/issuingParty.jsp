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
       <script type="text/javascript" src='../js/invoice/issuingParty.js'></script>
       
       <div class="container-fluid">
		   <div class="row">
			   <div class="col-md-12">
					<h4>开票单位管理</h4>
			   </div>
		   </div>
	       <div class="row" style="border: 1px solid #B9BBBE; padding-bottom: 5px;">
				<div class="col-md-12" style="background-color: #34CE57;font-style: italic;">
					<strong>Search by</strong>
				</div>
				<div class="col-md-11 searchCriteria">
					<table style="margin-top: 2px;">
						<tr>
							<td>单位名称:</td>
							<td>	
								<input jsfc="h:inputText" value=""
									   id="partyName" size="20"></input>
							</td>
							<td width="100">&#160;</td>
							
							<td>地址:</td>
							<td>
								<input jsfc="h:inputText" value=""
									   id="partyAddress" size="20"></input>
							</td>
						</tr>
						<tr>
							<td>账号:</td>
							<td>
								<input jsfc="h:inputText" value=""
									   id="Account" size="20"></input>
							</td>
							<td width="100">&#160;</td>
							
							<td>银行名称:</td>
							<td>
							    <input jsfc="h:inputText" value=""
								       id="bankName" size="20"></input>
							</td>
						</tr>
					</table>
				</div>
				<div class="col-md-3 offset-9" align="right">
					<button type="button" class="btn btn-primary btn-sm">
						<span class="oi oi-reload" title="icon name" aria-hidden="true">重置</span>
					</button>
					<button type="button" class="btn btn-primary btn-sm" onclick="search()">
						<span class="oi oi-magnifying-glass" title="icon name" aria-hidden="true"></span>搜索
					</button>
					<input style="display:none" jsfc="h:commandButton" value="Search"
						   id="searchButton" onclick="showLoadingPage()"
						   action="#{issuingPartyView.doSearch}" />
					<button type="button" class="btn btn-primary btn-sm">
						<span class="oi oi-plus" title="add" aria-hidden="true"/>添加
					</button>
				</div>
			</div>
			<c:if test="#{issuingPartyView.searched}">
				<div id="details" class="row" style="border: 1px solid #B9BBBE;">
					<div class="col-md-12" style="background-color: #D3D9DF;font-style: italic;">
						<strong>Details</strong>
					</div>
					<div class="col-md-12" style="margin-top: 2px;">
						<table class="table table-hover table-bordered table-condensed">
							<thead>
								<tr>
									<td>单位名称</td>
									<td>地址</td>
									<td>电话</td>
									<td>银行名字</td>
									<td>银行账号</td>
									<td>货币</td>
									<td>操作</td>
								</tr>
							</thead>
							<c:forEach items = "#{issuingPartyView.records}" 
							           var="issuingParty" varStatus="status">
								<tr>
									<td align="center" id="partyName_#{status.index}">#{issuingParty.partyName}</td>
									<td align="center" id="partyAddr_#{status.index+1}">#{issuingParty.address}</td>
									<td align="center" id="partyTel_#{status.index+1}">#{issuingParty.partyTel}</td>
									<td align="center" id="partyBankName_#{status.index+1}">#{issuingParty.bankName}</td>
									<td align="center" id="partyBankAccount_#{status.index+1}">#{issuingParty.bankAccount}</td>
									<td align="center" id="partyBankCurrency_#{status.index+1}">#{issuingParty.currency}</td>
									<td align="center">操作</td>
								</tr>
							</c:forEach>
						</table>
					</div>
					
					<ui:include src="./common/common_page.jsp">
					    <ui:param name="Page" value="#{issuingPartyView.page}"/>
					</ui:include>
					
					<h:inputHidden id="pageNum" value="#{issuingPartyView.pageNum}"></h:inputHidden>
	                <input type="hidden" id="currentPageNum" value="#{issuingPartyView.page.currentPage}" />
	                <input type="hidden" id="totalPages" value="#{issuingPartyView.page.totalPages}" />
				</div>
			</c:if>
		</div>
    </ui:define>
</ui:composition> 

</html>
