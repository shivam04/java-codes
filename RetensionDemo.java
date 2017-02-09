import java.lang.annotation.*;
@interface AnnotationForRunTime
{
	String doTestRetention();
}
class RetensionDemo
{
	public static void main(String a[])
	{
		new RetensionDemo().doSomeTestRetention();
	}
	@AnnotationForRunTime(doTestRetention="Hello Retention")
	public void doSomeTestRetention()
	{
		System.out.println("Testing 'Retention' annotation");
	}
}