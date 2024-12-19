package lab.Java_chap09;
import javax.swing.*;
import java.awt.*;

public class Chap09_GridLayout extends JFrame{
    Chap09_GridLayout()
    {
        setTitle("BorderLayout 연습");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = getContentPane();
        c.setLayout(new GridLayout(4,3,5,5));
        c.add(new Button("1"));
        c.add(new Button("2"));
        c.add(new Button("3"));
        c.add(new Button("4"));
        c.add(new Button("5"));
        c.add(new Button("6"));
        c.add(new Button("7"));
        c.add(new Button("8"));
        c.add(new Button("9"));
        c.add(new Button("*"));
        c.add(new Button("0"));
        c.add(new Button("#"));

        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Chap09_GridLayout();
    }
}
