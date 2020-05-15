import java.util.*;
public class Ludo{
public static void main(String[]args){
Random r=new Random();
for(int i=0;i<=20;i++)
int face =1+r.nextInt(6);
if(i%5==0)
System.out.printf("%d"+face);
}
}