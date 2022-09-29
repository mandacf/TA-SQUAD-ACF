package cucumber.framework.utils;

import java.io.File ;  
import net.sourceforge.tess4j.Tesseract ;  
import net.sourceforge.tess4j.TesseractException ;  
/*
 * https://github.com/tesseract-ocr/tessdata.git // download dulu dari sini ,lalu extract file rar ke folder di laptop kailan
 * https://github.com/tesseract-ocr/tessdata.git // download dulu dari sini ,lalu extract file rar ke folder di laptop kailan
 	pilih salah satu di antara kedua itu
 */
public class OCRExample {

	public static void main( String[ ] args )  
    {
        // creating an object of class Tesseract  
        Tesseract tesseract = new Tesseract( ) ;  
        try {
        	String pathOcr ="C:\\Users\\NEXSOFT\\Documents\\tessdata-main";
            // this includes the path of tessdata inside the extracted folder  
            tesseract.setDatapath(pathOcr) ;  
            // specifying the image that has to be read  
            String text = tesseract.doOCR( new File("C:\\Users\\pollc\\OneDrive\\Desktop\\Compare-Image\\New folder\\22_agreement_1660030862-old.pdf") ) ;    
            // printing the text corresponding to the image interpreted  
            System.out.print( text ) ;  
        }  
        catch ( TesseractException e ) {  
            e.printStackTrace( ) ;
        }  
    }
	}