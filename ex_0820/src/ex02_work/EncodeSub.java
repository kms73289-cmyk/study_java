package ex02_work;

public class EncodeSub {

    char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^',
            '&', '*', '(', ')', '-', '_', '+', '=', '|',
            '[', ']', '{', '}', ';', ':', ',', '.', '/' };

    char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y',
            'u', 'i', 'o', 'p' };

    // String result = "";
    StringBuffer result = new StringBuffer();

    public String encoding( String str ){
        
        for( int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if( ch >= 'a' && ch <= 'z'){
                //result += abcCode[ch - 'a'];
                result.append(abcCode[ch - 'a']);

            }else if( ch >= '0' && ch <= '9'){
                //               '51' - '48'
                //               '3' - '0'
                // result += numCode[ch - '0'];
                result.append(numCode[ch - '0']);
            }
        }//for
        return result.toString();
    }

}
