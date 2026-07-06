import java.util.*;
public class inbuild {
    public static void print(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Integer arr[]={1,5,3,2,4};
        // Arrays.sort(arr,0,3);
        // print(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        print(arr);
    }
}
