public class factorial {


    //Using Recursion
    public static int fact(int n) {
        if(n == 0) return  1;
        return n * fact(n-1);
    }


    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;

        //Using Loop
        int res = 1;
        for(int i = 1 ; i <= num1 ; i++){
            res *= i;
        }


        System.out.println("Factorial Of 5 is : " + res);

        System.out.println("Factorial Of 6 is : " + fact(num2));

    }
}
