package cucumber.framework.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class WriteToPDFFile {

 
 
 public static void main(String[] args){
	 PDDocument pd;
	 BufferedWriter wr;
	 PDFTextStripper stripper;
	 try {
	         File input = new File("C:\\Users\\pollc\\OneDrive\\Desktop\\Compare-Image\\New folder\\22_agreement_1660030862-old.pdf");  // Membaca isi PDF
	         File output = new File("C:\\Users\\pollc\\OneDrive\\Desktop\\Compare-Image\\New folder\\aaaaa\\22_agreement_1660030862-new.txt"); //Path File untuk menulis isi PDF
	         pd = PDDocument.load(input);
	         stripper = new PDFTextStripper();
	         wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output)));
	         stripper.writeText(pd, wr);
	         if (pd != null) {
	             pd.close();
	         }
	        wr.close();
	 } catch (Exception e){
	         e.printStackTrace();
	        }
     }
}