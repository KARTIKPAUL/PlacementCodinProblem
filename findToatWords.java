public class findToatWords {

    public static int numberOfWords(String s){
        int n = s.length();
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z') count++;
        }
        return count+1;
    }
    public static void main(String[] args) {
        String s1 = "saveTheChangesInCode";
        System.out.println(numberOfWords(s1));
        String s2 = "youAndI";
        System.out.println(numberOfWords(s2));
    }
}
