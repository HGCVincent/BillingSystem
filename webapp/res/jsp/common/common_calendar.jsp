<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:c="http://java.sun.com/jstl/core">
	
<ui:composition>
   <div class="input-group date" id="#{datetimepicker_Id}" data-target-input="nearest">
       <input id="#{inputID}" size="5" type="text" class="form-control datetimepicker-input" data-target="#{target}"/>
       <div class="input-group-append" data-target="#{target}" data-toggle="datetimepicker">
           <div class="input-group-text"><i class="oi oi-calendar"></i></div>
       </div>
   </div>
   
	    
	<script type="text/javascript">
		  $(function () {
		      $('#{target}').datetimepicker({
		          format: 'L'
		      });
		  });
	</script>
</ui:composition>
</html>