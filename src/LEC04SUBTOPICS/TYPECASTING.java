package LEC04SUBTOPICS;

public class TYPECASTING {
    public static void main(String[] args) {
    float a1 = 23.56f;
    int a2 = (int) a1;
        //converts float into int
        System.out.println(a2);
    int a3 = 129;
    byte a4 = (byte) a3;
        System.out.println(a4);
        //what happens here is byte only can handle -128 to 127 Therefore after entering above 127 it will only answer you the greatest negative of the size "-128...-127"
        //and also vice versa for -129 and above will result on "128...127"....reaching -256 and 256 is 0
    byte a5 = 10;
    byte a6 = 20;
    int a7 = a5*a6 + 2;
        // here byte actually exceeds the range , condition like this will be converted as per the way of the output by java itself (AUTOMATIC TYPE CONVERSION)
        System.out.println(a7);
    int a8 = 'a';
    int a9 = 'z';
    int a10 = 'A';
    int a11 = 'Z';
        System.out.println(a8+a9+a10+a11);
        //97+122+65+90=374
        System.out.println("hello"+" in english");
        System.out.println("你好"+" in chinese");
        System.out.println("こんにちは"+" in japanese");
        //Since java is unicode whatever it can print with ease
    int a12 = (int) (3 * 2.5);
    int a13 = (int) (3 * 2.3);
    //the difference in printing the numbers through print and through the data type declaration
        System.out.println(3* 2.5);
        System.out.println(3* 2.3);
        System.out.println(a12);
        System.out.println(a13);
    }
}
