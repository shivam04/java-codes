import java.awt.*;
class GridBag
{
	GridBag()
	{
		Frame f = new Frame();
		GridBagLayout gb = new GridBagLayout();
		f.setLayout(gb);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets = new Insets(5,5,5,5);
		Label l1 = new Label("User Id");
		gbc.gridx=1;
		gbc.gridy=1;
		gb.setConstraints(l1,gbc);
		f.add(l1);
		TextField t1 = new TextField(30);
		gbc.gridx=2;
		gbc.gridy=1;
		gb.setConstraints(t1,gbc);
		f.add(t1);
		Label l2 = new Label("Password");
		gbc.gridx=1;
		gbc.gridy=2;
		gb.setConstraints(l2,gbc);
		f.add(l2);
		TextField t2 = new TextField(30);
		gbc.gridx=2;
		gbc.gridy=2;
		gb.setConstraints(t2,gbc);
		t2.setEchoChar('*');
		f.add(t2);
		Button b1 = new Button("Submit");
		gbc.gridx=1;
		gbc.gridy=3;
		gb.setConstraints(b1,gbc);
		f.add(b1);
		Button b2 = new Button("Cancel");
		gbc.gridx=2;
		gbc.gridy=3;
		gb.setConstraints(b2,gbc);
		f.add(b2);
		f.setSize(600,200);
		f.setVisible(true);
	}
	public static void main(String a[])
	{
		new GridBag();
	}
}