class NativeCode
{
	public native void callCprog(String s);
	public static void main(String a[])
	{
		NativeCode nc = new NativeCode();
		nc.callCprog("Hello How Are You");
	}
	static
	{
		System.loadLibrary("call");
	}
}