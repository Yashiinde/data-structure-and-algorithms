public class interfaces {
    public static void main(String[] args) {
       child c1=new child();
       c1.cook();
       c1.playmusic();
}
}
// multiple inheritence using interfaces
interface mother {
    void cook();
    
}
interface father{
    void playmusic();
}
class child implements mother,father{
    public void cook(){
        System.out.println("he can cook");
    }
    public void playmusic(){
        System.out.println("he can play music");
    }
}
//  interfaces
interface car {
    void color();
    
}
class maruti implements car{
    public void color(){
        System.out.println("white");
    }
}
class toyota implements car{
    public void color(){
        System.out.println("black");
    }
}