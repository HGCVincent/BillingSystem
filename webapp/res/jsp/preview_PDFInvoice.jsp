<%@ page import="java.net.URLDecoder"%>
<%@ page import="com.billing.invoice.view.PDFInvoiceView"%>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map"%>
<%@ page import="java.io.OutputStream" %>
<%@ page import="com.itextpdf.text.DocumentException" %>
<%@ page import="org.xhtmlrenderer.pdf.ITextRenderer" %>
<%@ page import="java.io.FileOutputStream" %>
<%@ page import="org.json.JSONArray"%>
<%@ page import="net.sf.json.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PDF INVOICE</title>
</head>
<body>
     <%
        request.setCharacterEncoding("UTF-8");
        String ds = request.getParameter("name");
        JSONObject json=JSONObject.fromObject(ds);
        Map<String,Object> data = json;
        response.setContentType("application/pdf;charset=UTF-8");
        PDFInvoiceView preview = new PDFInvoiceView();
        String content = preview.freeMarkerRender(data,"CN_INVOICE");
        OutputStream oo = response.getOutputStream();
        preview.PreviewPdf(content,oo);
        oo.flush();
		oo.close();
		oo = null;
		response.flushBuffer();
		out.clear();
		out = pageContext.pushBody();
	%>
</body>
</html>