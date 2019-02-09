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
       <script type="text/javascript" src='../js/invoice/invoiceList.js'></script>
       <script type='text/javascript' src='/BillingSystem/dwr/interface/InvoiceListView.js'></script>
	   <script type='text/javascript' src='/BillingSystem/dwr/engine.js'></script>
	   <script type="text/javascript" src="/BillingSystem/dwr/util.js"></script>
       
       <div class="container-fluid">
		   <div class="row">
			   <div class="col-md-12">
					<h4>系统账单管理</h4>
			   </div>
		   </div>
	       <div class="row" style="border: 1px solid #B9BBBE; padding-bottom: 5px;">
				<div class="col-md-12" style="background-color: #34CE57;font-style: italic;">
					<strong>Search by</strong>
				</div>
				<div class="col-md-11 searchCriteria">
					<table style="margin-top: 2px;">
						<tr>
							<td>客户编号:</td>
							<td>	
								<input jsfc="h:inputText" value="#{invoiceListView.invoiceListCriteria.custId}"
									   id="partyName" size="20"></input>
							</td>
							<td width="100">&#160;</td>
							
							<td>客户名称:</td>
							<td>
								<input jsfc="h:inputText" value="#{invoiceListView.invoiceListCriteria.custName}"
									   id="partyAddress" size="20"></input>
							</td>
						</tr>
						<tr>
							<td>账单编号:</td>
							<td>
								<input jsfc="h:inputText" value="#{invoiceListView.invoiceListCriteria.invId}"
									   id="Account" size="20"></input>
							</td>
							<td width="100">&#160;</td>
							
							<td>账单参考编码:</td>
							<td>
							    <input jsfc="h:inputText" value="#{invoiceListView.invoiceListCriteria.referenceNo}"
								       id="bankName" size="20"></input>
							</td>
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
						   action="#{invoiceListView.doSearch}" />
					<button id="buttonOfAdd" type="button" class="btn btn-primary btn-sm" title="添加"
					        onclick="createButton()">
						<span class="oi oi-plus" title="add" aria-hidden="true"/>添加
					</button>
				</div>
			</div>
			<c:if test="#{invoiceListView.searched}">
				<div id="details" class="row" style="border: 1px solid #B9BBBE;">
					<div class="col-md-12" style="background-color: #D3D9DF;font-style: italic;">
						<strong>Details</strong>
					</div>
					<div class="col-md-12" style="margin-top: 2px;">
						<table class="table table-hover table-bordered table-condensed">
							<thead>
								<tr>
									<td name="breakByInvIdLevel"><input type="checkbox" id="allChecks" onclick="checkAll()"/>全选</td>
									<td>账单编号</td>
									<td>账单参考编码</td>
									<td>开票单位</td>
									<td>客户编号</td>
									<td>客户名称 </td>
									<td>所属月份 </td>
									<td>货币</td>
									<td>总金额</td>
									<td>账单类型</td>
									<td>账单状态</td>
									<td>版本号</td>
									<td>操作人</td>
									<td>操作日期</td>
									<td>操作</td>
								</tr>
							</thead>
							<c:forEach items = "#{invoiceListView.dtoRecords}" 
							           var="invoice_list_info" varStatus="status">
							    <tr>
							        <td align="center" style="display:none">
							            <h:outputText id="InvDt_#{status.index+1}"
											value="#{invoice_list_info.invDt}">
											<f:convertDateTime locale="en" type="date" dateStyle="medium"
												pattern="MM/dd/yyyy" />
									    </h:outputText>
							        </td>
									<td align="center" id="Id_#{status.index+1}" style="display: none;">#{invoice_list_info.seqId}</td>
									<td align="center" name="breakByInvIdLevel" id="batchOptions_#{status.index+1}"> 
										<input type="checkbox" name="invListCheckBox"/>
									</td>
									<td align="center" id="invId_#{status.index+1}">#{invoice_list_info.invId}</td>
									<td align="center" id="invRefNum_#{status.index+1}">#{invoice_list_info.invRefNo}</td>
									<td align="center" id="billComp_#{status.index+1}">#{invoice_list_info.billComp}</td>
									<td align="center" id="custId_#{status.index+1}">#{invoice_list_info.custId}</td>
									<td align="center" style="width:150px" id="custName_#{status.index+1}">#{invoice_list_info.custName}</td>
									<td align="center" id="currentMonth_#{status.index+1}">#{invoice_list_info.currentMonth}</td>
									<td align="center" id="currency_#{status.index+1}"></td>
									<td align="center" id="amt_#{status.index+1}"></td>
									<td align="center" id="invType_#{status.index+1}"></td>
									<td align="center" id="invStatus_#{status.index+1}">#{invoice_list_info.invStatus}</td>
									<td align="center" name="invVersionValue" id="invVersion_#{status.index+1}">#{invoice_list_info.invVersion}</td>
									<td align="center" name="breakByInvIdLevel" id="modifyBy_#{status.index+1}">#{invoice_list_info.modifyBy}</td>
									<td align="center" name="breakByInvIdLevel" id="modifyDt_#{status.index+1}">
										<h:outputText
											value="#{invoice_list_info.modifyDt}">
											<f:convertDateTime locale="en" type="date" dateStyle="medium"
												pattern="yyyy/MM/dd" />
									    </h:outputText>
									</td>
									<td align="center">
									    <c:if test="${invoice_list_info.invStatus == '待确认'}">
											<button id="confirm_#{status.index+1}" type="button" class="btn btn-primary btn-sm" title="确认"
											        onclick="confirmButton(this)">
												<span class="oi oi-check" title="icon name" aria-hidden="true" />
											</button>
											<button id="modify_#{status.index+1}" type="button" class="btn btn-primary btn-sm" title="编辑"
											        onclick="modifyButton(this)">
												<span class="oi oi-pencil" title="icon name" aria-hidden="true" />
											</button>
									    </c:if>
									    <c:if test="${invoice_list_info.invStatus == '已确认'}">
									        <button id="confirm_#{status.index+1}" type="button" class="btn btn-primary btn-sm" title="取消"
											        onclick="cancelButton(this)">
												<span class="oi oi-action-undo" title="icon name" aria-hidden="true" />
											</button>
									    </c:if>
									</td>
								</tr>	
							</c:forEach>
						</table>
					</div>
					<ui:include src="./common/common_page.jsp">
					    <ui:param name="Page" value="#{invoiceListView.page}"/>
					</ui:include>
					
					<h:inputHidden id="pageNum" value="#{invoiceListView.pageNum}"></h:inputHidden>
	                <input type="hidden" id="currentPageNum" value="#{invoiceListView.page.currentPage}" />
	                <input type="hidden" id="totalPages" value="#{invoiceListView.page.totalPages}" />
				</div>
			</c:if>
		</div>
		<ui:include src="./common/common_alert.jsp">
		    <ui:param name="id" value = "confirm_pop_up" />
		    <ui:param name="message" value = "确定把该条账单的状态改为'确认'吗？" />
		    <ui:param name="onclickFunction" value = "confirmPopUp()"/>
		</ui:include>
		<ui:include src="./common/common_alert.jsp">
		    <ui:param name="id" value = "cancel_pop_up" />
		    <ui:param name="message" value = "确定取消该条账单吗？" />
		    <ui:param name="onclickFunction" value = "cancelPopUp()"/>
		</ui:include>
		<ui:include src="./invoiceList_pop_up.jsp"></ui:include>
    </ui:define>
</ui:composition> 

</html>
