import java.util.*;

public class creation {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Binarytree{
        static int idx=-1;
        public static node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            node newnode=new node(nodes[idx]);
            newnode.left=buildtree(nodes);
            newnode.right=buildtree(nodes);
            return  newnode;
        }
    }
    public static void preorder(node root){ //O(n) time complexity
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data+" ");
    }
    public static void levelorder(node root){
        if(root==null){
            return;

        }
        Queue<node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            node currnpde=q.remove();
            if(currnpde==null){
                if(q.isEmpty()){
                    break;
                }else{
                    System.out.println();
                    q.add(null);
                }
            }else{
                System.out.print(currnpde.data+" ");
                if(currnpde.left!=null){
                    q.add(currnpde.left);
                }
                if(currnpde.right!=null){
                    q.add(currnpde.right);
                }
            }
        }

    }
    public static int height(node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;
    }
    public static int count(node root){
        if(root==null){
            return 0;
        }
        int lh=count(root.left);
        int rh=count(root.right);
        return (lh+rh+1);
    }
    public static int sum(node root){
        if(root==null){
            return 0;
        }
        if(root.left==null&& root.right==null){
            return root.data;
        }
        int ls=sum(root.left);
        int Rs=sum(root.right);
        return (ls+Rs);
    }
    public static int diameter_approch1(node root){
        if(root==null){
            return 0;
        }
        int ld=diameter_approch1(root.left);
        int rd=diameter_approch1(root.right);
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(Math.max(ld, rd),lh+rh+1);
    }

    //  diameter of binary tree
    static class Info{
        int diam;
        int ht;

        Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info diameter_approach2(node root){
        if(root==null){
            return new Info(0, 0);
        }
        Info leftInfo=diameter_approach2(root.left);
        Info rightInfo=diameter_approach2(root.right);
        int diam=Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
        int ht=Math.max(leftInfo.ht, rightInfo.ht)+1;
        return new Info(diam, ht);
    }

    //  subtreee in tree
    public static boolean isidentical(node node,node subroot){
        if(node==null && subroot==null){
            return true;
        }else if(node==null || subroot==null || node.data!=subroot.data){
            return false;
        }
        if(!isidentical(node.left, subroot.left)){
            return false;
        }
        if(!isidentical(node.right, subroot.right)){
            return false;
        }
        return true;
    }
    public static boolean issubtree(node root,node subroot){
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
            if(isidentical(root,subroot)){
                return true;
            }

        }
       return issubtree(root.left, subroot) || issubtree(root.right, subroot);
    }

    // top view int binary tree
    static class info{
        int hd;
        node node;

        public info(int hd,node node){
            this.node=node;
            this.hd=hd;
        }
    }
    public static void topview(node root){
        Queue<info> q= new LinkedList<>();
        HashMap<Integer,node> map=new HashMap<>();
        int min=0,max=0;
        q.add(new info(0, root));
        q.add(null);
        while(!q.isEmpty()){
            info curr=q.remove();
            if(curr==null){
                if(!q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd, curr.node);
            }
            if(curr.node.left!=null){
                q.add(new info(curr.hd-1, curr.node.left));
                min = Math.min(min, curr.hd-1);

            } 
            if(curr.node.right!=null){
                q.add(new info(curr.hd+1, curr.node.right));
                max = Math.max(max, curr.hd+1);
        }
    }
            for(int i=min;i<=max;i++){
                System.out.print(map.get(i).data+" ");
            }
            System.out.println();

    }
    public static void main(String[] args) {
        
        // Binarytree tree= new Binarytree();
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
        
        node subroot=new node(2);
        subroot.left=new node(4);
        subroot.right=new node(5);

        topview(subroot);
    }
}
