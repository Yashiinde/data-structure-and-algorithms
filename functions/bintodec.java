public class bintodec {
    public static void bintodeci(int binum){
        int decnum=0;
        int powe=0;
        while(binum>0){
            int lastdigit=binum%10;
            decnum=decnum+(lastdigit*(int)Math.pow(2, powe));
            binum=binum/10;
            powe++;
        }
        System.out.println(decnum);
    }
    public static void main(String[] args) {
        bintodeci(1000);
    }
    
}
