public class linkedlist {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;
    public static int size;
    public void addfirst(int data){
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;

        head=newnode;
    }
    public void addlast(int data){
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
        
    }
    public void prity(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        node temp=head;
        while(temp !=null){
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.println("null");
    }

    public void addindex(int  idx,int data){
        if(idx==0){
            addfirst(data);
            return;
        }
        node newnode=new node(data);
        size++;
        node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public int removefirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MAX_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removelast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MAX_VALUE;
        }else if(size==1){
            int val=tail.data;
            head=tail=null;
            size=0;
            return val;
        }
        node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;

    }

    public int search(int key){
        node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            i++;
            temp=temp.next;
        }
        return -1;
    }
    public int helper(node head,int key){
        if(head==null){
            return -1;
        }
        else if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return idx;
        }
        return idx+1;
    }
    public int recsearch(int key){
        return helper(head, key);
    }

    public void reverse(){
        node prev=null;
        node curr=tail=head;
        while(curr!=null){
            node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void remove2(int idx){
        int n=size-idx+1;
        node curr=head;
        if(n==1){
            head=head.next;
        }
        for(int i=1;i<n+1;i++){
            if(i==n-1){
                int val = curr.data;
                curr.next=curr.next.next;
                return ;
            }
            curr=curr.next;
        }
    }
    public boolean checkpalin(){
        if(head==null || head.next==null){
            return true;
        }
        node midnode=midlle(head);
        node prev=null;
        node curr=midnode.next;
        node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node right=prev;
        node left=head;
        while(right!=null){
            if(right.data!=left.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public node midlle(node head){
        node slow=head;
        node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next; //+2
            
        }
        return slow;
    }
    
    //  linked list part 2

    public boolean checkcycle(){
        node slow=head;
        node fast=head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;

    }
    public void removecycle(){
        node slow=head;
        node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            System.out.println("no cycle exists");
            return;
        }
        slow=head;
        node prev=null;
        while(slow!=fast){
            slow=slow.next;
            prev=fast;
            fast=fast.next;
        }
        prev.next=null;
    }
    public node getmid(node head){
        node slow=head;
        node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public node merge(node lefthalf,node righthalf){
        node mergell =new node(-1);
        node temp=mergell;
        while(lefthalf!=null && righthalf!=null){
            if(lefthalf.data<righthalf.data){
                temp.next=lefthalf;
                temp=temp.next;
                lefthalf=lefthalf.next; 
            }else{
                temp.next=righthalf;
                righthalf=righthalf.next;
                temp=temp.next;
            }
        }
        while(lefthalf!=null){
            temp.next=lefthalf;
            lefthalf=lefthalf.next;
            temp=temp.next;
        }
        while(righthalf!=null){
            temp.next=righthalf;
            righthalf=righthalf.next;
            temp=temp.next;
        }
        return mergell.next;
    }
    public node mergesort(node head){
        if(head==null || head.next==null){
            return head;
        }
        // find mid
        node mid=getmid(head);
        // left and rigth ms
        node righthead=mid.next;
        mid.next=null;

        node lefthalf=mergesort(head);
        node righthalf=mergesort(righthead);

        // merge
        return merge(lefthalf, righthalf);
    }

    public node zigzag(node head){
        node mid=getmid(head);
        
        node right=mid.next;
        mid.next=null;
        node leftstart=head;
        node prev=null;
        node curr=right;
        while(curr!=null){
            node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node rightstart=prev;
        node nextleft =new node(-1);
        node nextright=new node(-1);
        node temp=nextleft;
        while(leftstart!=null && rightstart!=null){
            nextleft=leftstart.next;
            leftstart.next=rightstart;
            nextright=rightstart.next;
            rightstart.next=nextleft;
            leftstart=nextleft;
            rightstart=nextright;

        }
        return temp.next;
    }
    public static void main(String[] args) {
        linkedlist ll= new linkedlist();
        // // ll.prity();
        // ll.addfirst(1);
        // // // ll.prity();
        // ll.addfirst(2 );
        // // // ll.prity();
        // ll.addlast(1);
        // // // ll.prity();
        // ll.addlast(2);
        // // ll.prity();
        // ll.addindex(2, 3);
        // ll.prity();
        // System.out.println(ll.size);
        // ll.removefirst();
        // ll.prity();
        // System.out.println(ll.size);
        // ll.removelast();
        // ll.prity();
        // System.out.println(size);
        // // System.out.println(ll.recsearch(3));
        // // ll.reverse();
        // ll.remove2(3);
        // 
        ll.addlast(1);
        ll.addlast(2); // second node
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);
        ll.prity();
        // create cycle: tail.next = second node
        // ll.tail.next = ll.head.next;
        // ll.removecycle();
        // ll.head=ll.mergesort(ll.head);
        ll.zigzag(head);
        ll.prity();
    }

}
