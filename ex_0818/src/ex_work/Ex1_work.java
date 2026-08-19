package ex_work;

import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {
        
        //키보드에서 입력받은 값이 회문인지 판단
        //--------------------
        //입력 : abcba
        //abcba은(는) 회문입니다

        //입력 : abc
        //abc은(는) 회문이 아닙니다

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        
        //원본
        String str = sc.next();

        StringBuffer sb = new StringBuffer(str);

        //원본을 뒤집어서 저장할 객체
        // String rev = "";
        String rev = sb.reverse().toString();

        // for( int i = str.length()-1; i >= 0; i--){
        //     rev += str.charAt(i);
        // }

        //String ==은 equals로
         if(str.equals( rev )){
            System.out.println(str + "은 회문");
         }else{
            System.out.println(str + "은 안회문");
         }
    }//main
    
}
