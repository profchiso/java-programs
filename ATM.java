import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class ATM extends JFrame implements ActionListener{

static JButton a,b,c,d,f,e;
JFrame fe;
JPanel pane = new JPanel();
ATM(){
setTitle("ATM MAIN MENU");
a=new JButton("WithDrawal");

b=new JButton("Check Balance");

c=new JButton("Deposit");
d=new JButton("Airtime Recharge");
e=new JButton("Change Pin");
f=new JButton("exit");


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



addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent w){
fe.dispose();
}
});




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
public static void main(String []args){
for(int i=1;i<=3;i++)

String accNo = JOptionPane.showInputDialog(null,"enter your acc no","acc no",JOptionPane.INFORMATION_MESSAGE);


String password = JOptionPane.showInputDialog(null,"enter your pin","password",JOptionPane.INFORMATION_MESSAGE); 

 

if(accNo.equals("8036009397") && password.equals("1910")){



new ATM();
break;
}
else
JOptionPane.showMessageDialog(null,"incorrect accNo and password combination","info",JOptionPane.PLAIN_MESSAGE);
}
}
