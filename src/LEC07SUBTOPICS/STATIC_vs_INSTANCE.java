package LEC07SUBTOPICS;

class MyClass {
    int A; // This is an instance variable.

    void setA(int value) {
        A = value; // Set the value of instance variable A
    }

    void printA() {
        System.out.println(A); // Print the value of instance variable A
    }
}

public class STATIC_vs_INSTANCE {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        obj1.setA(5);
        obj1.printA(); // Output: 5

        MyClass obj2 = new MyClass();
        obj2.setA(10);
        obj2.printA(); // Output: 10
    }
}

//Instance Variables (like int A)
//What Are They?
//Instance variables are variables declared inside a class but outside any methods.
//These variables belong to each individual object (instance) of that class. Every object gets its own copy of the instance variables.

//Instance Method
//What Are They?
//Instance methods are methods that operate on instance variables and can only be called by an object (since they rely on the specific data inside that object).