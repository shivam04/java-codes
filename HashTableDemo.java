import java.util.*;
class HashTableDemo
{
	public static void main(String a[])
	{
		Hashtable<String,String> ob = new Hashtable<String,String>();
		ob.put("101","Tom Cruise");
		ob.put("102","Paul Walker");
		ob.put("100","Hugh JackMan");
		System.out.println(ob.get("100"));
		System.out.println(ob.get("101"));
		System.out.println(ob.get("102"));
		Enumeration name = ob.keys();
		while(name.hasMoreElements())
		{
			String code = (String)name.nextElement();
			System.out.println(code+" : "+(String)ob.get(code));
		}
		System.out.println(ob.isEmpty());
		System.out.println(ob.containsKey("102"));
		System.out.println(ob.containsKey("104"));
	}
}