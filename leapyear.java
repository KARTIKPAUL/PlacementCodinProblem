
public class leapyear {
    public static boolean  isLeapYear(int year){

        if(year % 4 == 0 || year % 100 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0 && year % 4 == 0){
                    return true;
                }
            }else if(year % 4 == 0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int year = 2025;
        System.out.println(isLeapYear(year));
    }
}
