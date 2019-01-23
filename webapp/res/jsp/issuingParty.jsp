<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:c="http://java.sun.com/jsp/jstl/core"> 
   
<ui:composition template="./navbar.jsp">
    <ui:define name="content">
       <link rel="stylesheet" href="../css/open-iconic-bootstrap.css"/>
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
					<button type="button" class="btn btn-primary btn-sm">
						<span class="oi oi-magnifying-glass" title="icon name" aria-hidden="true"></span>搜索
					</button>
					<input jsfc="h:commandButton" value="Search" class="highlightBtn"
						   id="searchButton" onclick="showLoadingPage()"
						   action="#{issuingPartyView.doSearch}" />
					<button type="button" class="btn btn-primary btn-sm">
						<span class="oi oi-plus" title="add" aria-hidden="true"/>添加
					</button>
				</div>
			</div>
			<div class="row" style="border: 1px solid #B9BBBE;">
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
						<tr>
							<td>单位名称</td>
							<td>地址</td>
							<td>电话</td>
							<td>银行名字</td>
							<td>银行账号</td>
							<td>货币</td>
							<td>操作</td>
						</tr>
						<tr>
							<td>单位名称</td>
							<td>地址</td>
							<td>电话</td>
							<td>银行名字</td>
							<td>银行账号</td>
							<td>货币</td>
							<td>操作</td>
						</tr>
					</table>
				</div>
				<div class="col-md-4 offset-md-8">
					<nav aria-label="Page navigation example">
					  <ul class="pagination pagination-sm">
						<li class="page-item"><a class="page-link" href="#">
						    <span style="font-size: smaller;">首页</span>
						</a></li>
						<li class="page-item"><a class="page-link" href="#">&#60;&#60;</a></li>
						<li class="page-item"><a class="page-link" href="#">1</a></li>
						<li class="page-item"><a class="page-link" href="#">2</a></li>
						<li class="page-item"><a class="page-link" href="#">3</a></li>
						<li class="page-item"><a class="page-link" href="#">4</a></li>
						<li class="page-item"><a class="page-link" href="#">5</a></li>
						<li class="page-item"><a class="page-link" href="#">&#62;&#62;</a></li>
						<li class="page-item"><a class="page-link" href="#">
						    <span style="font-size: smaller;">末页</span>
						</a></li>
					  </ul>
					</nav>
				</div>
				<div class="col-md-12" style="background-color: #D3D9DF;">
					<span style="font-size: smaller;">当前第 页,有　条记录,共有 页,总计　条记录</span>
				</div>
			</div>
		</div>
    </ui:define>
</ui:composition> 

</html>
