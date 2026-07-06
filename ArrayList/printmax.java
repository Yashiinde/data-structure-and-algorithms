import java.util.*;
public class printmax {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(23);
        list.add(45);
        list.add(20);
        list.add(78);
        list.add(57);
        System.out.println(list);
        // problem find max element
        // int count=Integer.MIN_VALUE;
        // for(int i=0;i<list.size();i++){
        //     if(count<list.get(i)){
        //         count=list.get(i);
        //     }
        // }
        // System.out.println(count);
        
        //swap value
        // int temp=list.get(1);
        // list.set(1, list.get(4));
        // list.set(4, temp);
        // System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
