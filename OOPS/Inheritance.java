 class Animal{
        String name = "puppy";
        Animal(){
            System.out.println("I am automatically called animal constructor");
        }
        void eat(){
            System.out.println("Eating");;
        }
        void sound(){
            System.out.println("Animal sound");
        }
        Animal(String name){
            System.out.println(name);
        }
    }
    class Dog extends Animal{
        Dog(){
            
            super("Tommy");
            System.out.println("I am automatically called dog constructor");
            super.eat();
        }
        void sound(){
            System.out.println("dog sound");
        }
        void bark(){
            System.out.println("Barking");
        }
        
    }
public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
        d.sound();
        System.out.println(d.name);
    }
}
