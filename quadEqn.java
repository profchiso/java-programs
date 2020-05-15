// quadratic equation program
// supply a, b, c, and have your
// x1 and x2

import java.util.Scanner;
 public class quadEqn
	{ 
public static void main(String[] args)
	{
    Scanner input = new Scanner(System.in);
//declaring variabes
            int a,b,c;
            double x1,x2,d;
//accepting inputs
  System.out.println("Enter the value of a");
	a = input.nextInt();

  System.out.println("Enter the value of b");
	b = input.nextInt();

System.out.println("Enter the value of c");
	c = input.nextInt();

//fixing the brain
		
	

d = Math.pow(b,2)-(4*a*c);
			x1=(-b+Math.sqrt(d))/(2*a);

			x2=(-b-Math.sqrt(d))/(2*a);
  System.out.println("X1 =" + x1);

  System.out.println("X2 =" + x2);
}
}


