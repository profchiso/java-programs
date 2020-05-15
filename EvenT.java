import java.util.Scanner;
public class EvenT{
public static void main(String[] args){
Scanner s= new Scanner(System.in);
System.out.print("Enter a number");
int num=s.nextInt();

System.out.println((num%2==0)?"even num":"odd num");
}
}