public class q4 {
    public static int sumofdigi(int num){
        int n=0;
        while(num>0){
            int rem=num%10;
            n=n+rem;
            num=num/10;
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println(sumofdigi(45));
    }
    
}
