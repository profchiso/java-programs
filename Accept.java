import javax.swing.JOptionPane;
public class Accept{
public static void main(String[]args){
String i;
i=JOptionPane.showInputDialog(null,"Enter any number ","info",JOptionPane.INFORMATION_MESSAGE );
JOptionPane.showMessageDialog(null,"input="+i,"Result",JOptionPane.PLAIN_MESSAGE);
}
}
