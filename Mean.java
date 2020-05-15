import java.util.Scanner;
public class Mean{
public static void main (String[] args){
Scanner input=new Scanner(System.in);

int sumx =0;


System.out.printf("%s%10s%10s","x","x-m","(x-m)^2");
for(int i =1;i<=5;i++){
System.out.println("\n\t\t");
int x =input.nextInt();

    sumx+=x;
double mean = sumx/5; 
double k = x-mean;

System.out.printf("\n\t" + k);

}

}
}