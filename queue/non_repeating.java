import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class non_repeating {
    public static void non_repeat(String str){
        Queue<Character> q= new LinkedList<>();
        int freq[]=new int[26];
        // 
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
            
        }
        System.out.println();
    }
    public static void interleave(Queue<Integer> q){
        Queue<Integer> q1= new LinkedList<>();
        int len= q.size()/2;
        for(int i=0;i<len;i++){
            q1.add(q.remove());
        }
        while(!q1.isEmpty()){
            q.add(q1.remove());
            q.add(q.remove());
        }


    }
    public static void reverse(Queue<Integer> q){
        Stack<Integer> s= new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
       reverse(q);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }

    }
}
