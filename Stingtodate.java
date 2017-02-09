import java.text.SimpleDateFormat;
import java.util.Date;
class Stringtodate{
	public static void main(String a[]){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("2013-09-18");
		String datea = sdf.format(date);
		System.out.println(datea);
	}
}