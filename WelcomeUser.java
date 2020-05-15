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
 JOptionPane.showMessageDialog(null, "Hello welcome to java programming " + ans);

int option=JOptionPane.showConfirmDialog(null,"do u","quit",JOptionPane.YES_NO_OPTION);
if(option==0){
System.exit(0);
}
else{

 JOptionPane.showMessageDialog(null,"welcome back" );
}

 } // end method main

 } // end of class WelcomeUser  