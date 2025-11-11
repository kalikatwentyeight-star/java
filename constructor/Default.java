
public class Default {

    public Default(){
        System.out.println("this is default constructor");
    }
    void show (){
        System.out.println("this is normal function");
    }
    public static void main (String[] args) {
         Default ob = new Default();
        ob.show();
    }
}
