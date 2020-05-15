import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class atmp extends JFrame implements ActionListener{

JButton a =new JButton("WithDrawal");
JButton b=new JButton("Check Balance"); 
 JButton c=new JButton("Deposit");
JButton d=new JButton("Airtime Recharge");
 JButton e=new JButton("Change Pin");
 JButton f=new JButton("exit");

JPanel pane = new JPanel();
atmp(){
setTitle("ATM MAIN MENU");

Container con = this.getContentPane();
con.add(pane);
pane.setLayout(new GridLayout(3,2));

a.addActionListener(this);

b.addActionListener(this);

c.addActionListener(this);

d.addActionListener(this);

e.addActionListener(this);

f.addActionListener(this);
pane.add(a);
pane.add(b);
pane.add(c);
pane.add(d);
pane.add(e);
pane.add(f);

setSize(400,400);
setVisible(true);
}

public void actionPerformed(ActionEvent e){

Object source =e.getSource();

if(source==a){

}

if(source==b){

}

if(source==c){

}
if(source==d){

}
if(source==e){

}
if(source==f){
System.exit(0);
}
}
public static void main(String[] args){
new atmp();
}
}
