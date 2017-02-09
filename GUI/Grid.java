import java.awt.*;
class Grid
{
	Grid()
	{
		Frame f = new Frame();
		GridLayout grid = new GridLayout(2,3);
		f.setLayout(grid);
		Button b = new Button("Button");
		f.add(b);
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
		new Grid();
	}
}