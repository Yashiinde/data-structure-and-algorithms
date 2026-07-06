import java.util.*;
public class rgcontinue {
    public static void main(String[] args) {
        int counter=0;
        do{   
            counter++;
            if(counter%10==0){
                continue;
            }
            System.out.println(counter);
            
        }while(counter<=100);
    }
}
