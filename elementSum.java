
import java.util.HashSet;

public class elementSum {
    public static void main(String[] args) {
        int element = 10;
        int arr [] = {1,2,3,4,5,6,7};

        HashSet<Integer> set = new HashSet<>();

        int n = arr.length;

        for(int i = 0 ; i < n ; i++){
            if(set.contains(element-arr[i])){
                System.out.println("Present");
                return;
            }set.add(arr[i]);
        }
        System.out.println("Not Prsent");
    }
}
