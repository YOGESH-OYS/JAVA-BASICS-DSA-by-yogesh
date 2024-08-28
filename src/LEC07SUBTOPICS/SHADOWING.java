package LEC07SUBTOPICS;

public class SHADOWING {
    static int a = 10;// global variable
    public static void main(String[] args) {
        System.out.println(a);
        int a = 20;//making the 10 as a shadow and printing the new value
        System.out.println(a);//ghosting a variable (10)
        shadow();
        shadow(a);
    }
    static void shadow(){
        System.out.println(a);//the original global value
    }
    static void shadow(int s){
        System.out.println(s+1);//the original global value
    }
}
