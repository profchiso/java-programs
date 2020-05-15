 /*
*this program accept the amount of any currency
* and convert it to a desired
*one
*/


import java.util.*;

public class Currency{

public double dollarConv(double dval){
return 155*dval;
}

public double nairaConv(double nval){
return nval/155;
}

public static void main(String[]args){
Currency c=new Currency();
Scanner s=new Scanner(System.in);

System.out.println("\t************");
System.out.println("\t make a choice");
System.out.println("\t 1: dollar to naira");
System.out.println("\t 2: naira to dollar");
System.out.println();
System.out.println("\t************");
System.out.println("\t enter your Option");
int p=s.nextInt();

if(p==1){
System.out.println("\t enter the dollar value");
double damt=s.nextInt();
System.out.printf("\t%.2f%s%.2f",damt," USD=NGN ",c.dollarConv(damt));
}
}
}