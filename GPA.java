import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;

public class GPA extends JFrame implements ActionListener{

JPanel pane = new JPanel();

JLabel a = new JLabel("Name of student",SwingConstants.CENTER);
JLabel b = new JLabel("RegNumber",SwingConstants.CENTER);
JLabel c = new JLabel("No of courses",SwingConstants.CENTER);
JLabel d = new JLabel("GPA",SwingConstants.CENTER);
JLabel e = new JLabel("Total Credit unit",SwingConstants.CENTER);
JLabel cu = new JLabel("",SwingConstants.CENTER);
JLabel f = new JLabel("Remark",SwingConstants.CENTER);
JLabel rmk = new JLabel("",SwingConstants.CENTER);
JLabel Remark = new JLabel("",SwingConstants.CENTER);
JLabel respect = new JLabel("In God I trust!",SwingConstants.CENTER);

JTextField at = new JTextField(10);
JTextField bt = new JTextField(10);

//int[] no = new int[]{"1","2","3","4","5","6","7","8","9"};
JTextField select = new JTextField(10);

JButton compute = new JButton("compute");
JButton clear = new JButton("clear");
JButton ex = new JButton("Exit");

GPA(){

super("ProfChiso's Semester GPA Calculator");
Container con = this.getContentPane();
con.add(pane);
pane.setLayout(new GridLayout(8,2));
pane.setBackground(Color.pink);

compute.addActionListener(this);
clear.addActionListener(this);
ex.addActionListener(this);

compute.setMnemonic('c');
clear.setMnemonic('l');
ex.setMnemonic('E');


pane.add(a);
a.setForeground(Color.blue);
pane.add(at);
pane.add(b);
b.setForeground(Color.blue);
pane.add(bt);
pane.add(c);
c.setForeground(Color.blue);
pane.add(select);
pane.add(d);
d.setForeground(Color.blue);
pane.add(Remark);
Remark.setForeground(Color.blue);
pane.add(e);
e.setForeground(Color.blue);
pane.add(cu);
cu.setForeground(Color.blue);
pane.add(f);
f.setForeground(Color.blue);
pane.add(rmk);
rmk.setForeground(Color.blue);
pane.add(compute);
compute.setBackground(Color.pink);
compute.setForeground(Color.blue);
pane.add(clear);
clear.setForeground(Color.blue);
clear.setBackground(Color.pink);
pane.add(ex);
ex.setForeground(Color.blue);
ex.setBackground(Color.pink);
pane.add(respect);
respect.setForeground(Color.blue);
respect.setBackground(Color.blue);


setSize(600,600);
setResizable(false);
setVisible(true);

//addwindowListener(new WindowAdapter());
//public void windowClosing(windowEvent we){
//we.dispose();
//}

}

public void actionPerformed(ActionEvent Event){
Object source = Event.getSource();

int[] v = new int[] {1,2,3,4,5,6,7,8,9,10};


final double A = 4;
final double AB = 3.5;
final double B = 3.25;
final double BC = 3;
final double C = 2.75;
final double CD = 2.5;
final double D = 2.25;
final double E = 2;
final double F = 0;
double totalcreditunit=0;
double totalgp=0;
double finalgpa=0;
int creditunit;
double gp =0;
String Grade;

if(source==compute){


 int noc = Integer.parseInt(select.getText());
if(select.getText()==""){
JOptionPane.showMessageDialog(null,"please enter the no of course","Required",JOptionPane.INFORMATION_MESSAGE);
}
String name = at.getText();


for(int i = 1; i<=noc; i++){
 Grade = JOptionPane.showInputDialog(null,"enter your grade in capital letter for course  "+ i,"Grade",JOptionPane.QUESTION_MESSAGE);
String input;
input = JOptionPane.showInputDialog(null,"enter the credit unit for course  "+ i,"Credit Unit",JOptionPane.QUESTION_MESSAGE);
 creditunit =Integer.parseInt(input);


switch(Grade){
case "A":
gp = A*creditunit;
break;

case "AB":
gp = AB*creditunit;
break;

case "B":
gp = B*creditunit;
break;

case "BC":;
gp = BC*creditunit;
break;

case "C":
gp = C*creditunit;
break;

case "CD":
gp = CD*creditunit;
break;

case "D":
gp = D*creditunit;
break;
case "E":
gp = E*creditunit;
break;

case "F":
gp = F*creditunit;
break;
}


 totalcreditunit=totalcreditunit + creditunit;
 totalgp=totalgp + gp;
 finalgpa = totalgp/totalcreditunit;

String f= String.format("%.2f",finalgpa);

cu.setText(String.valueOf(totalcreditunit));
Remark.setText(String.valueOf(f));

if(finalgpa>=3.5){
rmk.setText("congrate  "+ ""+name+""+ "\n  You have made distinction");

}

if(finalgpa>=3 && finalgpa<3.5){
rmk.setText("congrate  "+ ""+name+""+ " \n  You have made upper credit");

}

if(finalgpa>=2.5 && finalgpa<3 ){
rmk.setText("not too bad  "+ ""+name+""+ " \n  You  made lower credit");

}

if(finalgpa>=1.75 && finalgpa<2.5){
rmk.setText("thats repeat grade   "+name);

}

if(finalgpa>=1.5 && finalgpa<1.75){
rmk.setText("if you repeat such grade again  "+ ""+name+""+ " \n  na waka tins o");

}


}


}
if(source==clear){
at.setText("");
bt.setText("");
select.setText("");
rmk.setText("");
cu.setText("");
Remark.setText("");

}
if(source==ex){


Object[] prof={"YES","NO"};
int tt=JOptionPane.showOptionDialog(null,"do you want to exit?"," profchiso's info ",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,prof,prof[1]);
if(tt==JOptionPane.YES_OPTION){

System.exit(0);
}
 if(tt==JOptionPane.NO_OPTION){
JOptionPane.showMessageDialog(null,"you are welcome back","profchiso's Message",JOptionPane.PLAIN_MESSAGE);
}



}
}

public static void main(String[]args){
  String username ;
      String password;
      int pass ;
      
      for(int i=1;i<=3;i++){
        username=JOptionPane.showInputDialog(null, "please enter your username","username",JOptionPane.YES_NO_OPTION);
      password=JOptionPane.showInputDialog(null, "please enter your password","password",JOptionPane.YES_NO_OPTION);
     
       if(username.equals("Chinedu") && password.equals("chiso123")){
            
           JOptionPane.showMessageDialog(null, "welcome","welcome",JOptionPane.INFORMATION_MESSAGE);
Date date = new Date();
JOptionPane.showMessageDialog(null,date.toString(),"time and date info",JOptionPane.INFORMATION_MESSAGE);
new GPA();
          
           break;
       }
       else{
         JOptionPane.showMessageDialog(null, "wrong username and password combination","Error",JOptionPane.ERROR_MESSAGE);   
       }

}
}
}