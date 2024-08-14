

public class smallestNumber {
   public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = 30;
    int d = 5;
    int min = a;
    if(a > b) min = b;
    if(b > c) min = c;
    if(c > d) min = d;

    System.out.println("Minimum Value of : " + min);
   }


}
