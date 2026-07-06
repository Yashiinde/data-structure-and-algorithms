public class prime_check{
    // public static int primee(int num){
    //     for(int i =2;i<num;i++){
    //         if(num%i==0){
    //             System.out.println("not prime");
    //             break;
    //         }else{
    //             System.out.println(" prime");
    //             break;
    //         }
    //     }
    //      return num;
    //  public static boolean primi(int n){
    //     boolean isprime=true;
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i=2;i<n;i++){
    //         if(n%i==0){
    //             return false;
                
    //         }
    //     }
    //     return true;
    //  }    

     public static boolean primu(int num){
        if(num==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
     }

     public static void pir(int n){
        for(int i=2;i<=n;i++){
            if(primu(i)==true){
                System.out.print(i+" ");
            }
        }
        System.out.println();
     }
   
    public static void main(String[] args) {
        // System.out.println(pir(97));
        pir(100);
    }
}
