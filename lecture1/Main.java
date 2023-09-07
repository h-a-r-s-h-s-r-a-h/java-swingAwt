package lecture1;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main{
    public static void main(String[] args) {
       Abc obj = new Abc();
       
    }
}
class Abc extends JFrame{
    public Abc(){
        setLayout(new FlowLayout()); // setting up layout , without this only one label is displayed
        JLabel l = new JLabel("Jai Shree Ram"); // making labels
        JLabel l1 = new JLabel("Har Har Mahadev");
        JLabel l3 = new JLabel("Jai Bhawani");
        add(l); // adding those label to jframe
        add(l1);
        add(l3);

        setVisible(true); // making frame visible
        setSize(400, 400); // setting height and width of frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // making close button functionable to abort the program
    }
}