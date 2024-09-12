import java.util.ArrayList;

public class decToOctal {

    public static void decToOctal(int dec){
        ArrayList<Integer> list = new ArrayList<>();

        while (dec > 0) {
            int rem = dec % 8;
            list.add(rem);
            dec = dec / 8;
        }
        int n = list.size();
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
    }
    public static void main(String[] args) {
        int dec = 33;
        decToOctal(dec);

    }
}
