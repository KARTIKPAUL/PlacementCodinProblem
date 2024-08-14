public class dayCount {
    public static void main(String[] args) {
        int arr [] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int n = arr.length;
        String months [] = {"Jan","Feb","Mar","Apr","May","June","Jul","Aug","Sep","Oct","Nov","Dec"}; 
        for(int i = 0 ; i < n ; i++){
            System.out.println(months[i] + " Have " + arr[i] + " Days");
        }
    }
}
