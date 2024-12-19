package lab.Java_chap10;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Chap10_MouseEvent extends JFrame {
    private JLabel la = new JLabel("Hello");

    Chap10_MouseEvent()
    {
        setTitle("MouseEvent 연습");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Component 추가
        Container c = getContentPane();
        c.setLayout(null);
        la.setSize(50,20);
        la.setLocation(20,30);
        c.add(la);

        // EventLitener 달기
        c.addMouseListener(new MyMouseListener());
        

        setVisible(true);
    }

    public static void main(String[] args)
    {
        new Chap10_MouseEvent();
    } 

    class MyMouseListener implements MouseListener{

        @Override
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x,y);
        }

        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}
        
    }
}
