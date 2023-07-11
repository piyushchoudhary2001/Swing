import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class SwingLearning extends JFrame implements ActionListener {
    JButton button;
    Boolean change=false;
    SwingLearning(){
        setTitle("This is my first Project");
        setLayout(null);
        button=new JButton("Button");




        button.setSize(100,50);
        button.setLocation(250,175);
        button.addActionListener(this);

        add(button);
        setSize(600,400);
        setResizable(false);
        setVisible(true);
        getContentPane().setBackground(Color.red);

    }


    public static void main(String[] args) {
        SwingLearning obj=new SwingLearning();
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String e=actionEvent.getActionCommand();
        if(e.equals("Button") && change==false)
        {
            getContentPane().setBackground(Color.black);
            change=true;
        }else {
            getContentPane().setBackground(Color.red);
            change=false;
        }
    }
}
