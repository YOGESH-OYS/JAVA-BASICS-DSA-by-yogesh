package LEC07SUBTOPICS;

import java.util.Arrays;

public class VARARGS {
    public static void main(String[] args) {
        num(1,2,3,4,5,6,7,8);
    }
    static  void num(int ...s){//short form of array
        System.out.println(Arrays.toString(s));
    }
}
