package ex7_work;

import java.util.Random;
import java.util.Scanner;

public class UpdownMain {
    public static void main(String[] args) {
        
        //1 ~ 50사이의 난수를 발생시키고
        //키보드에서 입력받은 정수를 난수와 비교하기
        //----------------------------
        //정수 : 30
        //Down
        //정수 : 15
        //Up
        //정수 : 25
        //3회 만에 정답
        int r = new Random().nextInt(50)+1;
        

            

        UpdownSub uds = new UpdownSub();
        uds.Updown(r);
    }//main 
}//class
