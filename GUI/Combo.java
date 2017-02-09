import javax.swing.*;
import java.awt.*;
class Combo
{
	Combo()
	{
		JFrame f = new JFrame("My Window");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		Choice ch = new Choice();//awt
		ch.addItem("Ashish");
		ch.addItem("GaganDeep");
		ch.addItem("Deepak");
		f.add(ch);
		JComboBox combo = new JComboBox();//swing
		combo.addItem("Ankur");
		combo.addItem("Mohit");
		combo.addItem("Shantanu");
		f.add(combo);
		JRadioButton rad1 = new JRadioButton("Male",true);
		JRadioButton rad2 = new JRadioButton("Female",false);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rad1);
		bg.add(rad2);
		f.add(rad1);
		f.add(rad2);
		f.setSize(400,200);
		f.setVisible(true);

	}
	public static void main(String ar[])
	{
		new Combo();
	}
}
