package cucumber.framework.utils;

import java.io.File;

import org.apache.commons.io.FilenameUtils;

public class GetMetaDataFile {

	
	public static void main(String[] args) {
		File f = new File("C:\\Users\\NEXSOFT\\Downloads\\convertcsv (1).xlsx");
		String extFile = FilenameUtils.getExtension("C:\\Users\\NEXSOFT\\Downloads\\data_export.xlsx"); // returns "txt"
        if(f.exists()){
            System.out.println("Name: "+ f.getName());
            System.out.println("Path: "+ f.getAbsolutePath());
            System.out.println("Size: "+ f.length());
            System.out.println("Writeable: "+ f.canWrite());
            System.out.println("Readable: "+ f.canRead());
            System.out.println("Readable: "+ f.lastModified());
            System.out.println("Extension File : "+extFile);
        }else{
            System.out.println("The File does not exist");
        }
	}
}