import javax.swing.JOptionPane;

public class Quadratic{

public static void main(String[] args){

int a,b,c;
double x1,x2,d;
String input;
String output;

input =JOptionPane.showInputDialog(null,"Enter the value of a","input",JOptionPane.QUESTION_MESSAGE);
a= Integer.parseInt(input);

input =JOptionPane.showInputDialog(null,"Enter the value of b","input",JOptionPane.QUESTION_MESSAGE);
b= Integer.parseInt(input);

input =JOptionPane.showInputDialog(null,"Enter the value of c","input",JOptionPane.QUESTION_MESSAGE);
c= Integer.parseInt(input);


d = Math.pow(b,2)-4*a*c;

x1=(-b+ Math.sqrt(d))/(2*a);
x2=(-b- Math.sqrt(d))/(2*a);
JOptionPane.showMessageDialog(null,x1,"x1", JOptionPane.INFORMATION_MESSAGE);
JOptionPane.showMessageDialog(null,x2,"x2",JOptionPane.INFORMATION_MESSAGE);


}
}