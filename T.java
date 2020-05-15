/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.event.ActionEvent;
// main class


public class T extends JFrame implements ActionListener {
  JButton one=new JButton("NAIRA TO DOLLAR");
  JButton two=new JButton(" DOLLAR TO NAIRA ");
  JButton three=new JButton("POUNDS TO NAIRA ");
  
  JButton four=new JButton("EXIT");
  JLabel r=new JLabel("IN GOD I TRUST!",SwingConstants.CENTER);
  JPanel pane=new JPanel();
    public T(){
        super("    PROFCHISO CURRENCY CONVERTER");
        
        Container con = this.getContentPane();
        con.add(pane);
        pane.setLayout(new GridLayout(3,2));
        pane.setBackground(Color.ORANGE);
        pane.add(one);
        pane.add(two);
        pane.add(three);
        pane.add(four);
        pane.add(r);
        pane.setToolTipText("CURRENCY CONVERTER MAIN MENU");
        four.setToolTipText("click to exit converter");
        three.setToolTipText("click to convert from pounds to naira");
        one.setToolTipText("click to convert from naira to dollar");
        two.setToolTipText("click to convert from dollar to naira");
        one.setBackground(Color.ORANGE);
        two.setBackground(Color.ORANGE);
        three.setBackground(Color.ORANGE);
        four.setBackground(Color.ORANGE);
        four.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        setResizable(false);
        setSize(400,400);
        setVisible(true);
        
    }
    
  

    
    // iner class naiara to dollar convertion
   private class N extends JFrame implements ActionListener{
       JLabel n=new JLabel("Enter naira value",SwingConstants.CENTER);
       JTextField nn= new JTextField(5);
        JLabel d=new JLabel("Dollar value =",SwingConstants.CENTER);
        JLabel dd=new JLabel("");
        JButton compute=new JButton("convert");
        JButton cc=new JButton("CLEAR");
          JButton ex=new JButton("EXIT OPTION");
        JPanel pp=new JPanel();
        JLabel r=new JLabel("IN GOD I TRUST!",SwingConstants.CENTER);
        N(){
            super("NAIRA TO DOLLAR");
            Container c =this.getContentPane();
            c.add(pp);
            pp.setLayout(new GridLayout(4,2));
            pp.add(n);
            pp.add(nn);
            pp.add(d);
            pp.add(dd);
            pp.add(compute);
            pp.add(cc);
            pp.add(ex);
            compute.setToolTipText("enter naira value and click convert to get its dollar Equivalent");
            ex.setToolTipText("click to exit Option");
            cc.setToolTipText("click to clear boxes");
            compute.addActionListener(this);
            cc.addActionListener(this);
            ex.addActionListener(this);
            cc.setBackground(Color.PINK);
             ex.setBackground(Color.PINK);
             n.setForeground(Color.BLUE);
            d.setForeground(Color.BLUE);
            dd.setForeground(Color.BLUE);
            compute.setForeground(Color.BLUE);
            cc.setForeground(Color.BLUE);
            ex.setForeground(Color.BLUE);
             r.setForeground(Color.BLUE);
            
             
            pp.add(r);
            compute.setBackground(Color.PINK);
            pp.setBackground(Color.PINK);
            setSize(400,400);
            setResizable(false);
            setVisible(true);
            
            
            
        }
     public void actionPerformed(ActionEvent v){  
       Object source =v.getSource();
      if(source==compute){
       double naria=Double.parseDouble(nn.getText());
       double doll=  naria/155;
      String f= String.format("$%.2f",doll);
      dd.setText(String.valueOf(f));
      }
     if(source==cc) {
         dd.setText("");
         nn.setText("");
     }
     if(source==ex){
         setVisible(false);
     }
     } 
       
   }
   
   
   
   
   
   //iner class  dollar to naira convertion begins
   
    private class D extends JFrame implements ActionListener{
       JLabel n=new JLabel("Enter dollar value",SwingConstants.CENTER);
       JTextField nn= new JTextField(5);
        JLabel d=new JLabel("naira value =",SwingConstants.CENTER);
        JLabel dd=new JLabel("",SwingConstants.CENTER);
        JButton compute=new JButton("convert");
        JButton cc=new JButton("CLEAR");
          JButton ex=new JButton("EXIT OPTION");
        JPanel pp=new JPanel();
        JLabel r=new JLabel("IN GOD I TRUST!",SwingConstants.CENTER);
        D(){
            super(" DOLLAR TO NAIRA ");
            Container c =this.getContentPane();
            c.add(pp);
            pp.setLayout(new GridLayout(4,2));
            pp.add(n);
            pp.add(nn);
            pp.add(d);
            pp.add(dd);
            pp.add(compute);
            pp.add(cc);
            pp.add(ex);
            compute.setToolTipText("enter dollar value and click convert to get its naira Equivalent");
            ex.setToolTipText("click to exit Option");
            cc.setToolTipText("click to clear boxes");
            compute.addActionListener(this);
            cc.addActionListener(this);
            ex.addActionListener(this);
            cc.setBackground(Color.GREEN);
             ex.setBackground(Color.GREEN);
            
              n.setForeground(Color.BLUE);
            d.setForeground(Color.BLUE);
            dd.setForeground(Color.BLUE);
            compute.setForeground(Color.BLUE);
            cc.setForeground(Color.BLUE);
            ex.setForeground(Color.BLUE);
            r.setForeground(Color.BLUE);
            pp.add(r);
            compute.setBackground(Color.GREEN);
            pp.setBackground(Color.green);
            setSize(400,400);
            setResizable(false);
            setVisible(true);
            
            
            
        }
     public void actionPerformed(ActionEvent j){  
       Object source =j.getSource();
     
        if(source==compute){
       double dollar=Double.parseDouble(nn.getText());
       double naira=  dollar*155;
      String f= String.format("?%.2f",naira);
      dd.setText(String.valueOf(f));
      }
       
        if(source==cc) {
         dd.setText("");
         nn.setText("");
     }
     if(source==ex){
         setVisible(false);
     }
     } 
       
   }
   
