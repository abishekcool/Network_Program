import javax.swing.*;
import java.awt.*;

public class Calculator{

    JFrame f;
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3;

    JButton b1,b2,b3,b4,b5;

public Calculator()
{

    f=new JFrame("Calculator");

    l1=new JLabel("Enter First Number");
    l1.setBounds(50,50,150,30);

    t1=new JTextField("  ");
    t1.setBounds(200,50,30,30);

    l2=new JLabel("Enter Second Number");
    l2.setBounds(50,100,150,30);

    t2=new JTextField("  ");
    t2.setBounds(200,100,30,30);

    l3=new JLabel("Operation");
    l3.setBounds(50,150,150,30);

    b1=new JButton("Addition");
    b1.setBounds(120,150,120,30);

    b2=new JButton("Subtraction");
    b2.setBounds(250,150,120,30);

    b3=new JButton("Multiplication");
    b3.setBounds(120,200,120,30);

    b4=new JButton("Division");
    b4.setBounds(250,200,120,30);

    l5=new JLabel("Result");
    l5.setBounds(50,250,50,30);

    t3=new JTextField("");
    t3.setBounds(100,250,50,30);

    b5=new JButton("");
    b5.setBounds(100,400,100,30);


        b1.addActionListener(e -> {
        double i=Double.parseDouble(t1.getText());
        double i2=Double.parseDouble(t2.getText());
        double b1=i+i2;
        String add=String.valueOf(b1);
        t3.setText(add);
         });

        b2.addActionListener(e -> {
        double i=Double.parseDouble(t1.getText());
        double i2=Double.parseDouble(t2.getText());
        double b2=i-i2;
        String sub=String.valueOf(b2);
        t3.setText(sub);

         });

        b3.addActionListener(e-> {
        double i=Double.parseDouble(t1.getText());
        double i2=Double.parseDouble(t2.getText());
        double b3=i*i2;
        String mul=String.valueOf(b3);
        t3.setText(mul);
        });

        b4.addActionListener(e-> {
        double i=Double.parseDouble(t1.getText());
        double i2=Double.parseDouble(t2.getText());
        double b4=i/i2;
        String div=String.valueOf(b4);
        t3.setText(div);
        });









        b5.addActionListener(e1 -> {
            t1.setText(null);
            t2.setText(null);
            t3.setText(null);
        });



            f.add(l1);
            f.add(t1);
            f.add(l2);
            f.add(t2);
            f.add(t3);
            f.add(b1);
            f.add(l3);
            f.add(b1);
            f.add(b2);
            f.add(b3);
            f.add(b4);
            f.add(l5);

            f.setSize(500, 500);
            f.setLayout(null);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main (String args[])
    {
        Calculator z1 = new Calculator();

    }
}