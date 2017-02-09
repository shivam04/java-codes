import java.util.*;
class sortedmap
{
	public static void main(String shivam[])
	{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			map.put(a,b);
		}
		Iterator it = map.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println(pair.getKey()+"->"+pair.getValue());
		}
		
	}
}