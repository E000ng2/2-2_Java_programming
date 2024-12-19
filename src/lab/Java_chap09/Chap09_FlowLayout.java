package lab.Java_chap09;
import java.awt.*;
import javax.swing.*;


public class Chap09_FlowLayout extends JFrame {
    Chap09_FlowLayout (){
        setTitle("FlowLayout연습");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT, 40, 40));

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");


        //Component를 ContentPane에 추가
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.add(b6);

    }
    
    public static void main(String[] args) {
        new Chap09_FlowLayout();
    }
}
