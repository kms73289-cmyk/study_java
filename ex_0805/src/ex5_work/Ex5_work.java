package ex5_work;

public class Ex5_work {
    public static void main(String[] args) {

        /*
         과수원이 있다.
         배, 사과, 오렌지를 키우고 있는데, 하루에 생산되는 양이
         각각 5, 7, 5개
          
         1. 과수원에서 하루에 생산되는 과일의 총 갯수를 출력
         2. 시간당 전체 과일의 평균 생산 갯수
         단, 과일의 갯수를 담는 변수는 int, 평균을 계산할 변수는 float
         */
        
        //1
        int pear = 5;
        int apple = 7;
        int orange = 5;
        int total = pear + apple + orange;
        float avg = (float) total / 24;

        System.out.println("하루생산량 : " + total);
        System.out.println("시간당 평균 : " + avg);

        //2
        int a = 5;
        int b = 7;
        int c = 5;

        int n = a + b + c;
        System.out.println("총 갯수 : " + n);

        float av =  n/24f;
        System.out.println("평균 : " + av);

        /*
         연습문제:
         아래의 조건을 참고하여 문제를 풀어보세요.

         어느 과수원에서 하루 동안 배, 사과, 오렌지, 그리고 바나나를 생산하고 있다.
         하루에 생산되는 각 과일의 개수는 각각 8개, 10개, 6개, 12개이다.

         1. 하루 동안 생산되는 모든 과일의 총 개수를 출력하세요.
         2. 30분(0.5시간)당 평균 생산 개수는 얼마인지 출력하세요.
         3. 사과와 바나나의 총 생산 수량을 출력하세요.
         4. 배를 3개 더 재배하여 생산했다면, 새로운 총 생산량은 얼마가 되는지 출력하세요.

         (단, 모든 변수는 적절한 자료형을 사용하고, 출력 형식은 자유롭게 하세요.)
        */
        
         
       




    }

}
