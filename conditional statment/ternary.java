import java.util.*;
public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number : ");
        int number = sc.nextInt();
        String type= ((number%2)==0)? "even":"odd";
        System.out.println(type);

    }
    
}
