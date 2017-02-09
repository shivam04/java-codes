import java.awt.*;
class WinApp
{
	WinApp()
	{
		Frame f = new Frame();
		BorderLayout border = new BorderLayout();
		f.setLayout(border);
		Panel p =new Panel();
		Label l = new Label("Find What");
		p.setBackground(new Color(2,4,5));
		p.add(l);
		TextField tf = new TextField(30);
		p.add(tf);
		Button b = new Button("Submit");
		p.add(b);
		f.add(p,"North");
		Button b1 = new Button("Button1");
		f.add(b1,"South");
		Button b2 = new Button("Button2");
		f.add(b2,"East");
		Button b3 = new Button("Button3");
		f.add(b3,"West");
		Button b4 = new Button("Button4");
		f.add(b4);
		f.tSize(400,400);
		f.setVisible(true);
	}
	public static void main(String a[])
	{
		new WinApp();
	}
}