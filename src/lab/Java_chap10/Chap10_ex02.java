
//1. 이벤트 발생(키보드, 마우스 입력 등)
//2. 이벤트 객체 생성
//3. 생성된 이벤트 객체는 (추가된) 이번드 리스너에 전달이 됨
//4. 이벤트 리스너에 정의된 코드가 실행

/*
 * 우리가 실질적으로 할 수 있는 것
 * -> 이벤트 리스너 정의
 * -> 이벤트 리스너를 컨포넌트에 붙여주는 것
 */

 /*
  * 레이블 "hello"가 마우스 클릭이 발생한 위치에서 발생
  */

package lab.Java_chap10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Chap10_ex02 extends JFrame{
    JLabel la = new JLabel("Hello");
    JLabel[] lbkeys = new JLabel[3];
    Container c = getContentPane();

    Chap10_ex02()
    {
        //(1)화면 구성
        setTitle("이벤트 처리 예제");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼을 누르면 완전히 종료

        //(2) 컴포넌트 추가
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setFocusable(true); // 키 이벤트를 받을 수 있도록 설정
        c.requestFocus();

        JButton btn = new JButton("Action"); //버튼 만들기
        c.add(btn); //ContentPane에 버튼 달기
        JButton btn2 = new JButton("블루베리");
        c.add(btn2);
        c.add(la);

        // KeyListener 예제를 위한 컴포넌트
        lbkeys[0] = new JLabel("getKeyCode() : ");
        lbkeys[1] = new JLabel("getKeyChar() : ");
        lbkeys[2] = new JLabel("getKeyText() : ");

        for(JLabel k : lbkeys)
        {
            c.add(k);
        }


        //(3) 이벤트 리스너 달아주기
        btn.addActionListener(new MyActionListener());
        btn2.addActionListener(new MyActionListener());

        c.addMouseListener(new MyMouseListener());
        
        // 컨텐트펜에 키 이벤트 리스너 추가
        c.addKeyListener(new MyKeyListener());


        setVisible(true); // 화면 보이기


    }

    public static void main(String[] args) {
        new Chap10_ex02();
    }
    
    class MyKeyListener extends KeyAdapter{

        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            char keyChar = e.getKeyChar();

            lbkeys[0].setText("getKeyCode() : " + keyCode);
            lbkeys[1].setText("getKeyChar() : " + keyChar);
            lbkeys[2].setText("getKeyText() : " + KeyEvent.getKeyText(keyCode));

            if (keyCode == KeyEvent.VK_F1)
            {
                c.setBackground(Color.green);
            }
            else if(keyChar == '#')
            {
                c.setBackground(Color.YELLOW);
            }
            else 
            {
                c.setBackground(null);
            }
            int move_step = 10;
            int[] move_key = {KeyEvent.VK_UP, KeyEvent.VK_DOWN, KeyEvent.VK_LEFT, KeyEvent.VK_RIGHT};
            int[] move_x = {0, 0, -move_step, move_step};
            int[] move_y = {-move_step, move_step, 0, 0};

            for (int m = 0; m < move_key.length; m ++)
            {
                if (keyCode == move_key[m])
                {
                    la.setLocation(la.getX() + move_x[m], la.getY() + move_y[m]);
                };
            }
            
            System.out.println("KeyPressed");


        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("KeyReleased");  
        }

        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println("KeyTyped");  
        }
        

    }

    class MyMouseListener implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            
        }
    
        @Override
        public void mouseEntered(MouseEvent e) {
            
        }
    
        @Override
        public void mouseExited(MouseEvent e) {
            
        }
    
        @Override
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            
            //레이블 la의 위치를 옮김
            //la를 인식할 수 없는 위치에 리스너를 정의하고 있는 문제...
            // 1. e.getSource()를 통해 컨텐트멘의 레퍼런스를 얻은 후에 컨텐트 펜에 추가된 컴포넌트를 뒤적거려서 la를 찾는 방법
            // 2. la를 인식할 수 있는 범위에서 마우스 이벤트 리스너를 정의하는 방법
            la.setLocation(x,y); 
    
            
        }
    
        @Override
        public void mouseReleased(MouseEvent e) {
            
        }
        
    }
    
}



//인터페이스 ActionListener를 상속 받은 MyActionListener 클래스 정의
class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // getSource() 함수의 반환 값은 Object형
        // -> 단적으로 이야기하면, 레퍼런스가 정확히 누구인지 모름

        // 일단은 JButton이라고 가정
        JButton btn = (JButton)e.getSource();

        //버튼의 문자열을 통해 특정
        if (btn.getText().equals("Action"))
        {
            btn.setText("액션");
        }
        //문자열이 'Ation'이 아닌 모든 문자열에 대해서...
        else
        {
            btn.setText("Action");
        }
    }
}



