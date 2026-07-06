public class linklistSB {
     static class node{
            int data;
            node next;
                node(int data){
                this.data=data;
                this.next=null;
            }
        }
    static class stack{
       static node head=null;
       public static boolean isempty(){
        return (head==null);
       }
       public static void push(int data){
        node newnode = new node(data);
        if(isempty()){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
       }
       public static int pop(){
        if(isempty()){
            return-1;
        }
        int val=head.data;
        head=head.next;
        return val;
       }
       public static int peek(){
        if(isempty()){
            System.out.println("stack is empty");
            return -1;
        }
        return head.data;
       }
    }
    public static void main(String[] args) {
        stack s=new stack();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s.peek());
        s.pop();
         System.out.println(s.peek());
    }
}
