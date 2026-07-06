import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int evsum=0;
        int oddsum=0;
        int choice;
        do {
            System.out.println("enter number5");
            num = sc.nextInt();

            if (num%2==0) {
                evsum= num+evsum;  // exit condition
            }
            else{
                oddsum =num+oddsum;
            }

            System.out.println("enter 0 for stop 1 for continue " );
            choice=sc.nextInt();

        } while(choice==0);

        System.out.println(evsum);
        System.out.println(oddsum);
    }
}
