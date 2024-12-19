package lab.Java_chap11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class Chap11_ex01 extends JFrame{
    JCheckBox[] chkBoxes;
    JLabel sumLabel;

    Chap11_ex01()
    {
        // setTitle("11장 예제");
        setSize(600,800);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        //JComponent 버튼 메서드
        JButton b1 = new JButton("버튼 1");
        b1.setForeground(Color.MAGENTA);
        b1.setBackground(Color.YELLOW);
        b1.setFont(new Font("궁서체", Font.ITALIC, 20));

        JButton b2 = new JButton("버튼 2");
        b2.setEnabled(false);

        JButton b3 = new JButton("버튼 3");
        b3.addActionListener(new ActionListener()
            {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                JButton b = (JButton)e.getSource();
                JFrame frame = (JFrame)b.getTopLevelAncestor();
                frame.setTitle(b.getX() + "," + b.getY());
            }
            });


        //JLabel 예제
        JLabel[] lbs = new JLabel[3];
        lbs[0] = new JLabel("사랑합니다.");
        ImageIcon lbImage1 = new ImageIcon("images/beauty.jpg");
        lbs[1] = new JLabel(lbImage1);
        ImageIcon lbImage2 = new ImageIcon("images/normalIcon.jpg");
        lbs[2] = new JLabel("전화주세요~~~", lbImage2, SwingConstants.CENTER);


        //JButton 예제
        ImageIcon[] btnImages = {new ImageIcon("images/normalIcon.gif"),
                                 new ImageIcon("images/rolloverIcon.gif"),
                                 new ImageIcon("images/pressedIcon.gif")};

        JButton b4 = new JButton();
        b4.setIcon(btnImages[0]);
        b4.setRolloverIcon(btnImages[1]);
        b4.setPressedIcon(btnImages[2]);

        //JCheckBox 예제
        chkBoxes = new JCheckBox[3];
        chkBoxes[0] = new JCheckBox("사과");
        chkBoxes[1] = new JCheckBox("배");
        chkBoxes[2] = new JCheckBox("체리", new ImageIcon("images/cherry.jpg"));
        chkBoxes[2].setSelectedIcon(new ImageIcon("images/selectedCherry.jpg"));

        //컴포넌트를 컨텐트팬에 추가
        c.add(b1);
        c.add(b2);
        c.add(b3);

        for(JLabel lb : lbs) c.add(lb);

        c.add(b4);

        MyItemListener listener = new MyItemListener();

        for(JCheckBox chx : chkBoxes){
            c.add(chx);
            chx.addItemListener(listener);
        }

        // for(JCheckBox chx : chkBoxes) chx.addItemListener(listener);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args)
    {
        new Chap11_ex01();
    }

    class MyItemListener implements ItemListener{
        private int sum = 0;
        @Override
        public void itemStateChanged(ItemEvent e)
        {
            if (e.getStateChange() == ItemEvent.SELECTED)
            {
                if(e.getItem() == chkBoxes[0])
                    sum += 100;
                
                else if (e.getItem() == chkBoxes[1])
                    sum += 200;
                
                else
                    sum += 300;
            }

            else
            {
                if(e.getItem() == chkBoxes[0])
                    sum -= 100;
                
                else if (e.getItem() == chkBoxes[1])
                    sum -= 200;
                
                else
                    sum -= 300;
            }
            JFrame frame = (JFrame)chkBoxes[0].getTopLevelAncestor();
            frame.setTitle("현재 " + sum + "원입니다.");
        }
    }




}
