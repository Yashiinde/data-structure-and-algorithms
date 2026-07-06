public class q3 {
    public static boolean palindrome(int num){
        int org = num;
        int n=0;
        while(num>0){
            int rem=num%10;
            n=n*10+rem;
            num=num/10;
        }
       
         if(n==org){
            return true;
         }
         return false;
    }
    public static void main(String[] args) {
         
        System.out.println(palindrome(123));
    }
    
}
