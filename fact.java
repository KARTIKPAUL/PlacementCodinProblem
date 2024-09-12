public class fact{

    public static int factorial(int n) {
        int ans = 1;
        for(int i = 2 ; i <= n ; i++){
            ans *= i;
        }
        return  ans;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(factorial(n));
    }
}