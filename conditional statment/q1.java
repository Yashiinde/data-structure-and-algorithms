import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any marks : ");
        int marks = sc.nextInt();
        String type = (marks>=33)? "Pass":"Fail";
        System.out.println(type);

    }
}
