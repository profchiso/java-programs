import javax.swing.JOptionPane;
public class Addition{
public static void main(String[] args){


 int a;
     int b;
     int sum;
     String input;
     String output;

     input = JOptionPane.showInputDialog( null, "Enter first integer number",
"Adding Integers", JOptionPane.QUESTION_MESSAGE );
     a = Integer.parseInt(input);
 input = JOptionPane.showInputDialog(null, "Enter second integer number",
"Adding Integers", JOptionPane.QUESTION_MESSAGE );
 b= Integer.parseInt(input);
 sum = a +b;
 JOptionPane.showMessageDialog( null, sum, "Adding two integers",
JOptionPane.INFORMATION_MESSAGE );
    }

}
