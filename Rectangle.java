import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rectangle extends JFrame{
private JLabel lengthL,widthL,areaL,perimeterL;

private JTextField lengthTF,widthTF,areaTF,perimeterTF;

private JButton calculateB,exitB;

private calculateButtonHandler cbHandler;

private ExitButtonHandler ebHandler;

public Rectangle();

lengthL = new JLabel("Enter the length",SwingConstants.RIGHT);

widthL = new JLabel("Enter the width",SwingConstants.RIGHT);

areaL = new JLabel("Area",SwingConstants.RIGHT);

perimeterL new JLabel("Perimeter",SwingConstants.RIGHT);

	lengthTF = new JTextField(10);
	widthTF = new JTextField(10);
	areaTF = new JTextField(10);
	perimeterTF = new JTextField(10);

calculateB = new JButton("Calculate");
cbHandler = new calculateButtonHandler();
calculateB.addActionListener(cbHandler);


exitB = new JButton ("Exit");
ebHandler = new ExitButtonHandler();
exitB,addActionListener(ebHandler);

setTitle("Area and perimeter or rectangle");

Container pane = getContentPane();
pane.setLayout(new GridLayout(5,2));

pane.add(lengthL);
pane.add(lengthTF);
pane.add(widthL);
pane.add(widthTF);
pane.add(areaL);
pane.add(areaTF);
pane.add(perimeterL);
pane.add(perimeterTF);
pane.add(calculateB);
pane.add(exitB);


 setSize(400,300);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}


private class calculateButtonHandler implements ActionListener{

public void actionperformed(ActionEvent e){

double width,length,area, perimeter;
length = Double.parseDouble(lengthTF.getText());
width = Double.parseDouble(widthTF.getText());

area = length * width;
perimeter = 2(length + width);

areaTF.setText(" " + area);
perimeter.setText(" "+ perimeter);
}
}

private class ExitButtonHandler implements ActionListener{

public void actionperformed(ActionEvent e){

System.exit(0);
}
}
public static void main(String [] args){
Rectangle r = new Rectangle();
}
}













