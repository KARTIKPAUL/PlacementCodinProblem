public class hcf {

    public static int gcd(int a , int b){
        if(a == 0) return 0;
        if(b == 0) return 0;
        if(a == b) return a;
        if(a > b) return gcd(a-b, b);
        return gcd(a, b-a);
    }
    public static void main(String[] args) {
     
        int num1 = 18;
        int num2 = 12;

        System.out.println("HCF of 18 and 16 is : " + gcd(num1, num2));
        
    }
}
