
public class binaryToDecimal {

    public static int binrayToDec(int bin){
        int base = 1;
        int decimalValue = 0;
        while (bin > 0) {
            int rem = bin % 10;
            if(rem != 0){
                decimalValue += rem * base;
            }
            base *= 2;
            bin = bin / 10;
        }

        return decimalValue;
    }
    public static void main(String[] args) {
        //String s = "111";
        //System.out.println(Integer.parseInt(s,2));
        int binary = 100001;
        int ans = binrayToDec(binary);
        System.out.println(ans);
    }
}
