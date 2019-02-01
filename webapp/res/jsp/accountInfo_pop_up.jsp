<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:c="http://java.sun.com/jstl/core">
	
<ui:component>
    <div class="modal" id="account_pop_up" tabindex="-1" role="dialog">
	  <div class="modal-dialog modal-lg" role="document">
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
                              <td>ID:</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="account_id"
                                    readonly="true" style="border:none"/></td>
                          </tr>
                          <tr>
                              <td>客户名称：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="cust_name"
                                  readonly="true" style="border:none"/></td>
                          </tr>
                          <tr>
                              <td>银行账户信息：</td>
                              <table id="bank_tbale" class="table table-hover table-bordered table-condensed">
                                  <thead>
                                      <td>默认</td>
                                      <td>银行名称</td>
                                      <td>银行账号</td>
                                      <td>操作</td>
                                  </thead>
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
	        <button type="button" class="btn btn-primary" onclick="popUpConfirm()">保存</button>
	      </div>
	    </div>
	  </div>
	</div>

    
</ui:component>
</html>