

public class perfectSquere {
    public static void main(String[] args) {
        int n1 = 27;
        // int n2 = 27;

        int val = (int)Math.sqrt(n1);
        if(val * val == n1){
            System.out.println(n1 + " is a pefect squere number");
        }else{
            System.out.println(n1 + " is not a perfect squere");
        }
    }
}
