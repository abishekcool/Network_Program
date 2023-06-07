package com.formexample;

import javax.swing.*;

public class Event {
    JFrame f;
    JButton b1;
    JTextField t1;

    public Event (){
        f = new JFrame("Events handling");
        t1 = new JTextField("");
        t1.setBounds(50, 100, 50, 30);


        b1 = new JButton(" Enter ");
        b1.setBounds(50, 100, 50, 30);


        b1.addActionListener(e -> {

            b1.setText("I Am Click");


        });
        f.add(b1);
        f.add(t1);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String [ ] args) {
        Event e1 = new Event();
    }

}
