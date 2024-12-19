
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

public class Chap10_ex01 extends JFrame{
    JLabel la = new JLabel("Hello");

    Chap10_ex01()
    {
        //(1)화면 구성
        setTitle("이벤트 처리 예제");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼을 누르면 완전히 종료

        //(2) 컴포넌트 추가
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton btn = new JButton("Action"); //버튼 만들기
        c.add(btn); //ContentPane에 버튼 달기
        JButton btn2 = new JButton("블루베리");
        c.add(btn2);
        c.add(la);

        //(3) 이벤트 리스너 달아주기
        btn.addActionListener(new MyActionListener());
        btn2.addActionListener(new MyActionListener());
        c.addMouseListener(new MyMouseListener());
        

        setVisible(true); // 화면 보이기


    }

    public static void main(String[] args) {
        new Chap10_ex01();
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



