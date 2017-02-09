class PackageDemo
{
	public static void main(String a[])
	{
		Package pack[] = Package.getPackages();
		System.out.println(pack.length);
		for(int i=0;i<pack.length;i++)
		System.out.println(pack[i].getName());
	}
}