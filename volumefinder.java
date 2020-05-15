import java.util.Scanner;
public class volumefinder{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int r,h;
double v;
System.out.print ("\n\t enter the value of r");
r=input.nextInt();
System.out.print ("\n\t enter the value of h");
h=input.nextInt();
v=Math.PI *Math.pow(r,2)*h;
System.out.print ("\n\t the volume="+v);
}
}

 
