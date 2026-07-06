public class revision {
   public static int factorial(int n){
    if(n==1){
        return n;
    }
    return n *factorial(n-1);
   } 
public static int sum(int n){
    if(n==1){
        return n;

    }
    return n+ sum(n-1);
}
public static int fibo(int n){
    if(n==1 || n==0){
        return n;
    }
    return fibo(n-1)+fibo(n-2);
}
public static boolean issorted(int arr[],int i){
    if(i==arr.length-1){
        return true;
    }
    if(arr[i]>arr[i+1]){
        return false;
    }
     return issorted(arr, i+1);
}
public static int firstoccur(int arr[],int i,int key){
    if(i<0){
        return -1;
    }
    if(arr[i]==key){
        return i;
    }
    return firstoccur(arr, i-1, key);

}
public static void main(String[] args) {
    int[] arr= {1,2,6,9,7,9,8};
    System.out.println(firstoccur(arr, arr.length-1, 9));
}
}
