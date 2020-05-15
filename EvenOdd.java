import java.util.Scanner;
public class EvenOdd{
public static void main(String[] args){
Scanner n = new Scanner(System.in);

System.out.println("\n\tEnter the number you want to check");
int a = n.nextInt();
if(a%2==0){
System.out.println("\n\t the number "+ ""+ a+" "+"is an even number");
}
else{

System.out.println("\n\t the number "+ "" + a+" "+ "is an Odd number");
}
}
}