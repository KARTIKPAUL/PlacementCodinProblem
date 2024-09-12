public class rightMostBitDifferent {
    public static int posOfRightMostDiffBit(int m, int n){
            
        String s1 = Integer.toBinaryString(m);
        String s2 = Integer.toBinaryString(n);
        
        int size1 = s1.length();
        System.out.println(size1);
        int size2 = s2.length();
        System.out.println(size2);
        
        if(size1 == 0 || size2 == 0) return 1;
        
        // if(size1 > size2) return size2+1;
        // if(size2 > size1) return size1+1;
        
        int min = Math.min(size1,size2);
        System.out.println(min);
        int count = 0;
        int j = size1 - 1;
        int k = size2 - 1;
        
        for(int i = min - 1 ; i >= 0 ; i--){
            char ch1 = s1.charAt(j);
            j--;
            char ch2 = s2.charAt(k);
            k--;
            count++;
            if(ch1 != ch2) return count;
        }
        

        if(size1 > size2) return size2+1;
        if(size2 > size1) return size1+1;
        
        
        return -1;
        
    }
    public static void main(String[] args) {
        int m = 15;
        int n = 3;
        System.out.println(posOfRightMostDiffBit(m,n));
    }
}
