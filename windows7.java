import java.awt.*;
import java.awt.event.*;

class action1 implements ActionListener{
	public void actionPerformed (ActionEvent x){
		System.out.println("Hello my friends");
	}
}



class windows7{
	public static void main(String xyz[]){
		Frame win=new Frame();
		Button B1=new Button("Click");
		Button B2=new Button("GET");
		Button B3=new Button("ME");
		Button B4=new Button("HOME");
		Button B5=new Button ("NOW");
		win.add(B1, BorderLayout.CENTER);
		win.add(B2, BorderLayout.NORTH);
		win.add(B3, BorderLayout.EAST);
		win.add(B4, BorderLayout.SOUTH);
		win.add(B5, BorderLayout.WEST);
		action1 e=new action1();
		B1.addActionListener(e);

		B2.setBackground(Color.PINK);
		B3.setBackground(Color.PINK);
		B4.setBackground(Color.PINK);
		B5.setBackground(Color.PINK);


		win.setSize(600,400);
		win.setVisible(true);
	}
}