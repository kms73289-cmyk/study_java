package ex11_work;

import java.util.Random;
import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {

        // 문제 : PEALP
        // >>ealpp
        // ealpp오답
        // >>apple
        // apple정답!
        
        WorkSub ws = new WorkSub();

        //정답단어
        String answer = ws.getAnswer();

        //정답을 섞어서 문제로 만들기
        String question = ws.scrambleWord( answer );

        Scanner sc = new Scanner(System.in);

        System.out.println("문제 : " + question);

        while(true){
            System.out.println(">> ");
            String str = sc.next();

            if( str.equalsIgnoreCase( answer )){
                System.out.println(str + "은 정답입니다");
                break;
            }else{
                System.out.println(str + "은 오답입니다");
            }
        }

        /* Scanner sc = new Scanner(System.in);

        int n = new Random().nextInt(4);

        int index = strArr[n].length();
        int[] r = new int[index];
        String res = "";

        out : for(int i = 0; i < index; ){
            r[i] = new Random().nextInt(index);
            for(int j = 0; j < i; j++){
                if(r[i]==r[j]){
                    continue out;
                }
            }
            res += strArr[n].charAt(r[i]);
            i++;
        }
        System.out.println("문제 : " +res);
        

        while (true) {
            System.out.print(">> ");
            String answer = sc.next();
            if (answer.equalsIgnoreCase(strArr[n])) {
                System.out.println("정답");
                break;
            } else
                System.out.println("오답")}
        */ 

    }// main

}// class
