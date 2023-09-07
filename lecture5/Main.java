package lecture5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args){
        abc obj = new abc();
    }
}
class abc extends JFrame implements ActionListener{
    
    JTextField t1,t2;
    JButton b;
    JLabel l1,l2;
    public abc(){
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b = new JButton("OK");
        l1 = new JLabel("Result of addition");
        l2 = new JLabel("Result of Substraction");

        add(t1);
        add(t2);
        add(b);
        add(l1);
        add(l2);

        b.addActionListener(this);  // ActionListener is an  Interface

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        int value1 = num1 + num2;
        int value2 = num1 - num2;
        l1.setText(value1 + "");
        l2.setText(value2 + "");
    }
    
}
