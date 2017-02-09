import java.awt.*;
class GUI
{
	GUI()
	{
		Frame f = new Frame();
		f.setTitle("My Frame");
		Font font = new Font("Comic Sans MS",Font.ITALIC,15);
		int r = (int)(255*Math.random());
		int g = (int)(255*Math.random());
		int bl = (int)(255*Math.random());
	    Color c = new Color(r,g,bl);
		Panel p = new Panel();
		Label l = new Label("My Label");
		l.setFont(font);
		p.add(l);
		TextField t = new TextField(30);
		t.setFont(font);
		p.add(t);
		Button b = new Button("Click Me!!!");
		p.add(b);
		Checkbox ck = new Checkbox("Check Box");
		p.add(ck);
		Checkbox ck1 = new Checkbox("Check Box Tick",true);
		p.add(ck1);
		CheckboxGroup ckg = new CheckboxGroup();
		Checkbox r1 = new Checkbox("Male",ckg,true);
		p.add(r1);
		Checkbox r2 = new Checkbox("Female",ckg,true);
		p.add(r2);
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("File");
		MenuItem i1 = new MenuItem("New");
		m1.add(i1);
		Menu i2 = new Menu("Open");
		MenuItem i3 = new MenuItem("File");
		i2.add(i3);
		MenuItem i4 = new MenuItem("Project");
		i2.add(i4);
		m1.add(i2);
		mb.add(m1);
		Menu m2 = new Menu("Edit");
		mb.add(m2);
		f.setMenuBar(mb);
		f.add(p);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int sw = (int)(d.getWidth());
		int sh = (int)(d.getHeight());
		f.setBackground(c);
		f.setSize(500,200);
		f.setLocation((sw-400)/2,(sh-400)/2);
		f.setVisible(true);
	}
	public static void main(String a[])
	{
		new GUI();
	}
}