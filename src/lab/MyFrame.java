package lab;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class MyFrame extends JFrame {

    JLabel la;
    JCheckBox[] chkBoxes;

    MyFrame() {
        
        //(1) 화면 구성
        setTitle("첫번째 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        
        
        //(2) 컴포넌트 컨텐트펜에 달기
        Container c = getContentPane();

        c.setLayout(new FlowLayout());

        // 마우스를 따라 다니는 Label
        la = new JLabel("꼴뚜기");
        la.setSize(50,20);
        c.add(la);

        // 가격을 합산하는 CheckBox
        chkBoxes = new JCheckBox[3];
        chkBoxes[0] = new JCheckBox("오징어(1000원)");
        chkBoxes[1] = new JCheckBox("문어(2000원)");
        chkBoxes[2] = new JCheckBox("쭈꾸미(3000원)");
        for(JCheckBox chk : chkBoxes)
        {
            c.add(chk);
        }

        // 누르면 사진이 바뀌는 마술
        JButton magicbtn = new JButton();
        ImageIcon [] magicImg = new ImageIcon[3];
        magicImg[0] = new ImageIcon("images/apple.jpg");
        magicImg[1] = new ImageIcon("images/banana.jpg");
        magicImg[2] = new ImageIcon("images/cherry.jpg");

        magicbtn.setIcon(magicImg[0]);
        magicbtn.setRolloverIcon(magicImg[1]);
        magicbtn.setPressedIcon(magicImg[2]);

        c.add(magicbtn);
        

        //(3) 이벤트 리스너 달기
        c.addMouseListener(new MyMouseListener());
        MyItemListener listener = new MyItemListener();
        for (JCheckBox chk : chkBoxes)
        {
            chk.addItemListener(listener);
        }


        setVisible(true);
    }

    class MyMouseListener extends MouseAdapter
    {

        @Override
        public void mousePressed(MouseEvent e) { 
            int x = e.getX();
            int y = e.getY();

            la.setLocation(x,y);
        }
    }

    class MyItemListener implements ItemListener
    {
        private int sum = 0;
        @Override
        public void itemStateChanged(ItemEvent e) 
        {
            if(e.getStateChange() == ItemEvent.SELECTED)
            {
                if(e.getItem() == chkBoxes[0])
                {
                    sum += 1000;
                }
                else if(e.getItem() == chkBoxes[1])
                {
                    sum += 2000;
                }
                else if(e.getItem() == chkBoxes[2])
                {
                    sum += 3000;
                }
            }
            else
            {
                if(e.getItem() == chkBoxes[0])
                {
                    sum -= 1000;
                }
                else if(e.getItem() == chkBoxes[1])
                {
                    sum -= 2000;
                }
                else if(e.getItem() == chkBoxes[2])
                {
                    sum -= 3000;
                }
            }
            JFrame frame = (JFrame)chkBoxes[0].getTopLevelAncestor();
            frame.setTitle("현재 가격은" + sum + "원 입니다."); 
        }


    }
    public static void main(String[] args){
        new MyFrame();
    }
}

