package com.billing.invoice.view;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;

import org.xhtmlrenderer.pdf.ITextFontResolver;
import org.xhtmlrenderer.pdf.ITextRenderer;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.BaseFont;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class PDFInvoiceView {

	private String TemplatePath = this.getClass().getClassLoader().getResource("/template").toString().replaceAll("file:/","");
	private String LOGO_PATH =this.getClass().getClassLoader().getResource("/images").toString();
	private String FONT = this.getClass().getClassLoader().getResource("/font/msyh.ttf").toString().replaceAll("file:/","");

	
	private static Configuration freemarkerCfg = null;
	private static String PDF_STRING = ".pdf";

	public PDFInvoiceView() {
		System.out.println(TemplatePath);
		System.out.println(LOGO_PATH);
		System.out.println(FONT);
	}

	public String freeMarkerRender(Map<String, Object> data,String htmlTmp) {
		Writer out = new StringWriter();
		try {
			freemarkerCfg =new Configuration();
			//freemarkerCfg.setClassForTemplateLoading(this.getClass(),"/template");
			freemarkerCfg.setDirectoryForTemplateLoading(new File(TemplatePath));
			freemarkerCfg.setDefaultEncoding("UTF-8");
			Template template = freemarkerCfg.getTemplate(htmlTmp+".ftl");
			template.setEncoding("UTF-8");
			template.process(data, out);
			out.flush();
			return out.toString();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return null;
	}

	public ITextRenderer iTextRenderer(String content) throws com.lowagie.text.DocumentException, IOException{
		ITextRenderer render = new ITextRenderer();
		ITextFontResolver fontResolver = render.getFontResolver();
		fontResolver.addFont(FONT, BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
		render.setDocumentFromString(content);
		render.getSharedContext().setBaseURL(LOGO_PATH);
		render.layout();
		return render;
	}

	public void createPdf(String content,String dest) throws IOException, DocumentException, com.lowagie.text.DocumentException{
		iTextRenderer(content).createPDF(new FileOutputStream(dest));
	}

	public void PreviewPdf(String content,OutputStream out) throws DocumentException, com.lowagie.text.DocumentException, IOException{
		iTextRenderer(content).createPDF(out);
	}

	

//	public String getInvoiceTemplateCodeById(String id){
//		String mx = this.getCustomerById(id).getProfile().getInvoiceTemplateCode();
//		return mx;
//	}
//
//	public List<InvoiceItemDescption> findInvoiceListItemByInvoiceId(String invoiceId){
//		List<InvoiceList> inv = this.getInvoiceListService().findInvoiceListItemByPK(invoiceId, null, null, 0, StringUtil.YES_STRING);
//		List<InvoiceItemDescption> DESList= new ArrayList<InvoiceItemDescption>();
//		List<CustomerPaymentItem> customerPaymentItemList = new ArrayList<CustomerPaymentItem>();
//		if(CollectionUtil.isNotEmptyList(inv)){
//			for(int i=0;i<inv.size();i++){
//				for(InvoiceItemDescption invoiceItemDescption : inv.get(i).getInvoiceItemDescption()){
//					customerPaymentItemList = getInvoiceListService().findCustomerPaymentItemByIdAndItemLabel1(inv.get(i).getCustomerId(),invoiceItemDescption.getItemDesc());
//					for (CustomerPaymentItem customerPaymentItem : customerPaymentItemList){
//                        if (getInvoiceListService().getUnitPrice(customerPaymentItem,invoiceItemDescption)){
//                            invoiceItemDescption.setUnitPrice(customerPaymentItem.getPricingLable());
//                        }
//                        else {
//                            invoiceItemDescption.setUnitPrice(String.valueOf(invoiceItemDescption.getPrice()));
//                        }
//                    }
//					DESList.add(invoiceItemDescption);
//				}
//			}
//			return DESList;
//		}
//		return new ArrayList<InvoiceItemDescption>();
//	}

	

}
