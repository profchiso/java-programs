import java.util.Scanner;

public class Combination
{

public static void main(String[] args){

Scanner n = new Scanner(System.in);
long facto = 1;
long mfacto = 1;
long nfacto = 1;
System.out.println("Enter the value of n ");

int num = n.nextInt();
System.out.println("Enter the value of r");
int r = n.nextInt();

for(int i = 1;i<=num; i++)
       facto*=i;
int k=num-r;
for(int j = 1; j<=k;j++)
       mfacto*=j;
for(int v =1; v<=r;v++)
      nfacto*=v;

double combination=facto/(mfacto*nfacto);
System.out.println("the  value of  "+num+"Combination"+r+ "  =  " + combination);

}
}