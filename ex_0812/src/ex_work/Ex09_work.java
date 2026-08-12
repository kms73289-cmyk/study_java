package ex_work;

import java.util.Random;

public class Ex09_work {
    public static void main(String[] args) {
        
        //1~45 사이의 중복되지 않는 난수 6개를 출력하는 
        //로또번호 생성기 만들기
        //--------------------
        //17 2 45 27 9 11

        int[] lotto = new int[6];
        

        for(int i = 0; i < lotto.length; i++){

            int r = new Random().nextInt(45)+1;
            for(int j = 0; j < i; j++){
                if(r = lotto[j]){
                    --i;
                }
                    
            }
        
            lotto[i]=r;
            
        }System.out.println();
    }
    
}
