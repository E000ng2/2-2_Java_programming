/*
 * JFrame - MenuBar(메뉴)
 *        - ContentPane(화면) - Layout(배치관리) 
 *                            - 실제 컴포넌트(버튼 등등...)
 */

package lab.Java_chap09;
import javax.swing.*;
import java.awt.*;

public class Chap09_ex01 extends JFrame { //extends JFrame : JFrame을 상속받을거야ㅑㅑ
    Chap09_ex01()
    {
        setTitle("첫번째 GUI 프로그램");          //기본!
        setSize(300, 300);                //기본!
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//기본!

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.ORANGE);
        contentPane.setLayout(new BorderLayout());     //컴포넌트 크기 조절 및 재배치 
                                                     // Layout의 종류 : FlowLayout, BorderLayout, GridLayout, CardLayout
        contentPane.add(new Button("OK"), BorderLayout.CENTER);     //컴포넌트 추가
        contentPane.add(new Button("Cancel"), BorderLayout.NORTH); //컴포넌트 추가
        contentPane.add(new Button("Ignore"), BorderLayout.SOUTH); //컴포넌트 추가
        contentPane.add(new Button("황진석"), BorderLayout.EAST); //컴포넌트 추가
        contentPane.add(new Button("꼴뚜기"), BorderLayout.WEST); //컴포넌트 추가

        setVisible(true);                            //기본!
    }

    public static void main(String[] args) {
        new Chap09_ex01();

    }
}
