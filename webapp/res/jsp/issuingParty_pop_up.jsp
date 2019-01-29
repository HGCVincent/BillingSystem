<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:c="http://java.sun.com/jstl/core">
	
<ui:component>
    <div class="modal" id="issuingParty_pop_up" tabindex="-1" role="dialog">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="myModalLabel">Modal title</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	            <span aria-hidden="true">&#215;</span>
	        </button>
	      </div>
	      <div class="modal-body container-fluid">
              <div class="row">
                  <div class="col-md-12">
                      <table>
                          <tr>
                              <td>单位名称：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="pty_name"/></td>
                          </tr>
                          <tr>
                              <td>电话：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="pty_tel"/></td>
                          </tr>
                          <tr>
                              <td>地址：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="pty_addr"/></td>
                          </tr>
                          <tr>
                              <td>银行名称：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="pty_bankName"/></td>
                          </tr>
                          <tr>
                              <td>银行账号：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="pty_bankAccount"/></td>
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
                      </table>
                  </div>
              </div>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	        <button type="button" class="btn btn-primary" onclick="saveIssuingPtyInfo()">保存</button>
	      </div>
	    </div>
	  </div>
	</div>
	
	
	<div class="modal" id="delete_pop_up" tabindex="-1" role="dialog">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	            <span aria-hidden="true">&#215;</span>
	        </button>
	      </div>
	      <div class="modal-body">
	           <p>确定要删除该条记录吗？</p>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	        <button type="button" class="btn btn-primary" onclick="deleteIssuingParty_confirm()">确定</button>
	      </div>
	    </div>
	  </div>
	</div>
</ui:component>
	
</html>