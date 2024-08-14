public class sumPrime {
    public static boolean isPrime(int n){
        //int val = (int)Math.sqrt(n);
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0) return  false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 10;
        int sum = 0;
        for (int i = n1 ; i <= n2 ; i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        System.out.println("Sum of " + n1 + " to " + n2 + " all prime number is " + sum);
    }
}
