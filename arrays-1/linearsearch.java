
public class linearsearch {
    public static int ls(int marks[],int key){
        for(int i =0;i<marks.length;i++){
            if(marks[i]==key){
                return i;

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int marks[]={2,4,6,8,10,12,14,16,18,20};
        int key=7  ;
        int index=ls(marks, key);
        if(index == -1){
            System.out.println("not found ");

        }else{
            System.out.println("found index is "+index);
        }
        
    }
}
