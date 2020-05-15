import java.util.Scanner;
public class Max{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("enter the firstnumber");
int firstno=s.nextInt();

System.out.println("enter the secondnumber");
int secondno=s.nextInt();

if(firstno>secondno){
System.out.println("the max btw"+firstno+"and"+secondno+"is"+firstno);
}
else{
System.out.println("the max btw"+firstno+"and"+secondno+"is"+secondno);

}
}
}