class System1
{
	public static void main(String a[])
	{
		String os = System.getProperty("os.name");
		System.out.println(os);
		String os1 = System.getProperty("user.home");
		System.out.println(os1);
		String os2 = System.getProperty("user.dir");
		System.out.println(os2);
		String version = System.getProperty("java.version");
		System.out.println(version);
	}
}