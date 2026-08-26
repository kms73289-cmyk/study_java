package ex6_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3_work {
    public static void main(String[] args) {
        
        //정수입력( 입력종료 : 0)
        //>> 45
        //>> 17
        //>> 20
        //>> 21
        //>> 0
        //---------
        //숫자 범위를 입력하세요
        //시작수 : 15
        //끝 수 : 20
        //17
        //20

        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력(종료 : 0)");

        while(true){
            System.out.print(">> ");
            int num = sc.nextInt();

            if(num == 0){
                break;
            }

            list.add(num);
        }
        System.out.println("---------------");

        System.out.println("숫자 범위 입력");
        System.out.print("시작 수: ");
        int start = sc.nextInt();
        System.out.print("끝 수: ");
        int end = sc.nextInt();

        for( int i = 0; i <list.size(); i++){
            if(list.get(i) >= start && list.get(i) <= end){
                System.out.print(list.get(i) + " ");
            }
        }
    }//main
    
}//class
