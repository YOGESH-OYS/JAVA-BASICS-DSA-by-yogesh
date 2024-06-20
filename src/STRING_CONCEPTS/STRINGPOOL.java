package STRING_CONCEPTS;

public class STRINGPOOL {
    public static void main(String[] args) {
        String a = "yogesh"; //assigned an object for a variable "a"
        System.out.println(a);
        a = "YOGESH"; // here a will be creating a new memory for new object and the old one will have to deal with garbage collection
        System.out.println(a);
        String  b1 = "yogesh";
        String  b = "yogesh";
        System.out.println(b1 == b); //since the object b1 and b in the pool the bool condition works by checking variables pointers pointing the same object or not
        //this is true
        String a1 = new String("name"); //assigning out of pool
        String a2 = new String("name");
        System.out.println(a1 == a2); // this checks the variable pointing same object ...since it's not this is false
        //using .equals() you can only check the value but not the variable
        System.out.println(a1.equals(a2)); //returns true

        System.out.println(a1.charAt(0)); // returns the ch in specific index

    }
}
