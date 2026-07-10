public class cretation {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=left;
            this.right=right;
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
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree= new Binarytree();
        node root=tree.buildtree(nodes);
        preorder(root);
    }
}
