import java.util.*;
class CheckHashMap
{
	String name;
	long salary=0;
	CheckHashMap(String nm)
	{
		name =nm;
		salary = 2000;
	}
	public String toString()
	{
		return "[name= "+name+", salary= "+salary+"]";
	}
}
public class HashMapDemo
{
	public static void main(String a[])
	{
		Map<String,CheckHashMap> ob = new HashMap<String,CheckHashMap>();
		ob.put("101",new CheckHashMap("Shivam Sinha"));
		ob.put("102",new CheckHashMap("Shubham Sinha"));
		ob.put("103",new CheckHashMap("Rajesh Singh"));
		System.out.println(ob);
		ob.remove("103");
		ob.put("104",new CheckHashMap("Rishabh Kumar"));
		ob.put("100",new CheckHashMap("Raj Verma"));
		System.out.println(ob.get("104"));
		System.out.println(ob);
		/*Enumeration name = ob.keys();
		while(name.hasMoreElements())
		{
			String code = (String)name.nextElement();
			System.out.println(code+" : "+(String)ob.get(code));
		}*/
	}
}