package ex10_work;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex5_work {
    public static void main(String[] args) {

        // 나누기 연산만을 하는 계산식을 만들어 결과를 완성하기
        // (연산결과를 담는 변수는 float이 아닌 int로 하자)
        // -----------------------------
        // 수1 : 10
        // 수2 : 2
        // 결과 : 10 / 2 = 5

        // 수1 : 10
        // 수2 : 0
        // 오류 : 0으로 나눌 수 없습니다

        // 수1: abc
        // 오류 : 숫자가 아닙니다

        // InputMismatchException
        // ArithmeticException

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("수1 : ");
            int num1 = sc.nextInt();

            System.out.print("수2 : ");
            int num2 = sc.nextInt();

            int res = num1 / num2;
            System.out.println(num1 + "/" + num2 + "=" + res);

        } catch (InputMismatchException e) {

            System.out.println("오류 : 숫자가 아님");

        }catch (ArithmeticException e) {

            System.out.println("오류 : 0으로 나눌 수 없음");
        }
    }// main
}
