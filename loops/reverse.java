import java.util.*;
public class reverse {
    public static void main(String[] args) {
        // int number=10899;
        // int lastdigit=0;
        // while(number>0){
        //     lastdigit=number%10;
        //     System.out.print(lastdigit+" ");
        //     number=number/10;


        // }
        int n=10899;
        int rev = 0;
        while(n>0){
            int lastdigit=n%10;
            rev=(rev*10)+lastdigit;
            n=n/10;
        }
        System.out.println(rev);
    }
}
