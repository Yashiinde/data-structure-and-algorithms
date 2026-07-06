import java.util.*;
public class checkprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:");
        int num=sc.nextInt();

        for(int i=2;i<=num;i++){
            String number=(num%i==0)?"not prime":"prime";
               
            System.out.println(number); 
            break;
        }
        
    }
}
