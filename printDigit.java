public class printDigit {
    public static void main(String[] args) {
        int n = 12345;
        int arr [] = new int[5];
        int idx = 0;
        while (n > 0){
            int rem = n % 10;
            arr[idx++] = rem; 
            n = n / 10;
        }

        int len = arr.length;
        for(int i = len - 1 ; i >= 0 ; i--){
            System.out.print(arr[i] + " ");
        }

    }

}

