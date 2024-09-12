public class totaldays {

    public static int totaldays(int p1 , int p2 , int p3){
        return (p1*p2*p3)/(p1*p2 + p2*p3 + p3*p1);
    }
    public static void main(String[] args) {
        int p1 = 5;
        int p2 = 10;
        int p3 = 15;
        System.out.println("Total Days Needed : " + totaldays(p1, p2, p3));
    }
}
