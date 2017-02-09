import java.applet.*;
import java.awt.*;
import java.net.*;
//<applet code="AudioDemo.class" width=400 height=400></applet>
public class AudioDemo extends Applet
{
private AudioClip clip;
private AppletContext context;
public void init()
{
context =this.getAppletContext();
String audioURL =this.getParameter("audio");
if(audioURL ==null)
{
audioURL ="default.au";
}
try
{
URL url =new URL(this.getDocumentBase(), audioURL);
clip = context.getAudioClip(url);
}catch(MalformedURLException e)
{
e.printStackTrace();
context.showStatus("Could not load audio file!");
}
}
public void start()
{
if(clip !=null)
{
clip.loop();
}
}
public void stop()
{
if(clip !=null)
{
clip.stop();
}
}
}