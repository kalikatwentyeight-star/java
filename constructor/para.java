package constructor;
import java.util.Scanner;

public class para {
    private String name;
    private int age;
    public para(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        para student = new para(name, age);
        student.display();
    }
}
