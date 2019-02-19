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
       <script type="text/javascript" src='../js/invoice/invoicePayment.js'></script>
       <script type='text/javascript' src='/BillingSystem/dwr/interface/InvoicePaymentView.js'></script>
	   <script type='text/javascript' src='/BillingSystem/dwr/engine.js'></script>
	   <script type="text/javascript" src="/BillingSystem/dwr/util.js"></script>
       
       <div class="container-fluid">
		   <div class="row">
			   <div class="col-md-12">
					<h4>付款情况</h4>
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
								<input jsfc="h:inputText" value="#{invoicePaymentView.invoicePaymentCriteria.custId}"
									   id="customerId" size="18"></input>
							</td>
							<td width="60">&#160;</td>
							
							<td>客户名字:</td>
							<td>
								<input jsfc="h:inputText" value="#{invoicePaymentView.invoicePaymentCriteria.custName}"
								       id="customerName" size="18"></input>
							</td>
							<td width="60">&#160;</td>
							<td style="width:110px;">账单参考编码:</td>
							<td>
								<input jsfc="h:inputText" value="#{invoicePaymentView.invoicePaymentCriteria.invRefNo}"
								       id="invoiceRefNo" size="18"></input>
							</td>
						</tr>
						<tr>
							<td style="width:110px;">账单所属公司:</td>
							<td>
								<select id="officSelect" onchange="">
							         <option value="">All</option>
							         <option value="CargoSmart Limited">CargoSmart Limited</option>
							         <option value="CargoSmart (Zhuhai) Limited">CargoSmart (Zhuhai) Limited</option>
							    </select>
								<input style="display:none;" jsfc="h:inputText" id="officInput" size="20"
								       value="#{invoicePaymentView.invoicePaymentCriteria.billComp}"></input>
							</td>
							<td width="100">&#160;</td>
							<td style="width:110px;">账单起始月份:</td>
							<td>
								
							</td>
							<td width="100">&#160;</td>
							<td>账单结束月份:</td>
							<td>
								
							</td>
							<td width="100">&#160;</td>
						</tr>
						<tr>
							<td>剩余总额:</td>
							<td>
								<select id="selectOutstandingAmt" onchange="">
							         <option value="">All</option>
							         <option value="已结清">已结清</option>
							         <option value="未结清">未结清</option>
							    </select>
								<input style="display:none;" jsfc="h:inputText" id="outstandingAmountt" size="20"
								       value="#{invoicePaymentView.invoicePaymentCriteria.outstandingAmt}"></input>
							</td>
							<td width="100">&#160;</td>
							<td>状态:</td>
							<td>
								<select id="selectStatus" onchange="">
							         <option value="">All</option>
							         <option value="已结清">已结清</option>
							         <option value="未结清">未结清</option>
							         <option value="已取消">已取消</option>
							    </select>
								<input style="display:none;" jsfc="h:inputText" id="Status" size="20"
								       value="#{invoicePaymentView.invoicePaymentCriteria.status}"></input>
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
						   action="#{invoicePaymentView.doSearch}" />
				</div>
			</div>
			<c:if test="#{invoicePaymentView.searched}">
				<div id="details" class="row" style="border: 1px solid #B9BBBE;">
					<div class="col-md-12" style="background-color: #D3D9DF;font-style: italic;">
						<strong>Details</strong>
					</div>
					<div class="col-md-12" style="margin-top: 2px;">
						<table class="table table-hover table-bordered table-condensed">
							<thead>
								<tr>
									<td>账单参考编码</td>
									<td>客户编号</td>
									<td>客户名字</td>
									<td>账单所属公司</td>
									<td>账单日期</td>
									<td>账单货币</td>
									<td>账单总额</td>
									<td>付款货币</td>
									<td>付款总额</td>
									<td>未付清总额</td>
									<td>付款人</td>
									<td>付款账号</td>
									<td>付款日期</td>
									<td>最后期限</td>
									<td>账单所属月份</td>
									<td>状态</td>
									<td>编辑人</td>
									<td>编辑日期</td>
									<td>操作</td>
								</tr>
							</thead>
							<c:forEach items = "#{invoicePaymentView.invoicePaymentDTOs}" 
							           var="invoicePayment" varStatus="status">
								<tr>
								    <td style="display:none;" align="center" id="paymentSeq_#{status.index+1}">#{invoicePayment.paymentSeq}</td>
								    <td style="display:none;" align="center" id="paymentId_#{status.index+1}">#{invoicePayment.paymentId}</td>
								    <td align="center" id="invRefNo_#{status.index+1}">#{invoicePayment.invRefNo}</td>
								    <td align="center" id="custId_#{status.index+1}">#{invoicePayment.custId}</td>
								    <td align="center" id="custName_#{status.index+1}">#{invoicePayment.custName}</td>
								    <td align="center" id="billComp_#{status.index+1}">#{invoicePayment.billComp}</td>
								    
								    <td align="center" id="invoiceDate_#{status.index+1}">
									    <h:outputText value="#{invoicePayment.invoiceDate}">
										    <f:convertDateTime locale="en" type="date" dateStyle="medium"
															   pattern="yyyy/MM/dd"/>
										</h:outputText>
									</td>
								    
								    <td align="center" id="invoiceCurrency_#{status.index+1}">#{invoicePayment.invoiceCurrency}</td>
								    <td align="center" id="invoiceAmt_#{status.index+1}">#{invoicePayment.invoiceAmt}</td>
								    <td align="center" id="paymentCurrency_#{status.index+1}">#{invoicePayment.paymentCurrency}</td>
								    <td align="center" id="paymentAmt_#{status.index+1}">#{invoicePayment.paymentAmt}</td>
								    <td align="center" id="outstandingAmt_#{status.index+1}">#{invoicePayment.outstandingAmt}</td>
								    <td align="center" id="payer_#{status.index+1}">#{invoicePayment.payer}</td>
								    <td align="center" id="payerAccount_#{status.index+1}">#{invoicePayment.payerAccount}</td>
								    
								    <td align="center" id="paymentDate_#{status.index+1}">
									    <h:outputText value="#{invoicePayment.paymentDate}">
										    <f:convertDateTime locale="en" type="date" dateStyle="medium"
															   pattern="yyyy/MM/dd"/>
										</h:outputText>
									</td>
									
									<td align="center" id="dateOfSettlement_#{status.index+1}">
									    <h:outputText value="#{invoicePayment.dateOfSettlement}">
										    <f:convertDateTime locale="en" type="date" dateStyle="medium"
															   pattern="yyyy/MM/dd"/>
										</h:outputText>
									</td>
								    
								    <td align="center" id="currentMonth_#{status.index+1}">#{invoicePayment.currentMonth}</td>
								    <td align="center" id="status_#{status.index+1}">#{invoicePayment.status}</td>
								    <td align="center" id="modifyBy_#{status.index+1}">#{invoicePayment.modifyBy}</td>
								    
								    <td align="center" id="modifyDate_#{status.index+1}">
									    <h:outputText value="#{invoicePayment.modifyDate}">
										    <f:convertDateTime locale="en" type="date" dateStyle="medium"
															   pattern="yyyy/MM/dd"/>
										</h:outputText>
									</td>
								    
								    <td align="center">
									    <button id="confirm_#{status.index+1}" type="button" class="btn btn-primary btn-sm" title="历史"
											        onclick="historyButton(this)">
												<span class="oi oi-script" title="icon name" aria-hidden="true" />
									    </button>
									    <c:if test="${invoicePayment.status == '未付清'}">
											<button id="modify_#{status.index+1}" type="button" class="btn btn-primary btn-sm" title="编辑"
											        onclick="modifyButton(this)">
												<span class="oi oi-pencil" title="icon name" aria-hidden="true" />
											</button>
									    </c:if>
									</td>
									
								</tr>
							</c:forEach>
						</table>
					</div>
					<ui:include src="./common/common_page.jsp">
					    <ui:param name="Page" value="#{invoicePaymentView.page}"/>
					</ui:include>
					
					<h:inputHidden id="pageNum" value="#{invoicePaymentView.pageNum}"></h:inputHidden>
	                <input type="hidden" id="currentPageNum" value="#{invoicePaymentView.page.currentPage}" />
	                <input type="hidden" id="totalPages" value="#{invoicePaymentView.page.totalPages}" />
	               
				</div>
			</c:if>
		</div>
		<ui:include src="./invoicePayment_pop_up.jsp"></ui:include>
    </ui:define>
</ui:composition> 

</html>
