import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FactorialGUI extends JFrame implements ActionListener{

JLabel a = new JLabel("Enter the number Here",SwingConstants.CENTER);

JTextField b = new JTextField(10);
JLabel c = new JLabel();

JLabel r = new JLabel("Result",SwingConstants.CENTER);
JPanel pane = new JPanel();
JButton Click = new JButton("calculate");
JLabel V = new JLabel("In God I trust ",SwingConstants.CENTER);
JButton Z = new JButton("Clear");
JButton Y = new JButton("Exit");

FactorialGUI(){
super("Profchiso's Factorial Calculator");
Container con = this.getContentPane();
con.add(pane);
pane.setLayout(new GridLayout(4,2));
pane.add(a);
pane.add(b);

pane.add(r);
pane.add(c);
pane.add(Click);
pane.add(Z);
pane.add(Y);
pane.add(V);
Click.addActionListener(this);
Y.addActionListener(this);
Z.addActionListener(this);
Click.setMnemonic('c');
Z.setMnemonic('l');
Y.setMnemonic('E');


setSize(400,400);
setVisible(true);
}
public void actionPerformed(ActionEvent Event){
Object source = Event.getSource();

long facto =1;
int num = Integer.parseInt(b.getText());
for(int i =1;i<=num;i++)
facto*=i;
if(source==Click){
c.setText(String.valueOf(facto));

}
if(source==Z){
b.setText("");
c.setText("");
}
if(source==Y){
System.exit(0);
}
}
public static void main(String[]args){
new FactorialGUI();
}
}
