import java.awt.*;
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
		win.setSize(600,400);
		win.setVisible(true);
	}
}