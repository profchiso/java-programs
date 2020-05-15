import java.util.*;
public class BaseConverter{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter the number you want to convert");
 int num = input.nextInt();

String  bin,oct,hex;
bin=Integer.toBinaryString(num);
oct=Integer.toOctalString(num);
hex=Integer.toHexString(num);
System.out.println("\n\t the value of"+ " " + num+ "  "+"in binary ="+"" + bin);
System.out.println("\n\t the value of"+ " " + num +"  "+"in octal =" + "" +oct);
System.out.println("\n\t the value of"+ " " + num +"  "+"in hexadecimal =" +"" + hex);
}
}
