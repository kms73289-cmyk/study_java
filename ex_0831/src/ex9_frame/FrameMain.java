package ex9_frame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.ActionListener;


public class FrameMain {
    public static void main(String[] args) {
        
        Frame f = new Frame();
        f.setLayout(null);
        f.setBounds(500, 300, 300, 400);

        Button btn1 = new Button("0");
        Button btn2 = new Button("1");
        Button btn3 = new Button("2");
        Button btn4 = new Button("3");
        Button btn5 = new Button("4");

        

        // 버튼들의 좌표, 크기
        btn1.setBounds(10, 40, 40, 40);
        btn2.setBounds(60, 40, 40, 40);
        btn3.setBounds(110, 40, 40, 40);
        btn4.setBounds(160, 40, 40, 40);
        btn5.setBounds(210, 40, 40, 40);




       

        // 생성된 버튼들 f에 추가
        f.add(btn1);
        f.add(btn2);
        f.add(btn3);
        f.add(btn4);
        f.add(btn5);

        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });

        f.setVisible(true);
    }//main
    
}//class
