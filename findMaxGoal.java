
import java.util.Scanner;
public class findMaxGoal{

    public static int totaoGoal(int e1 , int e2 , int e3) {
        int count1 = 0;
        int count2 = 0;
        while (e3 != 1) { 
            if(e1 % e3 == 0){
                e1--;
                count1++;
            }else if(e2 % e3 == 0){
                e2--;
                count2++;
            }else{
                e3--;
            }
        }
        return count1 + count2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Striker Energy : ");
        int e1 = sc.nextInt();
        System.out.print("Enter The Second Striker Energy : ");
        int e2 = sc.nextInt();
        System.out.print("Enter The Goalkeeper Striker Energy : ");
        int e3 = sc.nextInt();
        System.out.println("Total Number Of Goal is " + totaoGoal(e1, e2, e3));
    }
}