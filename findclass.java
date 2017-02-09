class findclass
{
	public static void main(String a[])
	{
		Reflections r = new Reflections("my.project.prefix");
		Set<Class<? extends Object>>
		allClasses = r.getSubbTypesOf(Object.class);
	}
}