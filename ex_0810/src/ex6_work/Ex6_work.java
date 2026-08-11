package ex6_work;

import java.util.Scanner;

public class Ex6_work {
    public static void main(String[] args) {
        
        //키보드에서 출력될 수열의 갯수를 지정하고
        //피보나치 수열대로 결과 보여주기
        //----------------------------------
        //입력 : 7
        //1 1 2 3 5 8 13  

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int n =sc.nextInt();
        int a = 1;
        int b = 0;
        
        

        for(int i = 1; i <= n;i++ ){
            
            
            b+=a;
            System.out.print( (a+b) + " ");
            a=b;


        }

    }//main
}//class
