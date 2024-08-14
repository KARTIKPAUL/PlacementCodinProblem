public class digitSum {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;
        while(num > 0){
           int n = num % 10;
            sum += n;
            num = num / 10; 
        }
        System.out.println("Sum of the Digit is : " + sum);
    }
}
