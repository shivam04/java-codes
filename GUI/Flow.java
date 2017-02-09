import java.awt.*;
class Flow
{
	Flow()
	{
		Frame f = new Frame();
		FlowLayout flow = new FlowLayout(FlowLayout.RIGHT);
		f.setLayout(flow);
		Panel p =new Panel();
		Label l = new Label("Find What");
		p.add(l);
		TextField tf = new TextField(30);
		p.add(tf);
		Button b = new Button("Submit");
		p.add(b);
		f.add(p);
		Button b1 = new Button("Button1");
		f.add(b1);
		Button b2 = new Button("Button2");
		f.add(b2);
		Button b3 = new Button("Button3");
		f.add(b3);
		Button b4 = new Button("Button4");
		f.add(b4);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String a[])
	{
		new Flow();
	}
}