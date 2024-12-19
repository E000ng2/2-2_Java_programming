package lab.Java_chap10;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Chap10_ActionEvent extends JFrame {
    Chap10_ActionEvent()
    {
        setTitle("ActionEvent 연습");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        

        // Button Component 생성
        JButton b1 = new JButton("Action");

        // Listener 등록
        MyActionListener listener = new MyActionListener();
        b1.addActionListener(listener);

        // Component를 ContentPane에 추가
        c.add(b1);

        setVisible(true);
    }

    
    public static void main(String[] args) {
        new Chap10_ActionEvent();
    }
}

class MyActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource();
        if(b.getText().equals("Action"))
        {
            b.setText("액션");
        }
        else
        {
            b.setText("Action");
        }
    }
}
