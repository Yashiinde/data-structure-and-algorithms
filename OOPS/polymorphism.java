public class polymorphism {
    public static void main(String[] args) {
       deer d=new deer();
       d.eat();
}
}
// method overriding 
class animal{
    void eat(){
        System.out.println("eats everything");
    }
}
class deer extends animal{
    void eat(){
        System.out.println("eat grass");
    }
}
// method overloading
class calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
}