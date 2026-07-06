public class recusion2 {
    public  static int tiling(int n){
        if(n==0||n==1){
            return 1;
        }
        int f= tiling(n-1);
        int g=tiling(n-2);
        return f+g;
    }
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
}
