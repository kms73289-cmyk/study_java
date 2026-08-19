package ex7_work;

import java.util.Scanner;

public class UpdownSub {
    public void Updown(int r){

        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        
        while(true){
            cnt++;
            System.out.println("정수 : ");
            int num = sc.nextInt();

            if(num < r){
                System.out.println("up");
                continue;
            }
            if(num > r){
                System.out.println("Down");
                continue;
            }
            if(num == r)
                System.out.printf("%d회 만에 정답",cnt);
            break;
                
        }
    }
    
}
