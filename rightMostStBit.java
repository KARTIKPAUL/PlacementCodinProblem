public class rightMostStBit {

    public static int rightSetBit(int n){
        String s = Integer.toBinaryString(n);
        int len = s.length();
        for(int i = len - 1 ; i >= 0 ; i--) {
            if('1' == s.charAt(i)) return len - i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 18;
        System.out.println(rightSetBit(n));
        int n2 = 15;
        System.out.println(rightSetBit(n2));
    }
}
