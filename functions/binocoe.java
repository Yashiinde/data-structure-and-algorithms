import java.util.*;
public class binocoe {
    public static int factoi(int num){
        
        int facto=1;
        for(int i=1;i<= num;i++){
           facto=i*facto;
           
        }
        
        // System.out.println(facto);
        return facto;
        
    }
    public static int bino(int n, int r){
        int a=factoi(n);
        int b=factoi(r);
        int c=factoi(n-r);
         
        int d = a/(b*c);
        return d;
        }
    public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
    //    System.out.println("enter n");
    //    int f=sc.nextInt();
    //    System.out.println("enyter r");
    //    int z=sc.nextInt();
    //    int n=f;
    //    int r=z;
       System.out.print("your value is :"+(bino(5,4)));
        // factoi(4);
    }
}
