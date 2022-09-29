package cucumber.framework.utils;

import java.io.File;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadPDFFile {

	PDDocument pd;
	File input;
	String pageText;
	PDFTextStripper stripper;
	
	public static void main(String[] args){
		
	 ReadPDFFile rPDFF = new ReadPDFFile();
	 
	 String strA = rPDFF.getTextPDFOne("C:\\Users\\pollc\\OneDrive\\Desktop\\Compare-Image\\New folder\\22_agreement_1660030862-old.pdf");
	 String strB = rPDFF.getTextPDFOne("C:\\Users\\pollc\\OneDrive\\Desktop\\Compare-Image\\New folder\\22_agreement_1660030862.pdf");
//	 System.out.println(strA);
	 System.out.println(strB);
//	 System.out.println(strB.equals(strA));
     }
 
	 public String getTextPDFOne(String absPath) {
		 		try {
					 input = new File(absPath);
				     pd = PDDocument.load(input);				     
				     stripper = new PDFTextStripper();
				     pageText = stripper.getText(pd);
				} catch (Exception e){
			     System.out.println(e.getMessage());
			    }
		 		
		 return pageText;
	 }

}