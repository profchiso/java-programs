import java.util.Scanner;
public class Result{
public static void main(String[] args){
Scanner r = new Scanner(System.in);
float score;
String Grade;
System.out.println("Eneter your score to know your Grade ");
score = r.nextInt();
	if(score >= 75){
	   Grade="A";
	
System.out.println("congrate you have made" +"   "+ Grade);
	      }	
	if(score >= 70 && score <=74){
	   Grade="AB";
System.out.println("congrate you have made" +"   "+ Grade);
	}

if(score >= 65 && score <=69){
	   Grade="B";
System.out.println("congrate you have made" +"   "+ Grade);
	}

if(score >= 60 && score <=64){
	   Grade="CB";
System.out.println("congrate you have made" +"   "+ Grade);
	}

if(score >= 55 && score <=59){
	   Grade="C";
System.out.println("congrate you have made" +"   "+ Grade);
	}

if(score >= 50 && score <=54){
	   Grade="CD";
System.out.println("congrate you have made" +"   "+ Grade);
	}

if(score >= 45 && score <=49){
	   Grade="D";
System.out.println("congrate you have made" +"  "+ Grade);
	}

if(score >= 40 && score <=44){
	   Grade="E";
System.out.println("congrate you have made" +"   "+ Grade);
	}
if(score>=0 && score<=39){
Grade="F";
System.out.println("congrate you have made" + "   "+       Grade);
	}
}
}