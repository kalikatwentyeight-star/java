class Vehicle {
    int height;
    int width;

    Vehicle(int h, int w) {
        height = h;
        width = w;
    }

    int area() {
        return height * width;
    }
}

class Car extends Vehicle {
    int length;

    Car(int h, int w, int l) {
        super(h, w);
        length = l;
    }

    int volume() {
        return height * width * length;
    }
}

public class JavaApplication19 {
    public static void main(String[] args) {
        Car car1 = new Car(5, 2, 4); // height=5, width=2, length=4

        System.out.println("Car height: " + car1.height);
        System.out.println("Car width: " + car1.width);
        System.out.println("Car length: " + car1.length);

        System.out.println("Area of car base: " + car1.area());
        System.out.println("Volume of car: " + car1.volume());
    }
}
