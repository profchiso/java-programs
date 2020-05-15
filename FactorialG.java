import javax.swing.*;
public class FactorialG{
public static void main(String[] args){
	String input;
	//string output;
	int num;
	long facto =1;
input = JOptionPane.showInputDialog(null,"Enter the number you want to find the factorial");
num=Integer.parseInt(input);
for(int i =1;i<=num; i++)
facto*=i;

JOptionPane.showMessageDialog(null,facto,"Result",JOptionPane.INFORMATION_MESSAGE);
}
}



