package cucumber.framework.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class ReadDocxFile {

	
	public static void main(String[] args) {
		StringBuilder sBuild = new StringBuilder();
		ReadPDFFile rpdf = new ReadPDFFile();
		String strPdf = rpdf.getTextPDFOne("C:\\Users\\pollc\\OneDrive\\Desktop\\Compare-Image\\New folder\\22_agreement_1660030862-old.pdf");
		try {
			
            File file = new File("C:\\Users\\pollc\\OneDrive\\Desktop\\Compare-Image\\New folder\\22_agreement_1660030862.docx");
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            XWPFDocument document = new XWPFDocument(fis);

            List<XWPFParagraph> paragraphs = document.getParagraphs();

        	String strA = "";
        	sBuild.setLength(0);
            for (XWPFParagraph para : paragraphs) {
            	sBuild.setLength(0);
            	strA = sBuild.append(strA).append(para.getText()).append("\n").toString();
            }
            fis.close();
            System.out.println(strA.equals(strPdf));
            System.out.println(strA);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
