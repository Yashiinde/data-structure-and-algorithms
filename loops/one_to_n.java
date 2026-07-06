import java.util.*;
public class one_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter range:");
        int range = sc.nextInt();
        int counter=1;
        while (counter<=range){
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println();
    }
    
}
