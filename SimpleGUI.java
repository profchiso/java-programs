import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleGUI extends JFrame implements ActionListener{
JLabel pl = new JLabel("Enter the principal");
JTextField pt = new JTextField(10);
JLabel tl = new JLabel("Enter the Time");
JTextField tt = new JTextField(10);
JLabel rl = new JLabel("Enter the Rate");
JTextField rt = new JTextField(10);
JLabel sl = new JLabel("Simple interest");
JLabel al = new JLabel("");
JButton cb = new JButton("calculate");
JButton clearb = new JButton("clear");
JButton eb = new JButton("Exit");
JLabel respect = new JLabel("IN GOD I TRUST!",SwingConstants.CENTER);
JPanel pane = new JPanel();
   SimpleGUI(){
super("PROCHISO's Simple interest calculator");
Container con = this.getContentPane();
con.add(pane);
cb.addActionListener(this);
clearb.addActionListener(this);
eb.addActionListener(this);
pane.setLayout(new GridLayout(6,2));
pane.setBackground(Color.pink);
pane.add(pl);
pane.add(pt);
pane.add(tl);
pane.add(tt);
pane.add(rl);
pane.add(rt);
pane.add(sl);
pane.add(al);
pane.add(cb);
pane.add(clearb);
pane.add(eb);
pane.add(respect);
cb.setMnemonic('c');
clearb.setMnemonic('l');
eb.setMnemonic('E');
setResizable(false);
setSize(400,350);
setVisible(true);
}
public void actionPerformed(ActionEvent Event){
Object source = Event.getSource();
double p = Double.parseDouble(pt.getText());
double  t = Double.parseDouble(tt.getText());
double  r = Double.parseDouble(rt.getText());
double si=(p*t*r)/100;
  if(source==cb){
al.setText(String.valueOf(si));
}
  if(source==clearb){
pt.setText("");
rt.setText("");
tt.setText("");
al.setText("");
}
if(source==eb){
System.exit(0);
}
}
public static void main(String[]args){
new SimpleGUI();
}
}

