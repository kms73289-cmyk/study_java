package ex07_work;

import java.util.Random;

public class Graph {
    public static void main(String[] args) {
        
        //0 ~ 9사이의 난수를 100개 발생시키고
        //각 숫자가 몇개씩 만들어졌는지를 그래프화 하시오
        //--------------------------
        //0의 갯수 : ############ 12
        //1의 갯수 : ####### 7
        //...
        //9의 갯수 : ########## 10

        GraphSub gs = new GraphSub();
        int cnt[] = new int[10];
        

        for(int i = 0; i < 100; i++){
            int num = new Random().nextInt(10)+ 0;
                    cnt[num]++;
                    
            
        }

        for(int i = 0; i < 10; i++){
            System.out.println(i + "의 갯수 : " + cnt[i]);

        }
        

    }//main
    
}
