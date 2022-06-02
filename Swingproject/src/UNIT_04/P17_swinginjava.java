package UNIT_04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class P17_swinginjava {

	public static void main(String[] args) {
	swinginjava obj = new swinginjava();

	}

}

class swinginjava extends JFrame{
	JTextField t1;
	JTextField t2;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JLabel l1;
	swinginjava(){
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		b1 = new JButton("sum");
		b2 = new JButton("sub");
		b3 = new JButton("mul");
		b4 = new JButton("div");
		l1 = new JLabel("result");
		
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l1);
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				int a1 = Integer.parseInt(s1);
				int a2 = Integer.parseInt(s2);
				if(e.getSource()==b1)
				{
					Integer sum =a1+a2;
					l1.setText(sum.toString());
					
				}
				if(e.getSource()==b2)
				{
					Integer sub =a1-a2;
					l1.setText(sub.toString());
				}
				if(e.getSource()==b3)
				{
					Integer mul=a1*a2;
					l1.setText(mul.toString());
				}
				if(e.getSource()==b4)
				{
					Integer div = a1/a2;
					l1.setText(div.toString());
				}
				
				
			}
			
		};
		b1.addActionListener(al);
		b2.addActionListener(al);
		b3.addActionListener(al);
		b4.addActionListener(al);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(3);
		
	}
}