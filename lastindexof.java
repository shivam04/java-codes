class lastindexof
{
	public static void main(String a[])
	{
		String demo = "Hello how are you shivam you are how Hello";
		System.out.println(demo.lastIndexOf('h'));
		System.out.println(demo.lastIndexOf("you"));
		System.out.println(demo.lastIndexOf('h',32));
		System.out.println(demo.lastIndexOf("you",22));
		System.out.println(demo.replace("are","r"));
		String k = "   Hello Shivam    ";
		System.out.println(k.trim());
		System.out.println(demo.codePointAt(1)); //return ASCII code of character at index 1
		System.out.println(demo.codePointBefore(1)); //return ASCII code of character at index 0
		char[] ch = demo.toCharArray();
		for(char c : ch)
			System.out.printf("%c,",c);
		System.out.println();
		System.out.println(String.valueOf(ch));
	}
}