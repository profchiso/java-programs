import java.util.Scanner;
public class NumOperation{

public int addNum(int a, int b){
return(a+b);
}

public int subNum(int a, int b){
return (a-b);
}

public int multNum(int a, int b){
return (a*b);
}

public int divNum(int a, int b){
return (a/b);
}

public static void main(String[] args){
Scanner input= new Scanner(System.in);
NumOperation numop= new NumOperation();

System.out.print("\n\t Enter the first number  : ");
int x= input.nextInt();

System.out.print("\n\t Enter the second number  : ");
int y= input.nextInt();

System.out.println("\n\t the sum of  " +x+"and"+y+"="+ numop.addNum(x,y));

System.out.println("\n\t the value of "+ x + "  " + "minus"+ "  "+ y +" "+"="+ numop.subNum(x,y));

System.out.println("\n\t the value of ="+ numop.multNum(x,y));

System.out.println("\n\t the value of ="+ numop.divNum(x,y));

}
}