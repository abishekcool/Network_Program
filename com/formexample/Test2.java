package com.formexample;

import javax.swing.*;
public class Test2{
    JFrame f;
    JLabel l1, l2, l3,l4, l5;
    JTextField t1, t2 ,t3;
    JComboBox c;
    JRadioButton r1,r2;
    JButton b1;
    ButtonGroup bg;
    public Test2() {
        f = new JFrame("LOGIN");

        l1 = new JLabel("Name");
        l1.setBounds(30, 50, 100, 30);

        t1 = new JTextField("  ");
        t1.setBounds(100, 50, 200, 30);

        l2 = new JLabel("Email");
        l2.setBounds(30, 100, 100, 30);

        t2 = new JTextField("");
        t2.setBounds(100, 100, 200, 30);

        l3 = new JLabel("Phone");
        l3.setBounds(30, 150, 100, 30);

        t3 = new JTextField("");
        t3.setBounds(100, 150, 100, 30);

        l4 = new JLabel("Gender");
        l4.setBounds(30, 200, 50, 30);

        r1 = new JRadioButton("Male");
        r1.setBounds(100, 200, 150, 30);
        r2 = new JRadioButton("Female");
        r2.setBounds(250, 200, 150, 30);
        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        l5 = new JLabel("Subject");
        l5.setBounds(30, 250, 50, 30);
        String Su[] = {"BCA", "BBM", "BHM", "LAW"};
        c = new JComboBox(Su);
        c.setBounds(100, 250, 100, 30);

        b1 = new JButton("SIGN UP");
        b1.setBounds(250, 300, 150, 30);

        f.add(c);
        f.add(l5);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(b1);
        f.add(t3);
        f.add(r1);
        f.add(l4);
        f.add(r2);

        b1.addActionListener(e -> {
            String name = t1.getText();
            String email = t2.getText();
            String phone = t3.getText();
            String gender = r1.isSelected()?"Male" : "Female";
            String Subject = (String) c.getSelectedItem();

            System.out.println();
            System.out.println("Name : " + name);
            System.out.println("Email : " + email);
            System.out.println("Phone : " + phone);
            System.out.println("Gender : " + gender);
            System.out.println("Subject : " + Subject);
            System.out.println();
        });

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        public static void main (String args[])
        {
        Test2 z1 = new Test2();

    }
}

