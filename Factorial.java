import java.util.Scanner;

public class Factorial{

public static void main(String[] args){

Scanner n = new Scanner(System.in);
long facto = 1;
System.out.println("Enter the number you want to find the factorial");

int num = n.nextInt();

for(int i =1; i<=num; i++)

facto*=i;
System.out.println("the factorial of   "    +   num + "   =  "+facto);
}
}