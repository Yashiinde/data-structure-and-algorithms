import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        int facto=1;
        System.out.print("enter any number: ");
        int num=sc.nextInt();
        if(num<=1){
                System.out.println("1");
                
            } 
        else{  
        do{
            i++;
            
            
            facto = i*facto;
            
        }while(i<num); 
      System.out.println(facto);
        }
    }
}


