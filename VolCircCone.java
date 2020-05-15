import java.util.Scanner;
public class VolCircCone{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
double v;
int r,h;
System.out.println("Enter the value of r");
r = input.nextInt();
System.out.println("Enter the value of h");
h = input.nextInt();
v = 0.3*Math.PI*h*Math.pow(r,2);
System.out.println("the value of the volume of the circular cone =" + v);
}
}