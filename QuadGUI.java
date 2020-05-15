import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;

public class QuadGUI extends JFrame implements ActionListener{
JLabel al = new JLabel("Enter a",SwingConstants.CENTER);
JTextField at = new JTextField(10);

JLabel bl = new JLabel("Enter b",SwingConstants.CENTER);
JTextField bt = new JTextField(10);

JLabel cl = new JLabel("Enter c",SwingConstants.CENTER);
JTextField ct = new JTextField(10);

JLabel x1 = new JLabel("x1",SwingConstants.CENTER);
JLabel x1a = new JLabel("",SwingConstants.LEFT);
JLabel x2 = new JLabel("x2",SwingConstants.CENTER);
JLabel x2a = new JLabel("",SwingConstants.LEFT);

JButton cb = new JButton("calculate");
JButton clearb = new JButton("clear");
JButton eb = new JButton("Exit");
JLabel r = new JLabel("IN God I TRUST!",SwingConstants.CENTER);
JPanel pane = new JPanel();
 public QuadGUI(){
super(" profchiso's QUADRATIC EQUATION SOLVER");
Container con = this.getContentPane();
con.add(pane);
pane.setLayout(new GridLayout(7,2));
cb.addActionListener(this);
clearb.addActionListener(this);
eb.addActionListener(this);
pane.add(al);
al.setForeground(Color.blue);
pane.add(at);
pane.add(bl);
bl.setForeground(Color.blue);
pane.add(bt);
pane.add(cl);
cl.setForeground(Color.blue);
pane.add(ct);
pane.add(x1);
x1.setForeground(Color.blue);
pane.add(x1a);
x1a.setForeground(Color.blue);
pane.add(x2);
x2.setForeground(Color.blue);
pane.add(x2a);
x2a.setForeground(Color.blue);
pane.add(cb);
cb.setForeground(Color.blue);
pane.add(clearb);
clearb.setForeground(Color.blue);
pane.add(eb);
eb.setForeground(Color.blue);
pane.add(r);
r.setForeground(Color.blue);
cb.setMnemonic('c');
setVisible(true);
setResizable(false);
setSize(400,400);
}

public void actionPerformed(ActionEvent e){

Object source = e.getSource();

int a = Integer.parseInt(at.getText());
int b = Integer.parseInt(bt.getText());
int c = Integer.parseInt(ct.getText());

double d = Math.pow(b,2)-(4*a*c);

double x1 =-b + Math.sqrt(d)/(2*a);
double x2 =-b - Math.sqrt(d)/(2*a);
if(source==cb){
x1a.setText(String.valueOf(x1));
x2a.setText(String.valueOf(x2));
}
if(source==clearb){
bt.setText("");
at.setText("");
ct.setText("");
x1a.setText("");
x2a.setText("");
}
if(source==eb){
System.exit(0);
}

}



public static void main(String[]args){

String username ;
      String password;
      int pass ;
      
      for(int i=1;i<=3;i++){
        username=JOptionPane.showInputDialog(null, "please enter your username","username",JOptionPane.YES_NO_OPTION);
      password=JOptionPane.showInputDialog(null, "please enter your password","password",JOptionPane.YES_NO_OPTION);
     
       if(username.equals("Chinedu") && password.equals("chiso123")){
            
           JOptionPane.showMessageDialog(null, "welcome","welcome",JOptionPane.INFORMATION_MESSAGE);
Date date = new Date();
JOptionPane.showMessageDialog(null,date.toString(),"Date and time",JOptionPane.PLAIN_MESSAGE);
new QuadGUI();
break;
}
 else{
         JOptionPane.showMessageDialog(null, "wrong username and password combination","Error",JOptionPane.ERROR_MESSAGE);   
       }
}
}
}