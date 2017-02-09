//retrive class name
class TestRetriveClassName
{
	Field lengthField;
	static int lengthValue;
	public static void main(String a[])
	{
		TestRetriveClassName trcn = new TestRetriveClassName();
		printClassName(trcn);
	}
	static void printClassName(Object ob)
	{
		Class cl = ob.getClass();
		lengthField = cl.getField("length");
		lengthValue = lengthField.get(ob);
		String name = cl.getName();
		System.out.println(name);
	}
}