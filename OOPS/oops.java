public class oops {
    public static void main(String[] args) {
        // Pen p1=new Pen();
        // p1.color="blue";
        // p1.setcolor("yellow");
        // System.out.println(p1.color);

        Bank b1 =new Bank();
        b1.username="yashraj shinde";
        System.out.println(b1.username);
        b1.setpassword("yashya");
        System.out.println(b1.getpass());
    }
}
class Bank{
    public String username;
    private String password;
    void setpassword(String pwd){
        password=pwd;
    }
    String getpass(){
        return this.password;
    }
}

class Pen{
    String color;
    int tip;
    void setcolor( String newcolor){
        color=newcolor;
     }
     void setip(int newtip){
        tip=newtip;
     }
    
}
