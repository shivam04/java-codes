class Happy
{
	public native void printText();
	public static void main(String a[])
	{
		Happy happy = new Happy();
		happy.printText();
	}
	static
	{
		System.loadLibrary("call");
	}
}