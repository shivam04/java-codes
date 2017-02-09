class bit
{
	public static void main(String[] ar)
	{
		/*String a ="OS Architecture : " + System.getProperty("os.arch");

        String b="OS Name : " + System.getProperty("os.name");

        String c="OS Version : " + System.getProperty("os.version");

        String d="Data Model : " + System.getProperty("sun.arch.data.model");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);*/
		String arch = System.getenv("PROCESSOR_ARCHITECTURE");
		String wow64Arch = System.getenv("PROCESSOR_ARCHITEW6432");
		String realArch = arch.endsWith("64")|| wow64Arch != null && wow64Arch.endsWith("64")? "64" : "32";
		System.out.println(arch+" "+wow64Arch+" "+realArch);
	}
}