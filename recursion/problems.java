public class problems {
    public static void printn(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printn(n-1);
    }
    public static void printl(int n){
         if(n==1){
            System.out.print(n);
            return;
         }
            printl(n-1);
            System.out.print(" "+n);
        }
    public static int facto(int n){
        if(n==1){
            return 1;
        }
        facto(n-1);
        return n*facto(n-1);
    }
    public static int sumnatural(int n){
        if(n==1){
            return 1;
        }
        sumnatural(n-1);
        return n+sumnatural(n-1);

    }
    public static int fibbo(int n){
        if(n==0||n==1){
            
            return n;
        }
        
         int f1 = fibbo(n-1);
         int f2= fibbo(n-2);
         
        // System.out.print(f);
        return f1+f2;
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
public static int occur(int arr[],int i,int target){
    if(i<0){
        return -1;
    }
    
    if(arr[i]==target){
        return i;
    }
    
      return  occur(arr, i-1, target);
    
    
}
public static int power(int x , int n){
    if(n==0){
        return 1;
    }
    
    return x*power(x, n-1);
}
public static int factor(int n){
    if(n==1){
        return n;
    }
    return n* facto(n-1);
}
public static void removedup(String str,int idx, StringBuilder newstr ,boolean map[]){
    if(idx>=str.length()){
        System.out.println(newstr);
        return;
    }
    char ch= str.charAt(idx);
    if((map[ch-'a'])==true){
        removedup(str, idx+1, newstr, map);
    }
    else{
        map[ch-'a']=true;
        newstr.append(ch);
        removedup(str, idx+1, newstr, map);
    }
}   
public static void occurs(int arr[],int key,int idx){
    if(idx==arr.length){
        return;
    }
    if(arr[idx]==key){
        System.out.print(idx);
    }
    occurs(arr, key, idx+1);
}
public static void inletter(String digit[],int n){
    if(n==0){
        return;
    }
    int lastnumber=n%10;

    inletter(digit, n/10);
    System.out.print(digit[lastnumber]+" ");
    
}
public static int lengthy(String str , int count){
    if(count==str.length()){
        return count;

    }
    return lengthy(str, count+1);
    
}
public static void mergesort(int arr[],int si,int ei){
      if(si>=ei){
        return;
    }
    int mid=si+(ei-si)/2;
  
    mergesort(arr, si, mid);
    mergesort(arr, mid+1, ei);
    mergesort(arr, si, mid, ei);
}
public static void mergesort(int arr[],int si,int mid,int ei){
    int temp[]=new int[ei-si+1];
    int i=si;
    int j=mid+1;
    int k=0;
    while(i<=mid && j<=ei){
        if(arr[i]<arr[j]){
            temp[k]=arr[i];
            i++;
        }
        else{
            temp[k]=arr[j];
            j++;
        }
        k++;
    }
    while(i<=mid){
        temp[k++]=arr[i++];
    }
    while(j<=ei){
        temp[k++]=arr[j++];
    }
    for(k=0,i=si;k<temp.length;k++,i++){
        arr[i]=temp[k];
    }
}
public static void mergeprint(int arr[]){
    for(int i=0;i<arr.length  ;i++){
        System.out.print(arr[i]+" ");
    }
}
   public static void main(String[] args) {
   int arr[]={4,5,8,2,3,6};
   mergesort(arr, 0, arr.length-1);
    mergeprint(arr);
   } 
}
