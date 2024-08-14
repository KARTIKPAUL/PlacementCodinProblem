public class secondlargest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;
        if((a >= b) && (a <= c) || (a >= c) && (a <= b)){
            System.out.println("Second Largest Element is: " + a);
        }
        else if((b >= a) && (b <= c) || (b >= c) && (b <= a)){
            System.out.println("Second Largest Element is: " + b);
        }else{
            System.out.println("Second Largest Element is: " + c);
        }
    }
}
