package ex9_exception;

public class Ex3_TryCatch {
    public static void main(String[] args) {

        try {
            int[] arr = { 10, 20, 30 };

            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            } // for
        } catch (Exception e) {

        }//X

        System.out.println("프로그램 끝");
    }// main

}
