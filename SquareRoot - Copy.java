import java.util.Scanner;
 public class SquareRoot{ 
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
int n;


System.out.println("Enter the value of n");
	n = input.nextInt();


if(n>0){
double sq=Math.sqrt(n);

System.out.println("the square root of" +  n  +  "="  +  sq );


}
if(n<0){
double sq=Math.sqrt(n/-1);


System.out.println("the square root of" +  n  + "="  +  sq + "j");
}

}

}