public class move0And1{

    public static int [] moveZero(int arr []){
        int n = arr.length;
        int i = 0;
        int idx = 0;
        int count = 0;

        while (i < n) { 
            if(arr[i] != 1) arr[idx++] = arr[i];
            else count++;
            i++;
        }
        int j = n - count;
        while (j < n) { 
            arr[j++] = 1;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr [] = {0,1,0,0,1,1,0};
        int ans [] = moveZero(arr);
        int n = ans.length;
        for(int i = 0 ; i < n ; i++){
            System.out.print(ans[i] + " ");
        }

    }
}