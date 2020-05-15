import java.awt.*;
import java.awt.Event.*;
import javax.swing.*;
public class Addit extends JFrame implements ActionListener{


JLabel first = new JLabel("Enter first no");
JLabel second = new JLabel("Enter 2nd  no");

JPanel pane = new JPanel();

JButton press = new JButton("add");
JButton  E = new JButton("Exit");

JTextField a = new JTextField("");

JTextField b = new JTextField("");


	Addit(){
//Super("addition of two numbers");
//setBound(100,100,300,200);

//setDefaultOperation(JFrame.EXIT_ON_CLOSE);

 Container con = this.getContentPane();
con.add(pane);

press.setMnemonic('p');
press.addActionListener(this);


	pane.add(first);
	pane.add(second);
	pane.add(a);
	pane.add(b);
	pane.add(press);
	pane.add(E);

//press.requestfocus();
setVisible(true);

}

public void actionPerformed( ActionEvent e){

Object source = e.getSource();
if(source == press){
int n = Integer.parseInt(a.getText());
int m = Integer.parseInt(b.getText());
double sum = n + m;
JOptionPane.showMessageDialog(null,sum,"Result", JOptionPane.PLAIN_MESSAGE);
}
}

public static void main(String[]args){
new Addit();
}
}