    //iner class  pounds to naira
    private class P extends JFrame implements ActionListener{
       JLabel n=new JLabel("Enter pound value",SwingConstants.CENTER);
       JTextField nn= new JTextField(5);
        JLabel d=new JLabel("naira value =",SwingConstants.CENTER);
        JLabel dd=new JLabel("",SwingConstants.CENTER);
        JButton compute=new JButton("convert");
         JButton cc=new JButton("CLEAR");
          JButton ex=new JButton("EXIT OPTION");
          
        JPanel pp=new JPanel();
        JLabel r=new JLabel("IN GOD I TRUST!",SwingConstants.CENTER);
        P(){
            super(" POUNDS TO NAIRA ");
            Container c =this.getContentPane();
            c.add(pp);
            pp.setLayout(new GridLayout(4,2));
            pp.add(n);
            n.setForeground(Color.MAGENTA);
            d.setForeground(Color.MAGENTA);
            dd.setForeground(Color.MAGENTA);
            compute.setForeground(Color.MAGENTA);
            cc.setForeground(Color.MAGENTA);
            ex.setForeground(Color.MAGENTA);
            r.setForeground(Color.MAGENTA);
            pp.add(nn);
            pp.add(d);
            pp.add(dd);
            pp.add(compute);
            
            pp.add(cc);
            pp.add(ex);
            
            compute.addActionListener(this);
            cc.addActionListener(this);
            ex.addActionListener(this);
            cc.setBackground(Color.CYAN);
             ex.setBackground(Color.CYAN);
            compute.setToolTipText("enter pounds value and click convert to get its naira Equivalent");
            ex.setToolTipText("click to exit Option");
            cc.setToolTipText("click to clear boxes");
            pp.add(r);
            compute.setBackground(Color.cyan);
            pp.setBackground(Color.cyan);
            setSize(400,400);
            setResizable(false);
            setVisible(true);
            
          
            
        }
     public void actionPerformed(ActionEvent j){  
       Object source =j.getSource();
       if(source==cc) {
         dd.setText("");
         nn.setText("");
     }
     if(source==ex){
         setVisible(false);
     }
       }
       
       
      
        
    
     }
    
  // Actionperformed main class
   public void actionPerformed(ActionEvent ee){
    Object source =ee.getSource();
    if(source==one){
     new N();   
    }
  if(source==two){
      new D();
  }          
 if(source==three){
     new P();
 }  
 
 if(source==four){
   


Object[] prof={"YES","NO"};
int tt=JOptionPane.showOptionDialog(null,"do you want to exit converter?"," profchiso's info ",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,prof,prof[1]);
if(tt==JOptionPane.YES_OPTION){

System.exit(0);
}
 if(tt==JOptionPane.NO_OPTION){
JOptionPane.showMessageDialog(null,"you are welcome back","profchiso's Message",JOptionPane.PLAIN_MESSAGE);
}


 }  
   
   
   }
//main method
    public static void main(String[] args){

  String username ;
      String password;
      int pass ;
      
      for(int i=1;i<=3;i++){
        username=JOptionPane.showInputDialog(null, "please enter your username","username",JOptionPane.YES_NO_OPTION);
      password=JOptionPane.showInputDialog(null, "please enter your password","password",JOptionPane.YES_NO_OPTION);
     
       if(username.equals("Chinedu") && password.equals("chiso123")){
            
           JOptionPane.showMessageDialog(null, "WELCOME TO PROFCHISO\nCURRENCY CONVERTER","welcome",JOptionPane.INFORMATION_MESSAGE);
Date date = new Date();
JOptionPane.showMessageDialog(null,date.toString(),"time and date info",JOptionPane.INFORMATION_MESSAGE);
new T();
          
           break;
       }
       else{
         JOptionPane.showMessageDialog(null, "wrong username and password combination","Error",JOptionPane.ERROR_MESSAGE);   
       
       }
      }
    }
     
}   
            
      
    
   

