package lab.Java_chap10;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Chap10_MouseAdapter extends JFrame{

    private Label la = new Label("안녕");

    Chap10_MouseAdapter()
    {
        
        setTitle("MouseAdapter 연습");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Component 추가
        Container c = getContentPane();
        c.setLayout(null);
        c.add(la);

        la.setSize(50, 20);

        // Listener 추가
        c.addMouseListener(new MyMouseAdapter());

        setVisible(true);
    }

    class MyMouseAdapter extends MouseAdapter
    {
        @Override
        public void mousePressed(MouseEvent e) 
        {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x, y);
        }
    }

    public static void main(String[] args) {
        new Chap10_MouseAdapter();
    }
}
