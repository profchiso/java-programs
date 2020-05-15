/*
 *this program calculate the kinetic energy
 *formula (k.E = 1/2mv^2)
 */
import java.util.Scanner;
public class KinetEnergy{
public static void main(String[]args){
Scanner input= new Scanner (System.in);
int m,v;
double k;
System.out.println("enter m");
m=input.nextInt();
System.out.println("enter v");
v=input.nextInt();
k=0.5*m*Math.pow(v,2);
System.out.println("the value of k ="+ k);
}
}
