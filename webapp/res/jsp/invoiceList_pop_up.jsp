<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:c="http://java.sun.com/jstl/core">
	
<ui:component>
<div class="modal" id="create_pop_up" tabindex="-1" role="dialog">
	  <div class="modal-dialog modal-lg" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="myModalLabel">添加</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	            <span aria-hidden="true">&#215;</span>
	        </button>
	      </div>
	      <div class="modal-body container-fluid">
              <div class="row">
                  <div class="col-md-12">
                      <table>
                          <tr>
                              <td>账单编号：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="create_invId"
                                         readonly="true" style="border:none;"/></td>
                          </tr>
                          <tr>
                              <td>账单参考编码：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="create_invRefNo"
                                         readonly="true" style="border:none;"/></td>
                          </tr>
                          <tr>
                              <td>客户编号：</td>
                              <td>
                                  <input jsfc="h:inputText" size="20" maxlength="100" id="create_custId"
                                         onblur="getCustomerInfo()"/>
                              </td>
                          </tr>
                          <tr>
                              <td>客户姓名：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="create_custName"/></td>
                          </tr>
                          <tr>
                              <td>账单日期：</td>
                              <td>
                                  <ui:include src="./common/common_calendar.jsp">
                                      <ui:param name="datetimepicker_Id" value="datetimepickerInvDate"></ui:param>
                                      <ui:param name="target" value="#datetimepickerInvDate"></ui:param>
                                      <ui:param name="inputID" value="Calendar_invDT"></ui:param>
                                  </ui:include>
                              </td>
                          </tr>
                          <tr>
                              <td>开票单位：</td>
                              <td>
                                  <ui:include src="./common/common_select_option.jsp">
                                      <ui:param name="OptionList" value="#{invoiceListView.issuingParties}"></ui:param>
                                      <ui:param name="option_selected" value="issuing_party_selected"></ui:param>
                                      <ui:param name="width" value="200px"></ui:param>
                                  </ui:include>
                              </td>
                          </tr>
                          <tr>
                              <td>银行账户信息：</td>
                              <table id="item_tbale" class="table table-bordered table-condensed">
                                      <thead>
                                          <tr>
                                              <td>项目描述</td>
                                              <td>起始时间</td>
                                              <td>结束时间</td>
                                              <td>价格</td>
                                              <td>数量</td>
                                              <td>货币</td>
                                              <td>总数</td>
                                          </tr>
                                      </thead>
                                      <tr>
                                       <td>
                                           <input type="text" name="item_desc" id="item_desc1" size="10" maxlength="100"
                                                   style="border:none;"/>
                                       </td>
                                       <td>
                                           <ui:include src="./common/common_calendar.jsp">
		                                      <ui:param name="datetimepicker_Id" value="datetimepickerStarTime"></ui:param>
		                                      <ui:param name="target" value="#datetimepickerStarTime"></ui:param>
		                                      <ui:param name="inputID" value="Calendar_starDT1"></ui:param>
		                                  </ui:include>
                                       </td> 
                                       <td>
                                           <ui:include src="./common/common_calendar.jsp">
		                                      <ui:param name="datetimepicker_Id" value="datetimepickerEndTime"></ui:param>
		                                      <ui:param name="target" value="#datetimepickerEndTime"></ui:param>
		                                      <ui:param name="inputID" value="Calendar_endDT1"></ui:param>
		                                  </ui:include>
                                       </td>
                                       <td>
                                           <input type="text" name="inv_price" id="inv_price1" size="2" maxlength="100"
                                                  style="border:none;"/>
                                       </td>
                                       <td>
                                           <input type="text" name="txn_quantity" id="txn_quantity1" size="1" maxlength="100"
                                                  style="border:none;"/>
                                       </td>
                                       <td>
                                           <select id='selectOption1' onchange='Change()' style='width:80px;'>
					    		               <option value=''>请选择</option>
					    		               <option value='USD'>USD</option>
					    		               <option value='CNY'>CNY</option>
					    		           </select>
					    		           <input style='display:none;' size='20' maxlength='100' id='option_selected1'/>
					    		           <script type='text/javascript'>function Change(){$('#option_selected1').val($('#selectOption1').val());}</script>
                                       </td>
                                       <td>
                                           <input type="text" name="inv_amt1" id="inv_amt" size="5" maxlength="100"
                                                  style="border:none;"/>
                                       </td>
                                   </tr>
                              </table>
                              <input type="text" id="index" style="display:none;"/>
                              <a id="addBank_tr" onclick="addModifytr()" href="javascript:void(0)">添加</a>
                          </tr>
                      </table>
                  </div>
              </div>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	        <button type="button" class="btn btn-primary" onclick="createPopUpConfirm()">保存</button>
	      </div>
	    </div>
	  </div>
	</div>

</ui:component>
</html>
      