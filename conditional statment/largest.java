import java.util.*;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter fisrt no:");
        int A = sc.nextInt();
        System.out.println("enter second no:");
        int B = sc.nextInt();
        if (A>B){
            System.out.println(A+" is largest");
        }
        else if (A==B){
            System.out.println("both are equal");
        
        }
        else{
            System.out.println(B+" is largest");
        }
    }
}
