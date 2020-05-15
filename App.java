import java.util.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.Graphics;
public class App {
   
    public static void main(String[] args) {
        
         Random r = new Random();
         int face =0;
    for(int i=1;i<=40;i++){
     face = 1+r.nextInt(6);
    System.out.printf("\t%d",face);
   if(i%5==0){
        
    
        
    System.out.println();
    
    }
    
    }  
    }
}