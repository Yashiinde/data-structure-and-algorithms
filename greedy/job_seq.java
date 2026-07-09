import java.util.ArrayList;
import java.util.Collections;

public class job_seq {
    static class job{
        int profit;
        int deadline;
        int id;

        public job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
        }
    }
    public static void main(String[] args) {
        int job_info[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<job> jobs= new ArrayList<>();

        for(int i=0;i<job_info.length;i++){
            jobs.add(new job(i, job_info[i][0], job_info[i][1]));
        }
        Collections.sort(jobs,(a,b)->b.profit-a.profit);
        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++){
            job curr= jobs.get(i);
            if(curr.deadline>time){
                time++;
                seq.add(curr.id);
            }
        }
        System.out.println(seq.size());
        System.out.println(seq);

    }
}
