import java.util.ArrayList;

public class conainer {
    public static int contains(ArrayList<Integer> heigth){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<heigth.size();i++){
            for(int j=i+1;j<heigth.size();j++){
                int high =Math.min(heigth.get(i), heigth.get(j));
                int width=j-i;
                int water = high*width;
                max=Math.max(max, water);
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
