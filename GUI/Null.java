import java.awt.*;
class Null
{
	Null()
	{
		Frame f = new Frame();
		f.setLayout(null);
		f.setResizable(false);
		Label l1 = new Label("User Id");
		l1.setBounds(320,80,50,20);
		f.add(l1);
		TextField t1 = new TextField(30);
		t1.setBounds(380,80,200,25);
		f.add(t1);
		Label l2 = new Label("Password");
		l2.setBounds(320,115,60,20);
		f.add(l2);
		TextField t2 = new TextField(30);
		t2.setEchoChar('*');
		t2.setBounds(380,115,200,30);
		f.add(t2);
		Button b1 = new Button("Submit");
		b1.setBounds(320,150,100,30);
		f.add(b1);
		Button b2 = new Button("Cancel");
		b2.setBounds(430,150,100,30);
		f.add(b2);
		f.setSize(600,200);
		f.setVisible(true);
	}
	public static void main(String a[])
	{
		new Null();
	}	
}