public class setCountBit {

    // public static int count(int n){
    //     String s = Integer.toBinaryString(n);
    //     int len = s.length();
    //     int res = 0;
    //     for (int i = 0; i < len; i++) {
    //         if(s.charAt(i) == '1') res++;
    //     }
    //     return res;
    // }



    //Another Approach => O(logn)
    public static int count(int n){
        int res = 0;
        while (n > 0){
            res += (n & 1);
            n = n/2;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(count(n));
    }
}
