import java.util.Scanner;
 public class Gp{ 
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
int a,r,n;
System.out.println("\n\tEnter a  :  ");
 a = input.nextInt();

System.out.println("\n\tEnter r  :  ");
 r = input.nextInt();

System.out.println("\n\tEnter n  :  ");
 n = input.nextInt();

double nth= a*Math.pow(r,n-1);

System.out.println("\n\tthe " + n + "th   term of the Gp ="+ nth);
}
}
