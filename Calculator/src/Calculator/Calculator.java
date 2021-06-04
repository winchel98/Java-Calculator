package Calculator;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculator {
JFrame windows= new JFrame();
// Creation Labal, Field and button

JLabel label= new JLabel("");
JTextField Field= new JTextField();
JButton btn0 = new JButton("0");
JButton btn1 = new JButton("1");
JButton btn2 = new JButton("2");
JButton btn3 = new JButton("3");
JButton btn4 = new JButton("4");
JButton btn5 = new JButton("5");
JButton btn6 = new JButton("6");
JButton btn7 = new JButton("7");
JButton btn8 = new JButton("8");
JButton btn9 = new JButton("9");
JButton btn = new JButton(".");
JButton btnC = new JButton("C");
JButton btnD = new JButton("DEL");
JButton btnE = new JButton("=");
JButton btnM = new JButton("x");
JButton btnDiv = new JButton("/");
JButton btnPlus = new JButton("+");
JButton btnMinus = new JButton("-");
JButton btnSquare = new JButton("x\u00B2");
JButton btnReciprocal = new JButton("1/x");
JButton btnSqrt = new JButton("\u221A");
Calculator()
{
	GUI();
	btn();
	
}

public void GUI()
{
	windows.setSize(300, 495);
	windows.getContentPane().setBackground(Color.LIGHT_GRAY);
	windows.getContentPane().setLayout(null);
	windows.setTitle("Calculator");
	windows.setVisible(true);
	windows.setLocationRelativeTo(null);
	windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windows.setResizable(false);
	}
public class Playbook {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();
	}

}

public void btn()
{
//Label components
	label.setBounds(10, 440, 60, 40);
	label.setForeground(Color.black);
    label.setFont(new Font("Bitstream Charter", Font.BOLD, 8));
    windows.add(label);

//Field components
    Field.setBounds(13, 10, 270, 80);
	windows.add(Field);
    Field.setEditable(false);
    Field.setHorizontalAlignment(SwingConstants.RIGHT);
   
    //Setting property of button 7
    btn7.setBounds(10, 230, 60, 40);
    btn7.setFont(new Font("Bitstream Charter", Font.BOLD, 20));
    windows.add(btn7);
    
    // Setting property of button 8
    btn8.setBounds(80, 230, 60, 40);
    btn8.setFont(new Font("Bitstream Charter", Font.BOLD, 20));
    windows.add(btn8);

    //Setting property of button 9
    btn9.setBounds(150, 230, 60, 40);
    btn9.setFont(new Font("Bitstream Charter", Font.BOLD, 20));
    windows.add(btn9);

    //Setting property of button 4
    btn4.setBounds(10, 290, 60, 40);
    btn4.setFont(new Font("Bitstream Charter", Font.BOLD, 20));
    windows.add(btn4);

   //Setting property of button 5
    btn5.setBounds(80, 290, 60, 40);
    btn5.setFont(new Font("Bitstream Charter", Font.BOLD, 20));
    windows.add(btn5);

    //Setting property of button 6
    btn6.setBounds(150, 290, 60, 40);
    btn6.setFont(new Font("Bitstream Charter", Font.BOLD, 20));
    windows.add(btn6);

    //Setting property of button 1
    btn1.setBounds(10, 350, 60, 40);
    btn1.setFont(new Font("Bitstream Charter", Font.BOLD, 20));
    windows.add(btn1);

    //Setting property of button 0
    btn0.setBounds(10, 410, 130, 40);
    btn0.setFont(new Font("Bitstream Charter", Font.BOLD, 20));
    windows.add(btn0);
 
    //Setting property of button dot
    btn.setBounds(150, 410, 60, 40);
    btn.setFont(new Font("Bitstream Charter", Font.BOLD, 20));
    windows.add(btn);
    

    //Setting property of button 3 new
    btn3.setBounds(150, 350, 60, 40);
    btn3.setFont(new Font("Bitstream Charter", Font.BOLD, 20));
    windows.add(btn3);

    //Setting property of button 2 new
    btn2.setBounds(80, 350, 60, 40);
    btn2.setFont(new Font("Bitstream Charter", Font.BOLD, 20));
    windows.add(btn2);

   //Setting property of button =
    btnE.setBounds(220, 350, 60, 100);
    btnE.setFont(new Font("Bitstream Charter", Font.BOLD, 20));
    btnE.setBackground(Color.black);
    btnE.setForeground(Color.white);
    windows.add(btnE);
    

   //Setting property of button /
    btnDiv.setBounds(220, 110, 60, 40);
    btnDiv.setFont(new Font("Bitstream Charter", Font.BOLD, 20));
    btnDiv.setBackground(Color.black);
    btnDiv.setForeground(Color.white);
    windows.add(btnDiv);

    //Setting property of button square root
    btnSqrt.setBounds(10, 170, 60, 40);
    btnSqrt.setFont(new Font("Arial", Font.BOLD, 18));
    windows.add(btnSqrt);

    //Setting property of button X
    btnM.setBounds(220, 230, 60, 40);
    btnM.setFont(new Font("Bitstream Charter", Font.BOLD, 20));
    windows.add(btnM);
    btnM.setBackground(Color.black);
    btnM.setForeground(Color.white);
    
    //Setting property of button -
    btnMinus.setBounds(220, 170, 60, 40);
    btnMinus.setFont(new Font("Bitstream Charter", Font.BOLD, 20));
    btnMinus.setBackground(Color.black);
    btnMinus.setForeground(Color.white);
    windows.add(btnMinus);
    //Setting property of button +
    btnPlus.setBounds(220, 290, 60, 40);
    btnPlus.setFont(new Font("Bitstream Charter", Font.BOLD, 20));
    btnPlus.setBackground(Color.black);
    btnPlus.setForeground(Color.white);
    windows.add(btnPlus);

    //Setting property of button square
    btnSquare.setBounds(80, 170, 60, 40);
    btnSquare.setFont(new Font("Bitstream Charter", Font.BOLD, 20));
    windows.add(btnSquare);

    //Setting property of reciprocal button
    btnReciprocal.setBounds(150, 170, 60, 40);
    btnReciprocal.setFont(new Font("Bitstream Charter", Font.BOLD, 15));
    windows.add(btnReciprocal);

    //Setting property of delete button
    btnD.setBounds(150, 110, 60, 40);
    btnD.setFont(new Font("Bitstream Charter", Font.BOLD, 12));
    btnD.setBackground(Color.black);
    btnD.setForeground(Color.white);
    windows.add(btnD);

    //Setting property of clear button
    btnC.setBounds(80, 110, 60, 40);
    btnC.setFont(new Font("Bitstream Charter", Font.BOLD, 10));
    btnC.setBackground(Color.black);
    btnC.setForeground(Color.white);
    windows.add(btnC);

    
}

}