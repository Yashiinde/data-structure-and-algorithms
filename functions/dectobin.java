public class dectobin {
    public static void dectobiny(int num){
        int n=0;
        int powe=0;
        while(num>0){
            int binary=num%2;
            n=n+binary*(int)(Math.pow(10,powe));
            num=num/2;
            powe++;
        }
         System.out.print(n);
    }
    public static void main(String[] args) {
        dectobiny(9);

    }
    
}
