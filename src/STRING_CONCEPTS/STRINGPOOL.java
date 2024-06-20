package STRING_CONCEPTS;

public class STRINGPOOL {
    public static void main(String[] args) {
        String a = "yogesh"; //assigned an object for a variable "a"
        System.out.println(a);
        a = "YOGESH"; // here a will be creating a new memory for new object and the old one will have to deal with garbage collection
        System.out.println(a);
    }
}
