import java.util.*;
public class StackDB {
    public static void pushatbottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top =s.pop();
        pushatbottom(s, data);
        s.push(top);
        // pushatbottom(s, data);
    }
    public static String reverseStr(String str){
        Stack<Character> s= new Stack<>();
        int idx=0;
        while(idx<=str.length()-1){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder newstring=new StringBuilder("");
        while(!s.isEmpty()){
            newstring.append(s.pop());
        }
        str=newstring.toString();
        return str;
    }
    public static void reversestack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int val=s.pop();
        reversestack(s);
        pushatbottom(s, val);
    }
    public static void printstack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

    public static void stockspan(int[] stocks, int[] span){
        Stack<Integer> s= new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<stocks.length;i++){
            int currprice=stocks[i];
            while(stocks[s.peek()]< currprice && !s.isEmpty()){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;

            }else{
                span[i]=i-s.peek();
            }
            s.push(i);
        }
    }
    public static void nextgreater(int arr[]){
        Stack<Integer> s= new Stack<>();
        int nextgreat[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
         
            }
            if(s.isEmpty()){
                nextgreat[i]=-1;
            }else{
                nextgreat[i]=arr[s.peek()];
                
            }
            s.push(i);
        }
        for(int i=0;i<nextgreat.length;i++){
        System.out.print(nextgreat[i]+" ");
      }
    }
    public static boolean check(String str){
        Stack<Character> s= new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[' ){
                s.push(ch);
            }
            else{
                if(s.empty()){
                    return false;
                }
                if(s.peek()=='(' && ch==')' || s.peek()=='{' && ch=='}' || s.peek()=='[' && ch==']'){
                    s.pop();
                }else{
                    return false;
                }

            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isvalid(String str){
        Stack<Character> s= new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==')'){
                int count =0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                } 
                if(count<1){
                    return true;

                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void maxarea(int[] height){
        int maxarea=0;
        int[] smright=new int[height.length];
        // for smaller right
        Stack<Integer> s= new Stack<>();
        for(int i=height.length-1;i>=0;i--){

            while(!s.isEmpty() && height[s.peek()]>= height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                smright[i]=height.length;
            }else{
                smright[i]=s.peek();
            }
            s.push(i);
        }
        //  for(int i=0;i<smright.length;i++){
        // System.out.print(smright[i]+" ");
        // }
    //   while(!s.empty()){
    //     s.pop();
    //   } 
    s=new Stack<>();
      int[] smleft=new int[height.length];
      for(int i=0;i<height.length;i++){

            while(!s.isEmpty() && height[s.peek()]>= height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                smleft[i]=-1;
            }else{
                smleft[i]=s.peek();
            }
            s.push(i);
        }
        // for(int i=0;i<smleft.length;i++){
        // System.out.print(smleft[i]+" ");
        // }
        for(int j=0;j<smleft.length;j++){
            int width = (smright[j]-smleft[j]-1);
            int area =height[j] * width;
            maxarea=Math.max(maxarea, area);
        }
        System.out.println(maxarea);
    }
    public static void main(String[] args) {
      int height[]={2,1,5,6,2,3};
      maxarea(height);
      
      
}
}

