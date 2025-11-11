//SINGLE INHERITANCE 
public class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
public class Dog extends Animal {
    void bark() {
        System.out.println("bhabhabah");
    }
}
public class TestInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}



