//covariant return types
class Student1
{
	public Student1 getMarks()
	{
		System.out.println("Student1");
		return (new Student1());
	}
}
class child1 extends Student1
{
	@Override
	public child1 getMarks()
	{
		System.out.println("Child1");
		return (new child1());
	}
}
class Inheritance
{
	public static void main(String a[])
	{
		child1 c = new child1();
		c.getMarks();
		Student1 s = new Student1();
		s.getMarks();
	}
}
