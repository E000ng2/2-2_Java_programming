package lab.Java_chap10;

import java.awt.*;
import javax.swing.*;
import java.awt.Event.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Chap10_KeyEvent extends JFrame {
    JLabel[] lakeys = new JLabel[3];
    Chap10_KeyEvent()
    {
        //(1) 화면 구성
        setTitle("KeyEvent 연습");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        //(2) 컴포넌트 추가
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setFocusable(true); // 키 이벤트 받을 수 있도록 설정
        c.requestFocus();

        lakeys[0] = new JLabel("getKeyCode() : ");
        lakeys[1] = new JLabel("getKeyChar() : ");
        lakeys[2] = new JLabel("getKeyText() : ");

        for(JLabel k : lakeys)
        {
            c. add(k);
        }
        //(3) 이벤트 리스너 달아주기
        c.addKeyListener(new MyKeyListener());



        setVisible(true);
    }
        
    class MyKeyListener extends KeyAdapter
    {

        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            char keyChar = e.getKeyChar();

            lakeys[0].setText("getKeyCode() : " + keyCode);
            lakeys[1].setText("getKeyChar : " + keyChar);
            lakeys[2].setText("getKeyText() : " + KeyEvent.getKeyText(keyCode));
        }
        
    }

    public static void main(String[] args)
    {
        new Chap10_KeyEvent();
    }

    
}
