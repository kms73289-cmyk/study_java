package ex3_Stringbuffer;

public class Ex1_StringBuffer {
    public static void main(String[] args) {
        
        String str = "안녕";
        str = "반갑습니다";//수정불가 새로 만들어짐
        str += "!";
        System.out.println(str);

        StringBuffer sb = new StringBuffer("안녕");
        sb.setLength(0);
        sb.append("반가워요");
        sb.append("!!!");//수정
        System.out.println(sb.toString());
    }//main
    
}//class
