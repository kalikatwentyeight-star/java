package constructor;

public class copyconstructor {
    private int id;
    private String name;

    public copyconstructor (int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy constructor
    public copyconstructor(copyconstructor obj) {
        this.id = obj.id;
        this.name = obj.name;
    }

    // Method to display details
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        // Create original object
        copyconstructor original = new copyconstructor(1, "Original");

        // Create copy using copy constructor
        copyconstructor copy = new copyconstructor(original);

        // Display both
        System.out.println("Original object:");
        original.display();

        System.out.println("Copied object:");
        copy.display();

        // Modify copy to show they are independent
        copy.id = 2;
        copy.name = "Copied";

        System.out.println("After modifying copy:");
        System.out.println("Original object:");
        original.display();

        System.out.println("Copied object:");
        copy.display();
    }
}
