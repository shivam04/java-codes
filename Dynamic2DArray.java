import java.util.*;
class Dynamic2DArray
{
	public static void main(String a[])
	{
		List <int[]> rowList = new ArrayList<int[]>();
		rowList.add(new int[]{1,2,3});
		rowList.add(new int[]{4,5,6});
		rowList.add(new int[]{7,8,9});
		for(int i=0;i<rowList.size();i++)
		{
			System.out.print(rowList.get(i)[0]+" ");
			System.out.print(rowList.get(i)[1]+" ");
			System.out.println(rowList.get(i)[2]);
		}
	}	
}