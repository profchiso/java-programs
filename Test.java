import javax.swing.*;
public class Test{
public static void main(String[]args){
Object[] p={"YES","CANCEL"};
int t=JOptionPane.showOptionDialog(null,"do you want to exit","info",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,p,p[1]);
if(t==JOptionPane.YES_OPTION){
System.exit(0);
}
}
}