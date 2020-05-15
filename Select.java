import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Select extends JFrame implements ActionListener{
JLabel a= new JLabel("select",SwingConstants.CENTER);

String[]choose=new String[]{"1","2","3","4","5","6","7","8","9"};

JComboBox s = new JComboBox(choose);
JPanel pane=new JPanel();
JButton v = new JButton("print");
public Select(){
super("using combobox");
Container con = this.getContentPane();
con.add(pane);
pane.setLayout(new GridLayout(2,1));
pane.add(a);
pane.add(s);
pane.add(v);
v.addActionListener(this);
setSize(200,200);
setResizable(false);
setVisible(true);
}
public void actionPerformed(ActionEvent e){
Object source=e.getSource();
if(source==v){
}
}
public static void main(String[]args){
new Select();

}
}
