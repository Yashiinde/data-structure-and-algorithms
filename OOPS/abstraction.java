public class abstraction {
    public static void main(String[] args) {
        mustang m1=new mustang();
        
        
    }
}
abstract class animal{
    String color;
    animal(){
        color="brown";
        System.out.println("animal constructor called");
    }
    abstract void walk();

}
class horse extends animal{
    horse(){
        System.out.println("horse constructor called");
    }
    void changecolor(){
        color="white";
    } 
    void walk(){
        System.out.println("walks on 2 legs ");
    }
}
class mustang extends horse{
    mustang(){
        System.out.println("mustang constructor called");
    }
    void changecolor(){
        color="black";
    } 
    void walk(){
        System.out.println("walks on 4 legs");
    }
}