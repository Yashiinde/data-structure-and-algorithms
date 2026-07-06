import java.util.Stack;

public class q2stack2 {
   
    static class queue{
    static Stack<Integer> s1= new Stack<>();
    static Stack<Integer> s2= new Stack<>();

    public static boolean isEmpty(){
        return s1.isEmpty();
    }
    public static void add(int data){
        s1.push(data);
    }
    public static int remove(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int val= s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return val;
    }
    public static int peek(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int val1= s2.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return val1;
    }

    }
    public static void main(String[] args) {
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}
