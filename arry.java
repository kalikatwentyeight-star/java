class Std{
    String name;
    int age;
    double marks;
    void inputData(String name , int age , double marks) {
        this.name =name;
        this.age = age ;
        this.marks = marks;
    }
    void display(){
        System.out.println("Name " +name);
        System.out.println("Age " +age);
        System.out.println("marks " +marks);
         System.out.println("------------------------");
    }
}
public class array {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Student [] Students = new Student[3];
        for ( int i-0 ; i <Students.length;i++) {
            students[i] = new Student();
            System.out.println("enter details For student " + (i+1) + ":");
            System.out.println("Name");
            String name = sc.next();
            System.out.println("Age ");
            int age = sc.next();
            System.out.println("Marks ");

        }

    }
}