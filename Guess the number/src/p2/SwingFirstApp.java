package p2;
import javax.swing.*;
import java.awt.*;
class SwingFirstApp 
{
	JFrame jf;
	JButton b;
	JLabel l;
	JTextField tf;
	
	SwingFirstApp(String title)
{
 
jf=new JFrame(title);
jf.setVisible(true);
jf.setSize(400,400);

tf=new JTextField(10);
jf.setLayout(new FlowLayout());
b=new JButton("Ok");
l=new JLabel("Welcome to App");
jf.add(l);
jf.add(tf);
jf.add(b);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



}
public static void main(String ss[])
{
SwingFirstApp ff=new SwingFirstApp("SwingFrame");
}
}

