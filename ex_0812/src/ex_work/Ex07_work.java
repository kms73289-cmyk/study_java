package ex_work;

public class Ex07_work {
    public static void main(String[] args) {
        
        //배열 arr을 오름차순으로 출력
        //---------------------------
        //11 7 9 20 15 3
        //3 7 9 11 15 20

        int[] arr = {11, 7, 9, 20, 15, 3};
        /*int su = 0;

        for(int i = 0; i < arr.length; i++){

            for(int j = i; j < arr.length; j++){
                
                if( arr[i] > arr[j]){
                    
                    su = arr[j];
                    arr[j] = arr[i];
                    arr[i] = su;
                }
                
            }System.out.print(arr[i] + " ");
            
        }*/

            System.out.print("원본배열: ");
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }

            System.out.print("\n오름차순 : ");

            //arr을 오름차순으로 정렬
            for(int i = 0; i < arr.length; i++){

                for(int j = i; j < arr.length; j++){

                    if( arr[j]< arr[i]){
                        int tmp = arr[i];
                        arr[i] = arr [j];
                        arr[j]= tmp;
                    }

                }//inner
            }//outer
            for ( int i = 0; i< arr.length; i++){
                System.out.print(arr[i]+ " ");
            }

    }//main
    
}//class
