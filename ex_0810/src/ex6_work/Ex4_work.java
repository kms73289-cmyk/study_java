package ex6_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        
        //키보드에서 입력받은 두 개의 수의 최대공약수 출력
        //----------------------------
        //수1 : 18
        //수2 : 12
        //최대공약수 : 6

        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int su1 = sc.nextInt();
        System.out.print("수2 : ");
        int su2 = sc.nextInt();
        
        for(int i = su1; i>= 1; i--){

           if( su1 % i == 0 && su2 % i ==0){
             System.out.println("최대공약수 : " + i);
             break;
           }
            
        }//outer
    }//main
    
}//class
