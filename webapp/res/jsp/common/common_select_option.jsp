<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:c="http://java.sun.com/jstl/core">
	
<ui:composition>
    <script type="text/javascript">
        function Change(){
            $("#form\\:option_selected").val($("#selectOption").val());
        }
    </script>
    <select id="selectOption" onchange="Change()" style="width:#{width};">
           <option value="">请选择</option>
           <c:forEach items = "#{OptionList}" var="option">
               <option value="#{option}">#{option}</option>
           </c:forEach>
    </select>
    <input style="display:none;" jsfc="h:inputText" size="20" maxlength="100" id="#{option_selected}"/>


</ui:composition>
</html>