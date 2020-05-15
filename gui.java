import java.awt.*; 
import javax.swing.*;
public class gui extends JFrame{

JPanel pane = new JPanel();
JButton b = new JButton("click");

gui(){
super("JPrompt Demo");


Container c = this.getContentPane();
c.add(pane);


b.setMnemonic('p');
pane.add(b);

b.requestFocus();
setVisible(true);
setSize(400,300);
setTitle("profchiso gui program");
}



public static void main(String[] args){
new gui();



}
}