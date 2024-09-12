public class distanceCordinate{

    public static double distance(int x1 , int x2 , int y1 , int y2){

        double a = Math.pow((x2-x1),2);
        double b = Math.pow((y2-y1),2);

        return Math.sqrt(a+b);

    }
    public static void main(String[] args) {
        int x1 = 3;
        int x2 = 4;
        int y1 = 5;
        int y2 = 6;
        System.out.println(distance(x1, x2, y1, y2));;
    }
}