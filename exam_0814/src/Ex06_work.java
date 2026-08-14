import java.util.Scanner;

public class Ex06_work {
    public static void main(String[] args) {
        
        // 정수 : 7
        // 7은(는) 소수입니다

        // 정수 : 10
        // 10은(는) 소수가 아닙니다

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int n = sc.nextInt();


        int  i = 2;
        for(; i <= n; i++){

            if( n % i == 0){
                break;
            }
        }

        if(i == n){
            System.out.println(n + "은(는) 소수");
        }else
            System.out.println(n+"은(는) 소수가아닙니다");
    }//main
    
}//class
