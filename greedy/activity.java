import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class activity {
    public static void sorted(int start[], int end[]){
          int maxact=0;
    ArrayList<Integer> ans=new ArrayList<>();
    //  1st activity
    maxact=1;
    ans.add(0);
    int lastend=end[0];
    for(int i=1;i<end.length;i++){
        if(start[i]>=lastend){
            maxact++;
            ans.add(i);
            lastend=end[i];
        }
    }
    System.out.println("maximum activit:"+maxact);
    System.out.println(ans);
    }
    public static void endnotsort(int start[],int end[]){
    int[][] activities=new int[start.length][3];
    for(int i=0;i<start.length;i++){
        activities[i][0]=i;
        activities[i][1]=start[i];
        activities[i][2]=end[i];
    }
    Arrays.sort(activities,Comparator.comparing(o -> o[2]));

   
    int maxact=0;
    ArrayList<Integer> ans=new ArrayList<>();
    //  1st activity
    maxact=1;
    ans.add(activities[0][0]);
    int lastend=activities[0][2];
    for(int i=1;i<end.length;i++){
        if(activities[i][1]>=lastend){
            maxact++;
            ans.add(activities[i][0]);
            lastend=activities[i][2];
        }
    }
    System.out.println("maximum activit:"+maxact);
    System.out.println(ans);
    }
    public static void main(String[] args) {
        int start[]={5,0,2,5,8,1};
    // end time basis sorted
         int end[]={9,6,3,7,9,2};
        endnotsort(start, end);
        // sorted(start, end);
  
    }
}
