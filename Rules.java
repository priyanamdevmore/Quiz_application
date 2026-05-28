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

         JLabel rules = new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText(
            "<html>" +
            "1.Focus on quiz." +"<br> <br>" +
            "2.No cheating alloweded." + "<br> <br>" +
            "3.Do not got nervous if your friend is answering more questions."+"<br><br>" +
            "4.Good Luck" + "<br><br>"+
            "<html>"
        );
        add(rules);





        setSize(800,500);
        setLocation(350,50);
        setVisible(true);

    }
    
    public static void main(String[]args){
        new Rules("User");
    }
    
}
