import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        System.out.print("Enter your age :");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("adult");
        }
        else if (age>13 && age<18){
            System.out.println("teenager");
        }
        else{
            System.out.println("minor");
        
        }
    }
}
