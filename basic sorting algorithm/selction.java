public class selction {
    public static void selectsort(int num[]){
        for(int i=0;i<num.length;i++){
            int minpos=i;
            for(int j=i+1;j<num.length;j++){
                if(num[minpos]>num[j]){
                    minpos=j;
                }
            }
            int temp=num[minpos];
            num[minpos]=num[i];
            num[i]=temp;
        }
    }
    public static void printnum(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int num[]={1,3,5,2,4};
        selectsort(num);
        printnum(num);
    }
}
