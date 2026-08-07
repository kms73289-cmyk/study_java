package ex_work;

import java.util.Scanner;

public class Ex3_work {
    public static void main(String[] args) {
        
        //키보드에서 나이와 키를 입력을 받는다
        //나이가 15세 이상이거나 키가 150cm이상이면 탑승가능
        //그렇지 않으면 탑승불가를 출력

        //나이 : 14
        //키 : 140
        //탑승불가

        Scanner sc = new Scanner( System.in);

        System.out.print("나이 : ");
        int age = sc.nextInt();
        
        System.out.print("키 : ");
        int height = sc.nextInt();

        if(age >= 15 || height >= 150){
        
            System.out.println("탑승가능");
        
        }else{
        
            System.out.println("탑승불가");
        
        }

    }//main
    
}//class
