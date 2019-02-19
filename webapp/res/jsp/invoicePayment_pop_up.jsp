<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:c="http://java.sun.com/jstl/core">
	
<ui:component>
<div class="modal" id="modify_pop_up" tabindex="-1" role="dialog">
	  <div class="modal-dialog modal-lg" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="myModalLabel">编辑</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	            <span aria-hidden="true">&#215;</span>
	        </button>
	      </div>
	      <div class="modal-body container-fluid">
              <div class="row">
                  <div class="col-md-12">
                      <table>
                          <tr style="display: none">
	                           <td>rowIndex:</td>
	                           <td>
	                               <input jsfc="h:inputText" size="50" maxlength="100" id="rowIndex"/>
	                           </td>
	                       </tr>
                          <tr style="display: none">
                              <td>paymentSeq:</td>
                              <td>
                                  <input jsfc="h:inputText" size="50" maxlength="100" id="paymentSeq"
                                         value="#{invoicePaymentView.invoicePayment.paymentSeq}"/>
                              </td>
                          </tr>
                          <tr style="display: none">
	                             <td>status:</td>
	                             <td>
	                                 <input jsfc="h:inputText" size="50" maxlength="100" id="paymentStatus"
	                                        value="#{invoicePaymentView.invoicePayment.status}"/>
	                             </td>
	                      </tr>
                          <tr style="display: none">
                              <td>outstandingAmount:</td>
                              <td>
                                  <input jsfc="h:inputText" size="50" maxlength="100" id="outstandingAmt"
                                         value="#{invoicePaymentView.invoicePayment.outstandingAmt}"/>
                              </td>
                          </tr>
                          <tr style="display: none">
                              <td>billingCompany:</td>
                              <td>
                                  <input jsfc="h:inputText" size="50" maxlength="100" id="billingCompany"
                                         value="#{invoicePaymentView.invoicePayment.billComp}"/>
                              </td>
                          </tr>
                          <tr>
                             <td>客户编号:</td>
                             <td>
                                 <input jsfc="h:inputText" size="50" maxlength="100" id="custId"
                                   value="#{invoicePaymentView.invoicePayment.custId}"/>
                             </td>
                          </tr>
                          <tr>
                              <td>客户名字:</td>
                              <td>
                                  <input jsfc="h:inputText" size="50" maxlength="100" id="custName"
                                         value="#{invoicePaymentView.invoicePayment.custName}"/>
                              </td>
                          </tr>
                          <tr>
                              <td>账单参考编码:</td>
                              <td>
                                  <input id="invRefNo" jsfc="h:inputText" size="50" maxlength="100"
                                          value="#{invoicePaymentView.invoicePayment.invRefNo}"/>
                              </td>
                          </tr>
                          <tr>
                              <td>最后期限:</td>
                              <td>
                                  <ui:include src="./common/common_calendar.jsp">
                                      <ui:param name="datetimepicker_Id" value="datetimepickerBankInDate"></ui:param>
                                      <ui:param name="target" value="#datetimepickerBankInDate"></ui:param>
                                      <ui:param name="inputID" value="Calendar_BankInDate"></ui:param>
                                  </ui:include>
                              </td>
                          </tr>
                          <tr style="display:none;">
                              <td>
                                  <input id="bankInDate" jsfc="h:inputText" size="50" maxlength="100"
                                          value="#{invoicePaymentView.invoicePayment.dateOfSettlement}"/>
                              </td>
                          </tr>
                          <tr>
                              <td>账单总额:</td>
                              <td>
                                  <input jsfc="h:inputText" size="50" maxlength="100" id="invAmt"/>
                              </td>
                          </tr>
                          <tr>
                              <td>付款日期:</td>
                              <td>
                                  <ui:include src="./common/common_calendar.jsp">
                                      <ui:param name="datetimepicker_Id" value="datetimepickerPaymentDate"></ui:param>
                                      <ui:param name="target" value="#datetimepickerPaymentDate"></ui:param>
                                      <ui:param name="inputID" value="Calendar_PaymentDate"></ui:param>
                                  </ui:include>
                              </td>
                          </tr>
                          <tr style="display:none;">
                              <td>
                                  <input id="paymentDate" jsfc="h:inputText" size="50" maxlength="100"
                                          value="#{invoicePaymentView.invoicePayment.paymentDate}"/>
                              </td>
                          </tr>
                          <tr>
                              <td class="labelText">付款货币:</td>
                              <td class="leftRightPadding">
                                  <select id="selectPaymentCurrency">
                                      <option value="">请选择</option>
                                      <option value="USD">USD</option>
                                      <option value="CNY">CNY</option>
                                  </select>
                                  <input style="display:none;" id="paymentCurrency" jsfc="h:inputText" size="50" maxlength="100"
                                          value="#{invoicePaymentView.invoicePayment.paymentCurrency}"/>
                              </td>
                          </tr>
                          <tr>
                              <td class="labelText">付款总额:</td>
                              <td class="leftRightPadding">
                                  <input jsfc="h:inputText" size="8" maxlength="100" id="paymentAmt"
                                          value="#{invoicePaymentView.invoicePayment.paymentAmt}"/>
                              </td>
                          </tr>
                          <tr>
                              <td class="labelText">备注:</td>
                              <td class="leftRightPadding">
                                  <input jsfc="h:inputTextarea" style="height: 40px;overflow: visible;width: 264px"
                                         value="#{invoicePaymentView.invoicePayment.settlementRemark}" id="settlementRemark"/>
                              </td>
                          </tr>
                          <tr>
                              <td class="labelText">付款人:</td>
                              <td class="leftRightPadding" >
                                  <select style="width: 145px" id="selectPayer" name="Payer" onchange="selectPayerChange(this.value)">
                                      <option value="">请选择</option>
                                  </select>
                                  <span>
                                      <input style="display:none" jsfc="h:inputText" value="#{invoicePaymentView.invoicePayment.payer}" id="inputPayer"/>
                                  </span>
                              </td>
                              <tr>
                                  <td class="labelText">付款账号:</td>
                                  <td class="leftRightPadding" >
                                  <select style="width: 145px" id="selectPayerAccount" name="PayerAccount" onchange="setSelection(this,this.value)">
                                        <option value = "">请选择</option>
                                   </select>
                                      <input style="display:none" jsfc="h:inputText" value="#{invoicePaymentView.invoicePayment.payerAccount}" id="inputPayerAccount"/>
                                  </td>
                              </tr>
                          </tr>
                          
                      </table>
                  </div>
              </div>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	        <button type="button" class="btn btn-primary" onclick="createPopUpConfirm()">保存</button>
	        <input style="display: none" jsfc="h:commandButton" value="Save" class="highlightBtn"
                   id="saveButton" action="#{invoicePaymentView.updateInvoicePayment}" />
	      </div>
	   </div>
    </div>
</div>

<div class="modal" id="history_pop_up" tabindex="-1" role="dialog">
	  <div class="modal-dialog modal-lg" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="myModalLabel">历史记录</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	            <span aria-hidden="true">&#215;</span>
	        </button>
	      </div>
	      <div class="modal-body container-fluid">
              <div class="row">
                  <div class="col-md-12">
                      <table id="history_table" class="table table-hover table-bordered table-condensed">
                          <thead>
                              <td>最后期限</td>
                              <td>付款总额</td>
                              <td>付款货币</td>
                              <td>付款人</td>
                              <td>付款账号</td>
                              <td>备注</td>
                              <td>状态</td>
                              <td>编辑日期</td>
                              <td>编辑人</td>
                          </thead>
                      </table>
                  </div>
              </div>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	      </div>
	   </div>
	</div>
</div>	


</ui:component>
</html>
