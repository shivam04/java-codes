import java.util.*;
class LinkedHashMapDemo
{
	public static void main(String a[])
	{
		LinkedHashMap<String,String> ob = new LinkedHashMap<String,String>(){
			protected boolean removeEldestEntry(Map.Entry eldest){
				return size()>3;
			}
		};
		ob.put("1","Yo Yo");
		ob.put("2","Hello");
		ob.put("3","Hey");
		System.out.println(""+ob);
	}
}