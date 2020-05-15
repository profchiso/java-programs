import java.util.*;
public class Rand{
public static void main(String[] args){
Random gen = new Random();

for(int counter=1;counter<=20;counter++){
int face=1+gen.nextInt(6);
//System.out.println("\n\t the generated numbers="+ face);
System.out.printf("\t%d",face);
if(counter%5==0)
System.out.print("");
}
}
}