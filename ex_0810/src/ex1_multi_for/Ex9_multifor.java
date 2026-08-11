package ex1_multi_for;

public class Ex9_multifor {
    public static void main(String[] args) {
        
        /*
                *
              * * * 
            * * * * *
          * * * * * * * 
        * * * * * * * * * 
        
       */
        
        /* 
        for( int i = 1; i <= 5; i++){

            for( int j = 1; j <= 9 ; j++){
                
                if(j<=5-i || j>=5+i){
                    System.out.print("  " );

                }else{
                    System.out.print( "* ");
                }
               
                            

            }//inner
            
            System.out.println();
        }//outer
        */

        for(int i = 0; i < 5; i++){

            for(int j = 0; j < 5 + i; j++){

                if( i + j > 3)
                    System.out.print("* ");
                else
                    System.out.print("  ");


            }//inner
            System.out.println();
        }//outer
        
    }//main
    
}//class
