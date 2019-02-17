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
       <script type="text/javascript" src='../js/invoice/taxInvoiceNum.js'></script>
       <script type='text/javascript' src='/BillingSystem/dwr/interface/TaxInvoiceNumView.js'></script>
	   <script type='text/javascript' src='/BillingSystem/dwr/engine.js'></script>
	   <script type="text/javascript" src="/BillingSystem/dwr/util.js"></script>
       
       <div class="container-fluid">
		   <div class="row">
			   <div class="col-md-12">
					<h4>发票信息管理</h4>
			   </div>
		   </div>
	       <div class="row" style="border: 1px solid #B9BBBE; padding-bottom: 5px;">
				<div class="col-md-12" style="background-color: #34CE57;font-style: italic;">
					<strong>Search by</strong>
				</div>
				<div class="col-md-11 searchCriteria">
					<table style="margin-top: 2px;">
						<tr>
							<td>发票代码:</td>
							<td>	
								<input jsfc="h:inputText" value="#{taxInvoiceNumView.taxInvoiceNumCriteria.taxInvBatch}"
									   id="taxCode" size="20"></input>
							</td>
							<td width="100">&#160;</td>
							
							<td>办公室:</td>
							<td>
							    <select id="officSelect" onchange="">
							         <option value="">All</option>
							         <option value="CargoSmart Limited">CargoSmart Limited</option>
							         <option value="CargoSmart (Zhuhai) Limited">CargoSmart (Zhuhai) Limited</option>
							    </select>
								<input style="display:none;" jsfc="h:inputText" id="officInput" size="20"></input>
							</td>
							<td width="100">&#160;</td>
							<td>发票类型:</td>
							<td>
								<select id="taxInvoiceTypeSelect" onchange="">
							         <option value="">All</option>
							         <option value="增值税专用发票">增值税专用发票</option>
							         <option value="增值税普通发票">增值税普通发票</option>
							         <option value="Dummy Tax Invoice">Dummy Tax Invoice</option>
							         <option value="Quota Special Invoice">Quota Special Invoice</option>
							    </select>
								<input style="display:none;" jsfc="h:inputText" id="taxInvoiceType" size="20"></input>
							</td>
						</tr>
						<tr>
							<td>起始时间:</td>
							<td>
								
							</td>
							<td width="100">&#160;</td>
							<td>结束时间:</td>
							<td>
								
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
					<input style="display:none" jsfc="h:commandButton" value="Search"
						   id="searchButton" onclick="showLoadingPage()"
						   action="#{taxInvoiceNumView.doSearch}" />
					<button id="buttonOfAdd" type="button" class="btn btn-primary btn-sm" title="添加"
					        onclick="createButton()">
						<span class="oi oi-plus" title="add" aria-hidden="true"/>添加
					</button>
				</div>
			</div>
			<c:if test="#{taxInvoiceNumView.searched}">
				<div id="details" class="row" style="border: 1px solid #B9BBBE;">
					<div class="col-md-12" style="background-color: #D3D9DF;font-style: italic;">
						<strong>Details</strong>
					</div>
					<div class="col-md-12" style="margin-top: 2px;">
						<table class="table table-hover table-bordered table-condensed">
							<thead>
								<tr>
									<td>发票时间</td>
									<td>发票代码</td>
									<td>发票号</td>
									<td>发票类型</td>
									<td>办公室</td>
									<td>货币</td>
									<td>付款货币</td>
									<td>购买人</td>
									<td>剩余数量</td>
									<td>备注</td>
									<td>创建人</td>
									<td>修改日期</td>
								</tr>
							</thead>
							<c:forEach items = "#{taxInvoiceNumView.taxInvoiceNumDTO}" 
							           var="taxInvoiceNum" varStatus="status">
								<tr>
								    <td align="center" id="taxDate_#{status.index+1}">
								        <h:outputText value="#{taxInvoiceNum.taxDate}">
											<f:convertDateTime locale="en" type="date" dateStyle="medium"
															   pattern="yyyy/MM/dd"/>
										</h:outputText>
								    </td>
									<td align="center" id="taxInvBatch_#{status.index+1}">#{taxInvoiceNum.taxInvBatch}</td>
									<c:if test="#{taxInvoiceNum.taxFrom == taxInvoiceNum.taxTo}">
									    <td align="center" id="invId_#{status.index+1}">#{taxInvoiceNum.invId}</td>
									</c:if>
									<c:if test="#{taxInvoiceNum.taxFrom != taxInvoiceNum.taxTo}">
										<td align="center" id="invId2_#{status.index+1}">#{taxInvoiceNum.taxFrom}-#{taxInvoiceNum.taxTo}</td>
									</c:if>
									<td align="center" id="taxInvType_#{status.index+1}">#{taxInvoiceNum.taxInvType}</td>
									<td align="center" id="office_#{status.index+1}">#{taxInvoiceNum.office}</td>
									<td align="center" id="currency_#{status.index+1}">#{taxInvoiceNum.currency}</td>
									<td align="center" id="paymentCurrency_#{status.index+1}">#{taxInvoiceNum.paymentCurrency}</td>
									<td align="center" id="assignTo_#{status.index+1}">#{taxInvoiceNum.assignTo}</td>
									<td align="center" id="remainNum_#{status.index+1}">#{taxInvoiceNum.remainNum}</td>
									<td align="center" id="remarks_#{status.index+1}">#{taxInvoiceNum.remarks}</td>
									<td align="center" id="createBy_#{status.index+1}">#{taxInvoiceNum.createBy}</td>
									<td align="center" id="modifyDate_#{status.index+1}">
									    <h:outputText value="#{taxInvoiceNum.modifyDate}">
										    <f:convertDateTime locale="en" type="date" dateStyle="medium"
															   pattern="yyyy/MM/dd"/>
										</h:outputText>
									</td>
								</tr>
							</c:forEach>
						</table>
					</div>
					<ui:include src="./common/common_page.jsp">
					    <ui:param name="Page" value="#{taxInvoiceNumView.page}"/>
					</ui:include>
					
					<h:inputHidden id="pageNum" value="#{taxInvoiceNumView.pageNum}"></h:inputHidden>
	                <input type="hidden" id="currentPageNum" value="#{taxInvoiceNumView.page.currentPage}" />
	                <input type="hidden" id="totalPages" value="#{taxInvoiceNumView.page.totalPages}" />
	               
				</div>
			</c:if>
		</div>
		<ui:include src="./taxInvoiceNum_pop_up.jsp"></ui:include>
    </ui:define>
</ui:composition> 

</html>
