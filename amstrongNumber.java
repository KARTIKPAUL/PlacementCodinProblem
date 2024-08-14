public class amstrongNumber {

    public static int digitCount(int num){
        int count = 0 ;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 153;
        int originalNum = num;
        int sum = 0;
        int digitCount = digitCount(num);
        while(num > 0){
            int n = num % 10;
            sum += Math.pow(n,digitCount);
            num = num / 10;
        }

        if(sum == originalNum){
            System.out.println("Amstrong Number");
        }else{
            System.out.println("Not Amstrong Number");
        }
    }
}
