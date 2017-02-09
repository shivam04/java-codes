import java.lang.reflect.*;
import java.awt.*;
class KeyPad
{
	public String[] arrayString;
	public int[] arrayInt;
	public int a;
	public String b;
	public int[][] twoDarrayInt;
	public Button[] letters;
}
class isArrayDemo
{
	public static void main(String a[])
	{
		KeyPad target = new KeyPad();
		printArrayNames(target);
	}
	public static void printArrayNames(Object target)
	{
		Class targetClass = target.getClass();
		Field[] publicFields = targetClass.getFields();
		for(int i=0;i<publicFields.length;i++)
		{
			String fieldName = publicFields[i].getName();
			Class typeClass = publicFields[i].getType();
			String fieldType = typeClass.getName();
			if(typeClass.isArray())
			{
				System.out.println("Name: "+fieldName+"\nType: "+fieldType);
			}
		}
	}
}