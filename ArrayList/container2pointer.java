import java.util.ArrayList;

public class container2pointer {
    public static int contains(ArrayList<Integer> height){
        int lp=0;
        int rp=height.size()-1;
        int max= Integer.MIN_VALUE;
        while(lp<rp){
            int high=Math.min(height.get(rp), height.get(lp));
            int width=rp-lp;
            int water=high*width;
            max=Math.max(max, water);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
            
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

height.add(1);
height.add(8);
height.add(6);
height.add(2);
height.add(5);
height.add(4);
height.add(8);
height.add(3);
height.add(7);
    
        System.out.println(contains(height));
}


}
