import java.util.Scanner;

class Std {
    String name;
    int age;
    double marks;

    void inputData(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("------------------------");
    }
}

public class ArrayTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Std[] students = new Std[3];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Std();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter marks: ");
            double marks = sc.nextDouble();

            sc.nextLine(); // clears buffer

            students[i].inputData(name, age, marks);
            System.out.println("------------------------");
        }

        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}
