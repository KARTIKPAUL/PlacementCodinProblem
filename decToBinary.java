
import java.util.ArrayList;

public class decToBinary {
    public static void decToBin(int dec){
        ArrayList<Integer> list = new ArrayList<>();
        while (dec > 0) {
            int rem = dec % 2;
            list.add(rem);
            dec = dec / 2;
        }

        int n = list.size();
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
    }
    public static void main(String[] args) {
        int dec = 100;
        //String ans = Integer.toBinaryString(dec);
        //System.out.println(ans);
        decToBin(dec);
    }
}
