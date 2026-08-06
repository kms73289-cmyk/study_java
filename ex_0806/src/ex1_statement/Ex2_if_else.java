package ex1_statement;

public class Ex2_if_else {
    public static void main(String[] args) {
        
            //if-else문 : 하나의 조건식에 대해서 
            //참일때와 거짓일 때를 모두 판단할 수 있는 제어문
            int n = 40;
            String str = "";

            if( ++n >= 50 ){
                //조건식이 참일 때 실행되는 영역
                str = "n은 50 이상의 수";
            }else{
                //조건식이 거짓일때 실행되는 영역
                str = "n은 50 미만의 수";

            }

            /*
            변수 age에 나이를 대입하고 30이상이면 
            드실만큼 드셨군요를, 그렇지 않으면 조금더 드셔도 돼요를 
            출력하는 if문을 구현
            */
 
            int age = 29 ;
            str = "";

            if(age >= 30){
                str = "드실만큼 드셨군요";

            }else{
                str = "조금 더 드셔도 돼요";
            }

            System.out.println(str);
            //위의 30어쩌고 코드를
            //삼항 연산자로 구현*

            age = 30;
            str = "";
            str = age >= 30 ? "드실만큼.." : "조금 더..";
            System.out.println(str);
            
    }//main
    
}
