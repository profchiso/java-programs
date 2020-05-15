

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    static JTextField input = new JTextField(8);
    static JTextField output = new JTextField(8);
    static JButton plus = new JButton("+");
    static JButton minus = new JButton("-");
    static JButton times = new JButton("*");
    static JButton divide = new JButton("/");
    static JButton dot = new JButton(".");
    static JButton plusminus = new JButton("+-");
    static JButton clear = new JButton("c");
    static JButton equals = new JButton("=");
    static JButton res = new JButton("1/x");
    static JButton percent = new JButton("%");
    static JButton square = new JButton("x^2");
    static JButton squareroot = new JButton("sqroot");
    static JButton brac = new JButton("(");
    static JButton brak = new JButton(")");
    static JButton sin = new JButton("sin");
    static JButton cosin = new JButton("cos");
    static JButton tan = new JButton("tan");
    static JButton sininverse = new JButton("sin-1");
    static JButton cosinverse = new JButton("cos-1");
    static JButton taninverse = new JButton("tan-1");
    static JButton log = new JButton("log");
    static JButton factorial = new JButton("n!");
    static JLabel e = new JLabel("enter number");
     static JLabel a = new JLabel("Result");
      static JLabel r = new JLabel("");
    JPanel pane = new JPanel();

    public Calculator() {
        super("Profchiso's calculator");
        Container con = this.getContentPane();
        tan.addActionListener(this);
      cosin.addActionListener(this);
      sin.addActionListener(this);
      log.addActionListener(this);
      sininverse.addActionListener(this);
      cosinverse.addActionListener(this);
      taninverse.addActionListener(this);
      res.addActionListener(this);
      square.addActionListener(this);
      squareroot.addActionListener(this);
      percent.addActionListener(this);
      clear.addActionListener(this);
      factorial.addActionListener(this);
      plus.addActionListener(this);
      minus.addActionListener(this);
      times.addActionListener(this);
      divide.addActionListener(this);
        con.add(pane);
        
        pane.setLayout(new GridLayout(6, 4));
        pane.add(e);
        pane.add(input);
        pane.add(a);
        pane.add(r);
        pane.add(plus);
        pane.add(minus);
        pane.add(times);
        pane.add(divide);
        pane.add(dot);
        pane.add(plusminus);
        pane.add(clear);
        pane.add(equals);
        pane.add(res);
        pane.add(percent);
        pane.add(square);
        pane.add(squareroot);
        pane.add(sin);
        pane.add(cosin);
        pane.add(tan);
        pane.add(sininverse);
        pane.add(cosinverse);
        pane.add(taninverse);
        pane.add(factorial);
        pane.add(log);
        setVisible(true);
        setSize(400, 400);


    }

    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        int firstnumber,secondnumber;
        double result;
        firstnumber =Integer.parseInt(input.getText());
        
        
        
long facto =1;

for(int i =1;i<=firstnumber;i++)
facto*=i;
        
        
        if(source==tan){
            result = Math.tan(firstnumber);
            
            r.setText(String.valueOf(result));
        }
        if(source==sin){
          result = Math.sin(firstnumber);
          r.setText(String.valueOf(result));
        }
        if(source==cosin){
            result = Math.cos(firstnumber);
            r.setText(String.valueOf(result));
        }
        if(source==log){
            result = Math.log(firstnumber);
            r.setText(String.valueOf(result));
        }    
    if(source==sininverse){
        result = Math.asin(firstnumber);
        r.setText(String.valueOf(result));
    }
if(source==cosinverse){
   result = Math.acos(firstnumber);
        r.setText(String.valueOf(result));  
}

if(source==taninverse){
     result = Math.atan(firstnumber);
        r.setText(String.valueOf(result));
}

if(source==res){
    result = 1/firstnumber;
    r.setText(String.valueOf(result));
}
if(source==square){
    result = Math.pow(firstnumber, 2);
    r.setText(String.valueOf(result));
}

if(source==squareroot){
    result = Math.sqrt(firstnumber);
    r.setText(String.valueOf(result));
}
if(source==percent){
    result = firstnumber/100;
    r.setText(String.valueOf(result));
}
if(source==clear){
    input.setText("");
    r.setText("");
}

if(source==factorial){
   r.setText(String.valueOf(facto));  
}
if(source==plus){
    input.setText("");
    secondnumber  =Integer.parseInt(input.getText());
    result = firstnumber + secondnumber;
    r.setText(String.valueOf(result)); 
}
    
    

    }

    public static void main(String[] args) {
        new Calculator();
    }
}
