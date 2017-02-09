import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
class Stringtodate{
	
	public static void main(String a[]){
		Date date=null;
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		try{
			date = sdf.parse("12/24/2015");
			System.out.println(date);
		}
		catch (ParseException e){
			e.printStackTrace();
		}
		long secs = date.getTime();
		System.out.println(secs);
		System.out.println(System.currentTimeMillis());
	}
}