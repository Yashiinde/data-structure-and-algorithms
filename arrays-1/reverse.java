import java.util.*;
public class reverse {
    public static int revarr(int numbers[]){
        int start=0,end=numbers.length-1;
        while(start<end){
            int temp=numbers[end];
            numbers[end]=numbers[start];
            numbers[start]=temp;
            start++;
            end--;
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,5,8,4,9,15};
        revarr(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
    
}
