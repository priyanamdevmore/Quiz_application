package Quiz_application;

import javax.swing.*;
import java.awt.*;
public class Rules extends JFrame {

    String name;

    Rules(String name){
       this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        setSize(800,500);
        setLocation(350,50);
        setVisible(true);

    }
    
    public static void main(String[]args){
        new Rules("User");
    }
    
}
