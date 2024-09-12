public class lcm {

    public static int gcd(int a , int b) {
        if(a == 0) return a;
        if(b == 0) return b;
        if(a == b) return a;
        if(a > b) return gcd(a-b , b);
        else return gcd(a , b-a);
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        int ans = (a * b) / gcd(a, b);
        System.out.println(ans);
    }
}
