import java.util.Scanner;
 public class EvenNum{ 
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
int n =50;
System.out.println("even and odd numbers from 1 to 100");
System.out.printf("\n%s\t%4s","even numbers","odd numbers");
for( int i =1;i<=n;i++){
int even = 2*i;
int odd=(2*i)-1;



System.out.printf("\n%d\t%11d" , even,odd);
}
}
}