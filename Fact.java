import javax.swing.JOptionPane;
public class Fact{
public static void main(String[]args){
String i;
long facto=1;
i=JOptionPane.showInputDialog(null,"Enter the number you want to calc its factorial","info",JOptionPane.WARNING_MESSAGE);
int num =Integer.parseInt(i);
for(int k=1;k<=num;k++)

facto*=k;
JOptionPane.showMessageDialog(null,"the factorial="+facto,"Result",JOptionPane.INFORMATION_MESSAGE);

}
}