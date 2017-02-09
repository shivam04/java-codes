import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.*;
import java.util.*; 
public class AppZip extends AutoDetect
{  
    List<String> fileList;
static  String OUTPUT_ZIP_FILE ;
static  String SOURCE_FOLDER;   
    AppZip()
    {    
	//AutoDetect b=new AutoDetect();
	//b.waitForNotifying();
        alankrit s=new alankrit();
        String q=s.date_ret();
	StringBuffer sb=new StringBuffer(q);
	sb.deleteCharAt(4);sb.deleteCharAt(6);sb.deleteCharAt(11);sb.deleteCharAt(13);
        sb.insert(9,"time_");sb.insert(16," ");sb.insert(19," "); 

	String p="Myfile_date"+sb+".zip";
        		
        SOURCE_FOLDER =oldListRoot[oldListRoot.length-1].getPath();
	OUTPUT_ZIP_FILE=System.getProperty("user.home")+"\\desktop\\"+p;
        //System.out.println(SOURCE_FOLDER);
	fileList = new ArrayList<String>();
    }

    public static void main( String[] args )
    {
    	AppZip appZip = new AppZip();
    	appZip.generateFileList(new File(SOURCE_FOLDER));
    	appZip.zipIt(OUTPUT_ZIP_FILE);
       Toolkit.getDefaultToolkit().beep();
    }
    public void zipIt(String zipFile){
 
     byte[] buffer = new byte[1024];
 
     try{
 
    	FileOutputStream fos = new FileOutputStream(zipFile);
    	ZipOutputStream zos = new ZipOutputStream(fos);
 
    	System.out.println("Output to Zip : " + zipFile);
 
    	for(String file : this.fileList){
		//System.out.println(file);
		//System.out.println(SOURCE_FOLDER + File.separator + file);
 		File temp=new File(SOURCE_FOLDER + File.separator + file);
		//System.out.println(temp.exists());
		if(temp.exists()){
    		System.out.println("File Added : " + file);
    		ZipEntry ze= new ZipEntry(file);
        	zos.putNextEntry(ze);
 		
        	FileInputStream in = 
                       new FileInputStream(SOURCE_FOLDER + File.separator + file);
 
        	int len;
        	while ((len = in.read(buffer)) > 0) {
        		zos.write(buffer, 0, len);
        	}
 
        	in.close();
		}
    	}
 
    	zos.closeEntry();
    	//remember close it
    	zos.close();
 
    	System.out.println("Done");
      
    }catch(IOException ex){
       ex.printStackTrace();   
    }
   }
    public void generateFileList(File node){
//	System.out.println("Hello  "+node.getPath());
	if(node!=null)
	{
		if(node.isFile()){
			fileList.add(generateZipEntry(node.getAbsoluteFile().toString()));
		} 
		if(node.isDirectory()){
			String[] subNote = node.list();
			if(subNote!=null){
			for(String filename : subNote){
				generateFileList(new File(node, filename));
			}
			}
		}
	}
    }
    private String generateZipEntry(String file){
    	return file.substring(SOURCE_FOLDER.length(), file.length());
    }
}