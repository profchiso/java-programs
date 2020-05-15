import java.util.Scanner;
import java.util.Date;
public class Permutation{
public static void main(String[] args){

Scanner accept = new Scanner(System.in);

System.out.print("\n");
Date date = new Date();

System.out.println("the current time is" + "    "+ date.toString());
System.out.println("    ");
System.out.print("\tEnter the value of n:  ");
double n = accept.nextDouble();
System.out.print("\t Enter the value of r:  ");
double r = accept.nextDouble();
double NR = n-r;
double fact = 1, facto=1;
   for(int i=1;i<=n;i++ ){
fact = fact*i;
}
for(int j=1;j<=NR;j++){
facto= facto*j;
}
double permutation =fact/facto;
System.out.println("the result of" + "  "+ n + "   "+ "permutation"+ " "+ r + " " + " is ="+ permutation);
}
}