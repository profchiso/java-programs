public class StringManipulation{

public static void main(String[] args){

String word = "Java is simple";
char[] charArray = new char[5];
StringBuilder buffer = new StringBuilder("java is simple");
System.out.printf("\n word:%s\n", word);

System.out.printf("\n Length of word:%d\n",word.length());

buffer.setLength(10);
System.out.printf("\n\n buffer = %s\n",buffer.toString());

System.out.printf("\n word:\n\"%s\"\n\n\"%s\"\n\n\"%s\n\n","java","is","simple");

}
}