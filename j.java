import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class j extends JFrame implements ActionListener{

JLabel answer = new JLabel("");
JPanel pane = new JPanel();
JButton press = new JButton("click");

j(){
super("event");
//setBound(100,100,300,200);
//setDefaultOperation(JFrame.EXIT_ON_CLOSE);
Container con = this.getContentPane();
con.add(pane);
press.setMnemonic('c');
press.addActionListener(this);
pane.add(answer);
pane.add(press);
press.requestFocus();
setVisible(true);
setSize(200,150);
}
public void actionPerformed(ActionEvent event){
Object source = event.getSource();
if(source==press){
answer.setText("enjoy");
JOptionPane.showMessageDialog(null,"ok","message",JOptionPane.PLAIN_MESSAGE);
}
}
public static void main(String[]args){
new j();
}
}