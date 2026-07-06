public class statics {
    public static void main(String[] args) {
        student s1=new student();
        s1.name="yash";
        s1.school="bvck";
         System.out.println(s1.name+s1.school);
        student s2=new student();
        s2.name="shinde";
        System.out.println(s2.name+s2.school);
        System.out.println(s1.marks(100, 90, 80));
        s2.marks(0, 0, 0)
    }
}
class student{
    String name;
     static int marks(int p,int c, int m){
        return (p+c+m)/3;
    }
    static String school;
}