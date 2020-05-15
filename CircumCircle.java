import java.util.Scanner;
	public class CircumCircle{
public static void main (String[] args){
Scanner input = new Scanner(System.in);
int r;
double c;
System.out.println("Enter the value of r");
r = input.nextInt();
c = 2*Math.PI*r;
System.out.println("the circumference of the circle =" + c);
}
}