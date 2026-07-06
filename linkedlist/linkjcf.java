import java.util.LinkedList;

public class linkjcf {
    public static void main(String[] args) {
    LinkedList<Integer> ll= new LinkedList<>();
    
    // 
    ll.addFirst(7);
    ll.addFirst(6);
    ll.addLast(8);
    ll.addLast(9);
    System.out.println(ll);
    ll.removeLast();
    System.out.println(ll);
    ll.removeFirst();
    System.out.println(ll);
    ll.remove(1);
    System.out.println(ll);
    ll.add(8);
    System.out.println(ll);
    ll.add(1, 5);
    System.out.println(ll);
    
        
    System.out.println(ll.get(ll.size()/2));
    }
}
