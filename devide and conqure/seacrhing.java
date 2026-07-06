public class seacrhing {
    public static int searching(int arr[],int target,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;

        if(arr[mid]==target){
            return mid;
        }
        if(arr[si]<=arr[mid-1]){
            if(arr[si]<=target && target<=arr[mid]-1){
                return searching(arr, target, si, mid-1);
            }
            else{
                return searching(arr, target, mid+1, ei);
            }
        }
        else{
            if(arr[mid+1]<=target && target<=arr[ei]){
                return searching(arr, target, mid+1, ei);
            }
            else{
                return searching(arr, target, si, mid-1);
            }
        }
    }
    public static int searchy(int arr[],int target,int si,int ei){
        while(si<ei){
            int mid=si+(ei-si)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(arr[si]<=arr[mid]){
                if(arr[si]<=target && target<= arr[mid]){
                    ei=mid;
                }
                else{
                    si=mid+1;
                }
            }
            else{
                if(arr[mid]<=target && target<=arr[ei]){
                    si=mid+1;
                }
                else{
                    ei=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int idx=searchy(arr, 0, 0, arr.length-1);
        System.out.println(idx);
        
    }
}

