package ex10_work;

import java.util.Scanner;

public class Ex4_work {

    //입력 : 1771
    //1771은(는) 4자리의 홀수입니다

    //입력 : 30
    //30은(는) 2자리의 짝수 입니다

    //입력 : 100a
    //100a은(는) 정수가 아닙니다

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");

        String  sNum = sc.next();

        try{
            int n = Integer.parseInt(sNum);

            System.out.printf("%d은(는) %d자리의", n, sNum.trim().length());

            if( n % 2 == 0 ){
                System.out.println("짝수입니다");

            }else
                System.out.println("홀수입니다");
                
        }catch(Exception e){
            System.out.println(sNum + "은(는) 정수가 아닙니다");

        }
    }
    
}
