import java.util.Scanner;
import java.lang.Math;
public class QuadraticEquation{
public static void main(String[] args){
Scanner entervalue = new Scanner(System.in);
int a,b,c;
double x1,x2,d;
System.out.println("Enter the value of a");
	a = entervalue.nextInt();
 if(a==0)
{
System.out.println("not a quad Eqn, a cannot be zero");

}
System.out.println("please Enter a non zero value for a");
	a = entervalue.nextInt();
System.out.println("Enter the value of b");
	b = entervalue.nextInt();

System.out.println("Enter the value of c");
	c = entervalue.nextInt();

 
	d = Math.pow(b,2) -(4*a*c);
  if(d<0)
{
System.out.println("Cannot compute the square root of negative number");
}
  if(d==0)
{
System.out.println("Equal roots");
         x1=-b/(2*a);
         x2=-b/(2*a);

System.out.println("x1 = " + x1);

System.out.println("x2 = " + x2);
}
  if(d>0)
{

System.out.println("distint roots");
     x1 = (-b + Math.sqrt(d))/(2*a);
     x2 = (-b - Math.sqrt(d))/(2*a);

System.out.println("x1 = " + x1);

System.out.println("x2 = " + x2);
}
}
}
