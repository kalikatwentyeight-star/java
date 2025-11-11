interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

interface Men {
    void sleep();
}

class Sparrow<T> implements Animal, Bird {
    T name;

    Sparrow(T n) {
        name = n;
    }

    public void eat() {
        System.out.println(name + " eats seeds.");
    }

    public void fly() {
        System.out.println(name + " flies in the sky.");
    }

    void show() {
        System.out.println("Bird Name: " + name);
    }
}

class Aman<T> implements Men {
    T msg;

    Aman(T m) {
        msg = m;
    }

    public void sleep() {
        System.out.println("I am sleeping " + msg);
    }

    void display() {
        System.out.println("Message: " + msg);
    }
}

public class Main {
    public static void main(String[] args) {
        Sparrow<String> s = new Sparrow<>("Sparrow");
        Aman<String> a = new Aman<>("peacefully.");

        a.sleep();
        a.display();

        s.show();
        s.eat();
        s.fly();
    }
}