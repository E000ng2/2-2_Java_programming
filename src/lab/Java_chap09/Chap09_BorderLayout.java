package lab.Java_chap09;
import javax.swing.*;
import java.awt.*;

public class Chap09_BorderLayout extends JFrame{
    Chap09_BorderLayout()
    {
        setTitle("BorderLayout 연습");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(new Button("중간"));
        c.add(new Button("동"), BorderLayout.EAST);
        c.add(new Button("서"), BorderLayout.WEST);
        c.add(new Button("남"), BorderLayout.SOUTH);
        c.add(new Button("북"), BorderLayout.NORTH);


        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Chap09_BorderLayout();
    }
}
