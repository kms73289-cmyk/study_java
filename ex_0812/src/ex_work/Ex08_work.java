package ex_work;

import java.util.Random;

public class Ex08_work {
    public static void main(String[] args) {
        
        //변수 money에 10 ~ 5000 사이의 난수를 발생시킨다
        //단 발생한 난수 money는 1의 자리가 반드시 0이 되도록 한다
        //money를 최소한의 동전으로 몇 개씩 거슬러지는지 출력
        //---------------------------------
        //금액: 2590
        //500원 : 5
        //50원 : 1
        //10원 : 4
        
        int[] coin = { 500, 100, 50, 10};
        
        int r = new Random().nextInt(5000 - 10 +1) + 10;

        if(r % 10 != 0){
            int n = r % 10;
            r -= n; 
        }System.out.println("금액 : " + r);

       int w = 0;

        for( int i = 0; i < coin.length; i++){

            w = r / coin[i];
            r -= w*coin[i];
            System.out.printf("%d원 : %d\n",coin[i],w);
        }

        

        
    }//main
    
}//class
