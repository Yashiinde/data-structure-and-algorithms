import java.util.*;
public class Stackimpldeq {
    static class stack{
        static Deque<Integer> d1=new LinkedList<>();
        // static Deque<Integer> d2=new LinkedList<>();

            public static boolean isEmpty(){
                return d1.isEmpty();
            }
            public static void push(int data){
                d1.addLast(data);
            }
            public static int pop(){
                if(isEmpty()){
                    System.out.println("stack is empty");
                    return -1;
                }
                int val=d1.removeLast();
                return val;
            }
            public static int peek(){
                if(isEmpty()){
                    System.out.println("stack is empty");
                    return -1;
                }
                int val=d1.getLast();
                return val;
            
            }
        
    }
        public static void main(String[] args) {
        stack s = new stack();
        System.out.println(s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
