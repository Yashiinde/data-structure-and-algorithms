public class queueDB1 {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;

        }
        
    }
    static class queue{
        static node head=null;
        static node tail=null;

        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        public static void add(int data){
            node newnode=new node(data);
            if(head==null){
                head=tail=newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is alreay empty");
                return Integer.MIN_VALUE;

            }
            int front=head.data;
            if(head==tail){
                head=tail=null;
            }else{
                head=head.next;
            }
            return front;

        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("list is empty");
                return -1;

            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        queue q =new queue();
        q.add(4);
        System.out.println(q.peek());
    }
}
