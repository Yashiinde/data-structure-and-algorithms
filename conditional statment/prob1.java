import java.util.*;
public class prob1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter any number:");
        int number = sc.nextInt();
        String check= (number>=0)?"positive" : "negative";
        System.out.println(check);
    }
    
}
