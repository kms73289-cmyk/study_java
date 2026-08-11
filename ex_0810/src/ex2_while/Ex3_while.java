package ex2_while;

import java.util.Random;
import java.util.Scanner;

public class Ex3_while {
    public static void main(String[] args) {

        // 1~ 100사이의 난수를 만들고
        // 키보드에서 입력받은 값이 정답일 때 게임을 종료
        // -------------------------
        // 숫자 : 25
        // UP
        // 숫자 : 70
        // DOWN
        // 숫자 : 50
        // 정답입니다

        int answer = new Random().nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int num = 0;//사용자가 입력할 값
        //System.out.println(answer);

        while (num != answer) {
            System.out.print("숫자 : ");
            num = sc.nextInt();
            
            if (num < answer)
                System.out.println("UP");
            else if (num > answer)
                System.out.println("DOWN");
            else
                System.out.println("정답입니다");

        }
        

    }// main

}// class
