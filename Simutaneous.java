import java.util.*;

 public class Simutaneous{ 
public static void main(String[] args){
    Scanner input = new Scanner(System.in);

System.out.print("Enter the value of a  :");
	int a = input.nextInt();

System.out.print("Enter the value of b  :");
	int b = input.nextInt();

System.out.print("Enter the value of c  :");
	int c = input.nextInt();




System.out.print("Enter the value of d  :");
	int d = input.nextInt();

System.out.print("Enter the value of e  :");
	int e = input.nextInt();


System.out.print("Enter the value of f  :");
	int f = input.nextInt();

System.out.println("\n\tEqn 1 =    "+ a + "x" + "+"  + b + "y" + "="  + c ); 

System.out.println("\n\tEqn 2 =    "+ d + "x" + "+"  + e + "y" + "="  + f ); 

int j =(c*d)-(a*f);
int n =(b*d)-(a*e);

double y =j/n;

   double x =(c-(b*y))/a;

System.out.println("y="+y);

System.out.println("x="+x);
}
}
