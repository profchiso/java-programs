import java.util.Scanner;
public class powerfinder{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
int i,r;
double p;
System.out.print("\n\t enter the value of i");
i=input.nextInt();
System.out.print("\n\t enter the value of r");
r=input.nextInt();
p=Math.pow(i,2)*r;
System.out.print("\n\t the jouleslaw="+p);
}
}
 