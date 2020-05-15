import java.util.Scanner;
   public class simple
	{
public static void main(String[] args)
 	{
Scanner input = new Scanner(System.in);
		int p,t,r;
		double simple;
System.out.println(" enter the value of p");
	p = input.nextInt();

System.out.println(" enter the value of t");
	t = input.nextInt();

System.out.println(" enter the value of r");
	r = input.nextInt();

		simple = (p*t*r)/100;
System.out.println("the simple interest is" + simple);
	
	}//end of class
}//end of method main
