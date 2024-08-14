public class primeNumber {

    public static boolean isPrime(int n){
        //int val = (int)Math.sqrt(n);
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0) return  false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 15;
        if(isPrime(n1)){
            System.out.println(n1 + " is a prime Number");
        }
        if(!isPrime(n2)){
            System.out.println(n2 + " Not a prime Number");
        }
    }
}