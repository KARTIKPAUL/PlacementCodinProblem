public class fibbonacciNumber {

    public static int fibb(int n){
        if(n == 0 || n == 1) return 1;
        return fibb(n-1) + fibb(n-2);
    }
    public static void main(String[] args) {
        int n = 9;
        System.out.println(fibb(n));
    }   
}
