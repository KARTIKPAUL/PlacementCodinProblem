public class firstAndlastOccuerence {
    public static void main(String[] args) {
        int arr [] = {1,2,3,3,3,35};

        int element = 3;
        int n = arr.length;
        int firstOccurence = -1;
        int lastOccurence = -1;

        for(int i = 0 ; i < n ; i++){
            if(element != arr[i]) continue;
            if(firstOccurence == -1){
                firstOccurence = i;
            }
            lastOccurence = i;
        }

            if(firstOccurence != -1){
                System.out.println(firstOccurence + "," + lastOccurence );
            }else{
                System.out.println("Not Occurence");
            }
    }
}
