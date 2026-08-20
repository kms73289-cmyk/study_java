package ex01_work;

public class NumSub {
    public boolean isNumber(String str){

        for ( int i = 0 ; i < str.length(); i++){
            
            char ch = str.charAt(i);

            
            if( ch < '0' || ch > '9' ){
                return false;
            }
        }//for

        return true;

    }
}//class
