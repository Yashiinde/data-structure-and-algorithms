import java.util.ArrayList;

public class rotatedsorted {
    public static boolean pair(ArrayList<Integer> list,int target){
        int n=list.size();
        int bp=-1;
        for(int i=0;i<n;i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int rp=bp;
        int lp=bp+1;
        while(rp != lp){
            if(list.get(lp)+list.get(rp)==target){
                System.out.print(lp+" "+rp);
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pair(list, 16));
    }
}
