public class reverseCoding {

    public static int num(int n ) {
        if(n % 2 == 0) return  n / 2;
        return (n/2) + 1;
    }
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 15;
        int n3 = 99;
        System.out.println(num(n1));
        System.out.println(num(n2));
        System.out.println(num(n3));
    }
}
