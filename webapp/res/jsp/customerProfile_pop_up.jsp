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
                              <td>编号：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="create_id"/></td>
                          </tr>
                          <tr>
                              <td>客户名称：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="create_name"/></td>
                          </tr>
                          <tr>
                              <td>名称缩写：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="create_shortname"/></td>
                          </tr>
                          <tr>
                              <td>语言：</td>
                              <td>
                                  <select id="selectOption_lang" onchange="languageChange()">
			                          <option value="">请选择</option>
			                          <option value="中文">中文</option>
			                          <option value="英文">英文</option>
			                          <option value="粤语">粤语</option>
                      			  </select> 
                                  <input style="display:none;" jsfc="h:inputText" size="20" maxlength="100" id="create_lang"/></td>
                          </tr>
                          <tr>
                              <td>国家：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="create_country"/></td>
                          </tr>
                          <tr>
                              <td>城市：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="create_city"/></td>
                          </tr>
                          <tr>
                              <td>县：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="create_county"/></td>
                          </tr>
                          <tr>
                              <td>公司法人：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="create_admin"/></td>
                          </tr>
                          <tr>
                              <td>公司法人电话：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="create_adminTel"/></td>
                          </tr>
                          <tr>
                              <td>公司法人邮箱：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="create_adminEmail"/></td>
                          </tr>
                          <tr>
                              <td>公司联系人：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="create_acct"/></td>
                          </tr>
                          <tr>
                              <td>公司联系人电话：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="create_acctTel"/></td>
                          </tr>
                          <tr>
                              <td>公司联系人邮箱：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="create_acctEmail"/></td>
                          </tr>
                          <tr>
                              <td>地址1：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="create_addr1"/></td>
                          </tr>
                          <tr>
                              <td>地址2：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="create_addr2"/></td>
                          </tr>
                          <tr>
                              <td>地址3：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="create_addr3"/></td>
                          </tr>
                          <tr>
                              <td>地址4：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="create_addr4"/></td>
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
	
	<div class="modal" id="more_pop_up" tabindex="-1" role="dialog">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="myModalLabel">更多</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	            <span aria-hidden="true">&#215;</span>
	        </button>
	      </div>
	      <div class="modal-body container-fluid">
	          <div class="row">
	              <div class="col-md-12" align="right" height="">
	                   <button id="save" style="display:none;" type="button" class="btn btn-primary btn-sm" onclick="morePopUpConfirm()">保存</button>
	                   <button type="button" class="btn btn-primary btn-sm" onclick="ModifyCustmorInfo()">编辑</button>
	              </div>
	          </div>
              <div class="row">
                  <div class="col-md-12">
                      <table>
                          <tr style="display:none;">
                              <td>id：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="more_id"
                                   readonly="true" style="border:none;"/>
                              </td>
                          </tr>
                          <tr>
                              <td>公司法人：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="more_admin"
                                   readonly="true" style="border:none;"/>
                              </td>
                          </tr>
                          <tr>
                              <td>公司法人电话：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="more_adminTel"
                                    readonly="true" style="border:none;"/>
                              </td>
                          </tr>
                          <tr>
                              <td>公司法人邮箱：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="more_adminEmail"
                                      readonly="true" style="border:none;"/>
                              </td>
                          </tr>
                          <tr>
                              <td>公司联系人：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="more_acct"
                                      readonly="true" style="border:none;"/>
                              </td>
                          </tr>
                          <tr>
                              <td>公司联系人电话：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="more_acctTel"
                                         readonly="true" style="border:none;"/>
                              </td>
                          </tr>
                          <tr>
                              <td>公司联系人邮箱：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="more_acctEmail"
                                         readonly="true" style="border:none;"/>
                              </td>
                          </tr>
                          <tr>
                              <td>地址1：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="more_addr1"
                                         readonly="true" style="border:none;"/>
                              </td>
                          </tr>
                          <tr>
                              <td>地址2：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="more_addr2"
                                         readonly="true" style="border:none;"/>
                              </td>
                          </tr>
                          <tr>
                              <td>地址3：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="more_addr3"
                                         readonly="true" style="border:none;"/>
                              </td>
                          </tr>
                          <tr>
                              <td>地址4：</td>
                              <td><input jsfc="h:inputText" size="20" maxlength="100" id="more_addr4"
                                          readonly="true" style="border:none;"/>
                              </td>
                          </tr>
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