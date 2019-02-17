<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:c="http://java.sun.com/jstl/core">
	
<ui:component>
    <div class="modal" id="create_pop_up" tabindex="-1" role="dialog">
	  <div class="modal-dialog" role="document">
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
                              <td>发票类型：</td>
                              <td>
                                  <select id="taxInvType" style="width:275px;">
                                       <option value="">All</option>
                                       <option value="增值税专用发票">增值税专用发票</option>
                                       <option value="增值税普通发票">增值税普通发票</option>
                                       <option value="Dummy Tax Invoice">Dummy Tax Invoice</option>
                                       <option value="Quota Special Invoice">Quota Special Invoice</option>
                                  </select>
                              </td>
                          </tr>
                          <tr>
                              <td>发票时间：</td>
                              <td>
                                  <ui:include src="./common/common_calendar.jsp">
                                      <ui:param name="datetimepicker_Id" value="taxDate"></ui:param>
                                      <ui:param name="target" value="#taxDate"></ui:param>
                                      <ui:param name="inputID" value="Calendar_taxDate"></ui:param>
                                  </ui:include>
                              </td>
                          </tr>
                          <tr>
                              <td>发票代码：</td>
                              <td><input jsfc="h:inputText" size="28" maxlength="100" id="taxInvBatch"/></td>
                          </tr>
                          <tr>
                              <td>起始发票号：</td>
                              <td><input jsfc="h:inputText" size="28" maxlength="100" id="taxInv_No_From"/></td>
                          </tr>
                          <tr>
                              <td>结束发票号：</td>
                              <td><input jsfc="h:inputText" size="28" maxlength="100" id="taxInv_No_To"/></td>
                          </tr>
                          <tr>
                              <td>办公室：</td>
                              <td>
                                  <select id="office" style="width:275px;">
                                      <option value="">请选择</option>
                                      <option value="CargoSmart Limited">CargoSmart Limited</option>
                                      <option value="CargoSmart (Zhuhai) Limited">CargoSmart (Zhuhai) Limited</option>
                                  </select>
                              </td>
                          </tr>
                          <tr>
                              <td>货币：</td>
                              <td>
                                  <select id="selectOption_currency">
			                          <option value="">请选择</option>
			                          <option value="USD">USD</option>
			                          <option value="CNY">CNY</option>
                      			  </select>
                              </td>
                          </tr>
                          <tr>
                              <td>购买人：</td>
                              <td>
                                  <select id="selectOption_assignTo">
			                          <option value="">请选择</option>
			                          <option value="小王">小王</option>
			                          <option value="小黄">小黄</option>
                      			  </select>
                              </td>
                          </tr>
                          <tr>
                              <td>备注:</td>
                              <td>
                                  <input jsfc="h:inputTextarea" style="height: 40px;overflow: visible;width: 264px" id="remarks"/>
                              </td>
                          </tr>
                      </table>
                  </div>
              </div>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	        <button type="button" class="btn btn-primary" onclick="popUpConfirm()">保存</button>
	      </div>
	    </div>
	  </div>
	</div>
</ui:component>
</html>