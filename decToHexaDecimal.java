
import java.util.ArrayList;

public class decToHexaDecimal {

    public static void decToHex(int dec){

        ArrayList<String> list = new ArrayList<>();

        while (dec > 0) { 
            int rem = dec % 16;
            if(rem > 9){
                char hexChar = (char)('A' + (rem-10));
                list.add(String.valueOf(hexChar)); 
            }else{
                list.add(String.valueOf(rem));
            }
            dec = dec / 16;
        }
        int n = list.size();
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
    }
    public static void main(String[] args) {
        int dec = 33;
        decToHex(dec);
    }
    
}
