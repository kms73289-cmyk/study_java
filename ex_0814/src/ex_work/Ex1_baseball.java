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
        
        Scanner sc = new Scanner(System.in);//키보드에서 값을 입력받기

        int[] com = new int[3];
        int[] user = new int[3];

        outer : for(int i =0 ; i < com.length; ){

            com[i] = new Random().nextInt(9)+1;

            
            //중복값 비교
            for( int j = 0; j < i; j++ ){

                if( com[i]==com[j]){
                    continue outer;//랜덤으로 받은 값이 이전값과 겹치면 i증가하지 않고 다시 받기
                }

            }//inner
            i++;

        }//outer

        System.out.println("정답 : " + com[0] + com[1] + com[2]);//

        int cnt = 0;

        while(true){

            cnt++;
            System.out.print("입력(예:123) : ");

            int number = sc.nextInt();

            user[0] = number / 100;
            user[1] = number / 10 % 10;
            user[2] = number % 10;

            int strike = 0;
            int ball = 0;

            for( int i = 0 ; i < user.length; i++ ){

                for( int j = 0; j < user.length; j++ ){

                    if( i == j ){
                        if( com[i] == user[j])
                            strike++;

                    }else{
                        if( com[i] == user[j])
                            ball++;
                    }

                }//inner

            }//for

            //정답처리
            if( strike == 3){
                System.out.println("정답!! - " + com[0] + com[1] + com[2]);
                System.out.println(cnt + "회 클리어");
                break;
            }else{

                if( strike > 0 || ball > 0){
                    System.out.printf("%d Strike, %d Ball\n", strike, ball);

                }else{
                    System.out.println("OUT");

                }
            }
            System.out.println("----------------------");

        }//while
    }// main

}// class
