public class insertionsort {
    public static void insert(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
            // System.out.println(arr[prev+1]);
        }
    }
public static void print(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }System.out.println();
}
    public static void main(String[] args) {
        int[] arr={1,5,3,2};
        insert(arr);
        print(arr);
    }
}
