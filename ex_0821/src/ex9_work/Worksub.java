package ex9_work;

import java.util.Random;

public class Worksub {
    
    Random rnd = new Random();


    public void myLotto(int[] lotto){

        outer : for( int i = 0; i < lotto.length; ){
            lotto[i] = new Random().nextInt(45)+1;
            for(int j = 0; j < i; j++){
                if(lotto[i] == lotto[j]){
                    continue outer;
                }
                
                
            }//inner
            //System.out.print(lotto[i] + " ");
            i++;
        }
    }//myLotto()
}
