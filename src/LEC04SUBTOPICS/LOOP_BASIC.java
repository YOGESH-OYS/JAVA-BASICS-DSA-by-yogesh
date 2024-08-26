package LEC04SUBTOPICS;

public class LOOP_BASIC {
    public static void main(String[] args) {
        int a14 = 1;//use while loop when you don't know how many times it's going to run
        while (a14 != 5){//if the condition is true then run the loop
            System.out.println(a14);
            a14+=1;
        }
        for(int i = 0 ; i != 5 ; i++ ){//when you know how many times it will run use for loop
            System.out.println(i);
        }
    }
}
