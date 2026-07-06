import java.util.*;
public class queimpleq {
    static class queue{
        static Deque<Integer> d= new LinkedList<>();

        public static void add(int data){
            d.addLast(data);
        }
        public static int remove(){
            return d.removeFirst();
        }
        public static int peek(){
            return d.getFirst();
        }
    }
    public static void main(String[] args) {
        queue q= new queue();
        q.add(5);
        q.add(4);
        q.add(3);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

    }
}
