import java.util.ArrayList;
public class difine {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        // add element in list
        list.add(12);
        list.add(45);
        list.add(18);
        list.add(7);

        // aanother add function
        // list.add(1, 21);
        // System.out.println(list);
        
        // get element from list

        // int nnum=list.get(2);
        // System.out.println(nnum);

        // remove element from list

        // list.remove(0);
        // System.out.println(list);

        // set element in index
        // list.set(2, 21);
        // System.out.println(list);
        
        // contains element return true or false
        // System.out.println(list.contains(45));
        
        // size of arraylist
        System.out.println(list.size());

        // print arraylist

        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();

        // problem print reverse
         for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
