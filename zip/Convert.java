import java.util.*;
import java.util.zip.*;
import java.io.*;
class Convert
{
	String OUTPUT_ZIP_FILE = System.getProperty("user.home")+"\\desktop\\java.zip";
	String SOURCE_FOLDER = "c:\\Java";
	Vector<String> v;
	Convert()
	{
		v=new Vector<String>(1,1);
	}
	void generateFileList(File f)
	{
		if(f.isFile())
			v.addElement(f.getPath());
		else
		{
			String names[]=f.list();
			for(String n:names)
			{
				File f1=new File(f.getPath()+"\\"+n);
				generateFileList(f1);
			}
		}
	}
	public void zipit(String filename)
	{
	     byte[] buffer = new byte[1024];
	     try{
	     FileOutputStream fos = new FileOutputStream(filename);
    	     ZipOutputStream zos = new ZipOutputStream(fos);
    	     System.out.println("Output to Zip : " + filename);
 
             for(String file : v){
    		System.out.println("File Added : " + file);
		//file=file.substring(SOURCE_FOLDER.length()+1,file.length());
    		ZipEntry ze= new ZipEntry(file);
        	zos.putNextEntry(ze);
 
        	FileInputStream in = 
                       new FileInputStream(file);
 
        	int len;
        	while ((len = in.read(buffer)) > 0) {
        		zos.write(buffer, 0, len);
        	}
 
        	in.close();
    	     }
	    zos.closeEntry();
	    zos.close();
    	    System.out.println("Done");
	    }catch(IOException ex){
       		ex.printStackTrace();   
    	    }
	}
	public static void main(String a[])
	{
		Convert c=new Convert();
		File f=new File(c.SOURCE_FOLDER);
		c.generateFileList(f);
		c.zipit(c.OUTPUT_ZIP_FILE);
	}
	
	
}