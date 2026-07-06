public class doublyll {
    public class node{
        int data;
        node next;
        node prev;

        public node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static node head;
    public static node tail;
    public static int size;
    public void printy(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void addfisrt(int data){
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;

    }
    public int removefirst(){
        if(head==null){
            System.out.println("linklist is empty");
            return Integer.MIN_VALUE;
        }
        else if(head.next==null){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val =head.data;
        size--;
        head=head.next;
        head.prev=null;
        return val;
    }
    public void addlast(int data){
        node newnode=new node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
    }
    public int removelast(){
        if(head==null){
            System.out.println("dll is empty");
            return Integer.MIN_VALUE;
        }
        else if(head.next==null){
            int val=tail.data;
            head=tail=null;
            size--;
            return val;
        }
        int val =tail.data;
        tail=tail.prev;
        tail.next=null;
        return val;
    }
    public void addspecific(int idx,int data){
        node newnode=new node(data);
        node temp=head;
        int i=1;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        node temp1=temp.next;
        temp.next=newnode;
        temp1.prev=newnode;
        newnode.next=temp1;
    }
    public int removespe(int idx){
        node temp=head;
        int i=1;
        while(i<idx){
            temp=temp.next;
            i++;
        }
        int val=temp.data;
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        return val;
    }
    public void reverse(){
        node curr=head;
        node prev=null;
        node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        doublyll dll=new doublyll();
        dll.addfisrt(5);
        dll.addfisrt(4);
        dll.addfisrt(3);
        dll.addfisrt(2);
        dll.addfisrt(1);
        dll.printy();
        // dll.removefirst();
        // dll.printy();
        // dll.addlast(6);
        // dll.printy();
        // dll.removelast();
        // dll.printy();
        // dll.addspecific(3, 9);
        // dll.printy();
        // dll.removespe(3);
        // dll.printy();
        dll.reverse();
        dll.printy();

    }
}
