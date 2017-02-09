class StringBuilderDemo
{
	public static void main(String a[])
	{
		StringBuilder str = new StringBuilder("Java ");
		System.out.println(str);
		//append method()
		str.append("Programming ");
		System.out.println(str);
		str.append(5.0);  //append float value 5.0 to "5.0"
		System.out.println(str);
		//insert method()
		str.insert(20," version");
		System.out.println(str);
		str.insert(5,"Basic ");
		System.out.println(str);
		System.out.println("Before Deletion: "+str);
		//delete method()
		str.delete(5,11);
		System.out.println("After Deletion: "+str);
		//reverse method()
		str.reverse();
		System.out.println(str);
		str.reverse();
		str.insert(5,"h");
		System.out.println(str);
		//charAt mathod()
		System.out.println(str.charAt(5));
		//deleteCharAt method()
		StringBuilder h = new StringBuilder("Hello  Shivam Sinha");
		h.deleteCharAt(5);
		System.out.println(h);
		//getChars method()
		char[] array = new char[12];
		h.getChars(6,18,array,0);
		System.out.println(array);
		//length method()
		int k =h.length();
		System.out.println(k);
		//replace mathod()
		h.replace(6,19,"Shubham Shukla");
		System.out.println(h);
		//setCharAt method()
		h.setCharAt(14,'s');
		System.out.println(h);
		//setLength mathod()
		System.out.println("Original Length: "+h.length()+" "+h+"g");
		h.setLength(22);
		System.out.println("New Length: "+h.length()+" "+h+"g");
		//appendCodePoint method()
		h.appendCodePoint(123);
		System.out.println(h);
		//capacity method()
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb = new StringBuilder("Hello Shivam Sinha How are You");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		//substring method()
		String substr = str.substring(22);
		System.out.println(substr+" "+str);
		substr = sb.substring(6,19);
		System.out.println(substr+" "+sb);
	}
}