import javax.swing.JOptionPane;

 public class WelcomeUser {
 public static void main(String[] args) {
 String msg = "Hello Wolrd";
 String ans ="";

 JOptionPane.showMessageDialog(null, msg );

 // accept the users name
 ans = JOptionPane.showInputDialog( null, "Enter your Name Please"
);


 // say hello to the user
 JOptionPane.showMessageDialog(null, "Hello " + ans );

 } // end method main

 } // end of class WelcomeUser  