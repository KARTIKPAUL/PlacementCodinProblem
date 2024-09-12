// public class hello {

//     public static void main(String[] args) {
//         // byte b = 128;
//         // System.out.println(b);

//         boolean var1 = true;
//         boolean var2 = false;
//         if(var1){
//             System.out.println(var1);
//         }else{
//             System.out.println(var2);
//         }
//     }
// }



import java.util.Scanner;

public class LargestTwoDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // Reading the size of the array
        int max1 = 0;
        int max2 = 0;
        
        for (int i = 0; i < n; i++) {
            int current = sc.nextInt();
            int digit = getMaxDigit(current);
            
            // Keep track of the two largest digits found
            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2) {
                max2 = digit;
            }
        }
        
        // Combine the two largest digits to form the final number
        String result = "" + max1 + max2;
        System.out.println(result);
        
        sc.close();
    }
    
    // A method to find the maximum digit in a number
    private static int getMaxDigit(int num) {
        int maxDigit = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            num /= 10;
        }
        return maxDigit;
    }
}

 