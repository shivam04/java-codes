import java.awt.*;
import javax.swing.*;
class TableDemo
{
	TableDemo()
	{
		JFrame f = new JFrame("Teble Demo");
		f.setLayout(null);
		JTable table = new JTable();
		table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Users", "Group", "Host", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
		table.setBounds(100,100,600,600);
		f.add(table);
		f.setSize(800,800);
		f.setVisible(true);
	}
	public static void main(String a[])
	{
		new TableDemo();
	}
}