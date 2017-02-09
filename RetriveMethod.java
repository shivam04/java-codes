import java.lang.reflect.*;
class RetriveMethod
{
	public void hello()
	{
		
	}
	public void printint(int i)
	{
		
	}
	public String returnString(String s,int k)
	{
		return s;
	}
	public static void main(String a[])
	{
		RetriveMethod rm = new RetriveMethod();
		print(rm);
	}
	public static void print(Object ob)
	{
		Class cl = ob.getClass();
		Method[] theMethods = cl.getMethods();
		for(int i=0;i<theMethods.length;i++)
		{
			String methodName = theMethods[i].getName();
			String retunTypes = theMethods[i].getReturnType().getName();
			Class[] parameterTypes = theMethods[i].getParameterTypes();
			System.out.println((i+1)+" "+methodName+" "+retunTypes);
			for(int j=0;j<parameterTypes.length;j++)
			{
				String parameterName = parameterTypes[j].getName();
				System.out.println((j+1)+" "+parameterName);
			}
		}
	}
}