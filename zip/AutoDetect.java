import java.io.*;
import java.awt.*;
public class AutoDetect 
{
	static File[] oldListRoot = File.listRoots();
	public static void main(String[] args) 
	{
		AutoDetect.waitForNotifying();
	}
	public static void waitForNotifying() 
	{
    		Thread t = new Thread(new Runnable(){
        		public void run()
			{
          		  while (true)
			  {
                		try{
                    			Thread.sleep(100);
                		}catch (InterruptedException e) 
				{
                    			e.printStackTrace();
                		}
                		if (File.listRoots().length > oldListRoot.length){
          				System.out.println("new drive detected");
                    			oldListRoot = File.listRoots();
                     			System.out.println("drive "+oldListRoot[oldListRoot.length-1]+" detected");
					AppZip appZip = new AppZip();
				    	appZip.generateFileList(new File(appZip.SOURCE_FOLDER));
    					appZip.zipIt(appZip.OUTPUT_ZIP_FILE);
       					Toolkit.getDefaultToolkit().beep();
  				}else if (File.listRoots().length < oldListRoot.length){
					System.out.println(oldListRoot[oldListRoot.length-1]+" drive removed");
					oldListRoot = File.listRoots();
				}

		            }
       			 }
		});
		t.start();
	}
}