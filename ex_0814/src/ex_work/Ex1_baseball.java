package ex_work;

import java.util.Random;
import java.util.Scanner;

public class Ex1_baseball {
    public static void main(String[] args) {

        // 세자리 수를 입력하세요(예:123) - 123
        // 1Strike, 1Ball
        // --------------------------
        // 세자리 수를 입력하세요(예:123) - 567
        // OUT!!
        // --------------------------
        // 세자리 수를 입력하세요(예:123) - 214
        // 0Strike, 3Ball
        // --------------------------
        // 세자리 수를 입력하세요(예:123) - 142
        // 4회 정답 !! - 142
        // 주석 금요일 제출

        Scanner sc = new Scanner(System.in);// 키보드에서 값을 입력받기

        int[] com = new int[3];// 난수값 배열
        int[] user = new int[3];// 입력값 배열

        // 1~9 수 중 중복없이 난수값 3개 생성
        outer: for (int i = 0; i < com.length;) {

            com[i] = new Random().nextInt(9) + 1;

            // 중복값 비교
            for (int j = 0; j < i; j++) {

                if (com[i] == com[j]) {
                    continue outer;// 이전 값들과 중복이면 i증가하지 않고 다시 받기
                }

            } // inner
            i++;// 겹치지 않을때만 다음 값 받기

        } // outer

        System.out.println("정답 : " + com[0] + com[1] + com[2]);// 정답 배열값 출력

        int cnt = 0;// 시도 횟수

        while (true) {

            cnt++;
            System.out.print("입력(예:123) : ");//세자리수 입력받기

            int number = sc.nextInt();

            user[0] = number / 100;// 첫번째 값 100의 자리수
            user[1] = number / 10 % 10;// 두번째 값 10의 자리수
            user[2] = number % 10;// 3번째 값 1의 자리수

            int strike = 0;
            int ball = 0;

            // 스트라이크, 볼 판정
            for (int i = 0; i < user.length; i++) {

                for (int j = 0; j < user.length; j++) {

                    if (i == j) {
                        if (com[i] == user[j])
                            strike++;// 같은자리 같은 값 스트라이크

                    } else {
                        if (com[i] == user[j])
                            ball++;// 다른자리 같은 값 볼
                    }

                } // inner

            } // for

            // 정답처리
            if (strike == 3) {
                System.out.println("정답!! - " + com[0] + com[1] + com[2]);
                System.out.println(cnt + "회 클리어");
                break;// while문 나오기
            } else {// 스트라이크 3개 아닐때

                if (strike > 0 || ball > 0) {// 스트라이크 또는 볼이 있을때
                    System.out.printf("%d Strike, %d Ball\n", strike, ball);

                } else {// 다 맞지 않을때
                    System.out.println("OUT");

                }
            }
            System.out.println("----------------------");

        } // while
    }// main

}// class
