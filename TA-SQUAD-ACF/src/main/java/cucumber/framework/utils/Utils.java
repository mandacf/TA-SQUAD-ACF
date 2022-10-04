package cucumber.framework.utils;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
//import org.apache.pdfbox.pdmodel.PDDocument;
//import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.hamcrest.core.IsEqual;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.framework.constant.Constants;
//import net.sourceforge.tess4j.Tesseract;
//import net.sourceforge.tess4j.TesseractException;

public class Utils {

	public static int testCount = 0;
	public static int countOutline = 1;
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"/FailedTestScreenshot/"
				+screenshotName+"_"+dateName+".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}
	
	public static void delay(int detik, String delays) {
		if(delays.equals("y"))
		{
			try {
				Thread.sleep(1000*detik);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	
	public static String driverWaitTxt(WebDriver driver, int delays, WebElement element) {
		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(element)).getText();
	}
	
	
	public static void scrollByVisibleElement(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();",element );	
	}
	
	public static void scrollDownByPixel(int vertical, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,"+vertical+")");
	}
	
	public static void scrollDownToButtom(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public static void zoomOut(int n) throws AWTException{
	  	Robot robot = new Robot();
	  	for (int i = 0; i < n; i++) {			
	  		robot.keyPress(KeyEvent.VK_CONTROL);
	  		robot.keyPress(KeyEvent.VK_SUBTRACT);
	  		robot.keyRelease(KeyEvent.VK_CONTROL);
	  		robot.keyRelease(KeyEvent.VK_SUBTRACT);
		}
	}
	
	public static void zoomIn(int n) throws AWTException{
	  	Robot robot = new Robot();
	  	for (int i = 0; i < n; i++) {			
	  		robot.keyPress(KeyEvent.VK_CONTROL);
	  		robot.keyPress(KeyEvent.VK_ADD);
	  		robot.keyRelease(KeyEvent.VK_CONTROL);
	  		robot.keyRelease(KeyEvent.VK_ADD);
		}
	}
	
	public static String generateString(int intStringLength) {
		int randAlphabeth = 0;
		final char charBatasBawahAlphabeth = 97;
		final char charBatasAtasAlphabeth = 123;
		Random rand = new Random();
		StringBuffer strRandomString = new StringBuffer();
		
		for (int i = 0; i < intStringLength; i++) {
			randAlphabeth = rand.nextInt(charBatasBawahAlphabeth,charBatasAtasAlphabeth);
			strRandomString.append((char)randAlphabeth);
		}
		
		return strRandomString.toString();
	}
	
	public static int generateInteger(int intFirstIndex, int intLastIndex) {
		Random rand = new Random();
		int intTemp = 0;
		
		try {
			intTemp = rand.nextInt(intFirstIndex, intLastIndex+1);			
		} catch (IllegalArgumentException e) {
			intTemp = 0;
		}
		
		return intTemp;
	}
	
	public static String generateWord(int intWord, int intWordLength) {
		StringBuffer strRandomString = new StringBuffer();
		String strTemp = "";
		
		for (int i = 0; i < intWord; i++) {
			strRandomString.append(generateString(intWordLength) + " ");
		}
		
		strTemp = strRandomString.toString().substring(0,strRandomString.length()-1);
		
		return strTemp;
	}
	
//	public static String OCR(String pathPdf) {
//		// creating an object of class Tesseract  
//		String text = "";
//        Tesseract tesseract = new Tesseract( ) ;  
//        try {
//        	String pathOcr ="D:\\tessa\\tessdata-3.04.00";
//            // this includes the path of tessdata inside the extracted folder  
//            tesseract.setDatapath(pathOcr) ;  
//            // specifying the image that has to be read  
//            text = tesseract.doOCR( new File(pathPdf) ) ;    
//            // printing the text corresponding to the image interpreted  
////            System.out.print( text ) ;  
//        }  
//        catch ( TesseractException e ) {  
//            e.printStackTrace( ) ;
//        }  
//		
//		return text;
//	}
	
//	public static boolean comparePDFAndDOCX(String pathPdf, String pathDocx) {
//		boolean isEquals = false;
//		StringBuilder sBuild = new StringBuilder();
//		String strPdf = readPDFFile(pathPdf);
//		try {
//			
//            File file = new File(pathDocx);
//            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
//            XWPFDocument document = new XWPFDocument(fis);
//
//            List<XWPFParagraph> paragraphs = document.getParagraphs();
//
//        	String strA = "";
//        	sBuild.setLength(0);
//            for (XWPFParagraph para : paragraphs) {
//            	sBuild.setLength(0);
//            	strA = sBuild.append(strA).append(para.getText()).append("\n").toString();
//            }
//            fis.close();
//            isEquals = strA.equals(strPdf);
//            System.out.println("isEqual: " + isEquals);
//            System.out.println("Text DOCX: " + strA);
//            System.out.println("Text PDF: " + strPdf);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//		return isEquals;
//	}
	
//	public static String readPDFFile(String pathPdf) {
//		PDDocument pd;
//		File input;
//		String pageText = "";
//		PDFTextStripper stripper;
//		
// 		try {
//			input = new File(pathPdf);
//		    pd = PDDocument.load(input);				     
//		    stripper = new PDFTextStripper();
//		    pageText = stripper.getText(pd);
//		} catch (Exception e){
//			System.out.println(e.getMessage());
//	    }
// 		
//	    return pageText;
//	}
	
//	public static void writeTXTFileFromPDFFile(String pathPdf, String pathTxt) {
//		PDDocument pd;
//		BufferedWriter wr;
//		PDFTextStripper stripper;
//		try {
//	         File input = new File(pathPdf); // Membaca isi PDF
//	         File output = new File(pathTxt); //Path File untuk menulis isi PDF
//	         pd = PDDocument.load(input);
//	         stripper = new PDFTextStripper();
//	         wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output)));
//	         stripper.writeText(pd, wr);
//	         if (pd != null) {
//	             pd.close();
//	         }
//	         wr.close();
//		} catch (Exception e){
//		     e.printStackTrace();
//		}
//	}
	
	public static void deleteFile(String path) throws IOException{
		File file = new File(path);
	    if (file.delete()) { 
	      System.out.println("Deleted the file: " + file.getName());
	    } else {
	      System.out.println("Failed To Delete The File !!");
	    } 
	}
		
	public static String compareImage(String pathImg1, String pathImg2) throws IOException{
		BufferedImage img1 = ImageIO.read(new File(pathImg1));
        BufferedImage img2 = ImageIO.read(new File(pathImg2));
        int w1 = img1.getWidth();
        int w2 = img2.getWidth();
        int h1 = img1.getHeight();
        int h2 = img2.getHeight();
        long diff = 0;
	      
        for (int j = 0; j < h1; j++) {
          for (int i = 0; i < w1; i++) {
             //Getting the RGB values of a pixel
             int pixel1 = img1.getRGB(i, j);
             Color color1 = new Color(pixel1, true);
             int r1 = color1.getRed();
             int g1 = color1.getGreen();
             int b1 = color1.getBlue();
             int pixel2 = img2.getRGB(i, j);
             Color color2 = new Color(pixel2, true);
             int r2 = color2.getRed();
             int g2 = color2.getGreen();
             int b2= color2.getBlue();
             //sum of differences of RGB values of the two images
             long data = Math.abs(r1-r2)+Math.abs(g1-g2)+ Math.abs(b1-b2);
             diff = diff+data;
          }
        }
        
        double avg = diff/(w1*h1*3);
        double percentage = (avg/255)*100;
//      System.out.println("Difference: "+percentage);
        String strPersentage = Double.toString(percentage);
        return strPersentage;
	}
	
	public static String getFileNameWithExt(String path) {
		String fileName = "";
		File f = new File(path);
        if(f.exists()){
            fileName = f.getName();
        }else{
            fileName = "The File does not exist";
        }
		return fileName;
	}
	
	public static long getFileSize(String path) {
		long fileSize = 0l;
		File f = new File(path);
		if(f.exists()){
			fileSize = f.length();
		}else{
			fileSize = 0l;
		}
		return fileSize;
	}
	
	public static String getCurrentDate() {
		String currentDate = "";
		currentDate = java.time.LocalDate.now().toString();
		return currentDate;
	}
	
	public static String getCurrentDateWithoutStrip() {
		String currentDate = "";
		currentDate = java.time.LocalDate.now().toString();
		currentDate = currentDate.replaceAll("-", "");
		return currentDate;
	}
	
	public static String generateDate() {
		Random rand = new Random();
		String strTemp = "";
		
		strTemp = 2022 + "-" + rand.nextInt(1,13) + "-" + rand.nextInt(1,31);
		
		return strTemp;
	}
	
	public static String generateDate(int firstIndexYear, int lastIndexYear) {
		Random rand = new Random();
		String strTemp = "";
		
		try {			
			strTemp = rand.nextInt(firstIndexYear,lastIndexYear+1) + "-" + rand.nextInt(1,13) + "-" + rand.nextInt(1,31);
		} catch (Exception e) {
			strTemp = 2022 + "-" + rand.nextInt(1,13) + "-" + rand.nextInt(1,31);
		}
		
		return strTemp;
	}
	
	public static String generateDate(int firstIndexMonth, int lastIndexMonth, int firstIndexDate, int lastIndexDate) {
		Random rand = new Random();
		String strTemp = "";
		
		try {			
			strTemp = 2022 + "-" + rand.nextInt(firstIndexMonth,lastIndexMonth+1) + "-" + rand.nextInt(firstIndexDate,lastIndexDate+1);
		} catch (Exception e) {
			strTemp = 2022 + "-" + rand.nextInt(1,13) + "-" + rand.nextInt(1,31);
		}
		
		return strTemp;
	}
	
	public static void tabEnter() throws AWTException
	{
		Robot robot = new Robot();
		for(int i =0; i < 8; i++)
		{
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		
		for(int i =0; i < 2; i++)
		{
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
	}
}