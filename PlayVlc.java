import java.util.Scanner;
class PlayVlc
{
	public static void main(String a[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		/*Enter path with video
		like:  G:\LOT\kungufupanda3.mkv 
		*/
		System.out.println("Enter Video Path:");
		String path = sc.nextLine();
		Runtime.getRuntime().exec("C:\\Program Files\\VideoLAN\\VLC\\vlc.exe "+path);
	}
}