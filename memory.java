class memory
{
	public static void main(String a[])
	{
		long total = Runtime.getRuntime().totalMemory();
		long free = Runtime.getRuntime().freeMemory();
		System.out.println(total/(1024*1024)+" "+free/(1024*1024));
	}
}