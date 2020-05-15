import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;

public class Addn extends JFrame implements ActionListener{

JLabel a = new JLabel("enter ist no",SwingConstants.CENTER);
JTextField c = new JTextField(10);
JLabel b = new JLabel("enter 2nd no",SwingConstants.CENTER);
JTextField d = new JTextField(10);

JLabel v =new JLabel("",SwingConstants.CENTER);
JLabel Result =new JLabel("Result =",SwingConstants.CENTER);
JLabel z = new JLabel("with God all things are possible!!!",SwingConstants.CENTER);


JButton press = new JButton("Add");
JButton clear = new JButton("clear");
JPanel pane = new JPanel();
JButton x;

Addn(){

super("Addition");
x=new JButton("Exit");
Container con = this.getContentPane();
con.add(pane);
pane.setLayout(new GridLayout(5,2));
pane.setBackground(Color.pink);
press.setMnemonic('A');
press.addActionListener(this);
clear.addActionListener(this);
x.addActionListener(this);
a.setForeground(Color.blue);
b.setForeground(Color.blue);
Result.setForeground(Color.blue);
press.setForeground(Color.red);
press.setToolTipText("click to add the two numbers");
press.setBackground(Color.black);
clear.setForeground(Color.red);
clear.setBackground(Color.black);
z.setForeground(Color.blue);
z.setBackground(Color.black);
x.setForeground(Color.red);
x.setBackground(Color.black);
v.setForeground(Color.red);
pane.add(a);
pane.add(c);
pane.add(b);
pane.add(d);
pane.add(Result);
pane.add(v);
pane.add(press);
pane.add(clear);
pane.add(x);
pane.add(z);
setVisible(true);
setSize(400,400);
}
public void actionPerformed(ActionEvent event){
Object source = event.getSource();
int k = Integer.parseInt(c.getText());
int j = Integer.parseInt(d.getText());
double Result = k+j;


if(source==press){



v.setText(String.valueOf(Result));

}
if(source==clear){
d.setText("");
c.setText("");
v.setText("");
}
if(source==x){
//Object[] get={"YES","NO"};
//int tt=JOptionPane.showOptionDialog(null,"do you want //to exit","you //t",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_M//ESSAGE,null,get,get[1]);
//if(tt==JOptionPane.YES_OPTION)

System.exit(0);
//else if(tt==JOptionPane.NO_OPTION)
//JOptionPane.showMessageDialog(null,"you are welcome //back");
setVisible(false);

}
}
public static void main(String[]args){
Date date = new Date();
JOptionPane.showMessageDialog(null,date.toString(),"Date and time",JOptionPane.PLAIN_MESSAGE);
new Addn();
}
}




