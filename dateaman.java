public class dateaman {
    class Animal {
        void speak() {
            System.out.println("Animal speaks");
        }
    }

    class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {
        dateaman da = new dateaman();
        Dog d = da.new Dog();
        d.speak();
        d.bark();
    }
}
