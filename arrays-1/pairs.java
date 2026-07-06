
public class pairs {
    public static int printpairs(int numbers[]){
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                int curr=numbers[i];
                System.out.print("("+curr+","+numbers[j]+")");
                tp++;
            }System.out.println();
            
        }System.out.println(tp);
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,4,6,8,9,3};
        printpairs(numbers);
    }    
}
