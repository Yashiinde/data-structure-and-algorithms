public class inhertence {
    public static void main(String[] args) {
        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs=4;
        // System.out.println(dobby.legs);
        Fish f1= new Fish();
        bird b1=new bird();
        mammal m1=new mammal();
        f1.eat();
        f1.swim();
        b1.fly();
        m1.walk();
    }
}
class Animal{
    String color;
     void eat(){
        System.out.println("eats");
     }
     void breath(){
        System.out.println("breaths");
     }

} 

// heirarchical inheritence 
class Fish extends Animal{
    void swim(){
        System.out.println("swims in water");
    }
}
class bird extends Animal{
    void fly(){
        System.out.println("fly in air");
    }
}
class mammal extends Animal{
    void walk(){
        System.out.println("walk on road");
    }
}


//  multi level inheritence
// class mammal extends Animal{
//     int legs;
// }
// class Dog extends mammal{
//     String breed;
// }

// derived class single inheritance
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("swims in water");
//     }
// }
