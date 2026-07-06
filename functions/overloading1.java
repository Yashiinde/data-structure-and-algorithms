public class overloading1 {
    // sum for 2 number 
    public static int sum(int a , int b){
        return a+b;
    }
    // sum for 3 numbers
    public static int sum(int a , int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(10, 12));
        System.out.println(sum(10 , 12, 15));

    }
    
}
