import java.util.*;

public class cretation {
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
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree= new Binarytree();
        node root=tree.buildtree(nodes);
        System.out.println(diameter_approch1(root));
    }
}
