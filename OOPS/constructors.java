public class constructors {
    public static void main(String[] args) {
        
    
    student s1= new student();
    s1.name= "yahsraj";
    s1.marks[0]=100;
    s1.marks[1]=90;
    s1.marks[2]=80;
    student s2=new student(s1);
    s1.marks[2]=70;
    for(int i=0;i<3;i++){
        System.out.println(s1.marks[i]);
    }
     for(int i=0;i<3;i++){
        System.out.println(s2.marks[i]);
    }
    System.out.println(s2.name);
   
}
}
class student{
    String name;
    int marks[];
    student(){
         marks=new int[3];
    }

    // shallow copy constructor

    // student(student s1){
    //     marks=new int[3];
    //     this.name=s1.name;
    //     this.marks=s1.marks;
       
    // }

    // deep  copy constructor
    student(student s1){
        marks=new int[3];
        this.name=s1.name;
        for(int i=0;i<3;i++){
            marks[i]=s1.marks[i];
        }
    }
}

