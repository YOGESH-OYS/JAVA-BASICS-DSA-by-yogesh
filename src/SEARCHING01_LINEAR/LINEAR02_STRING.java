package SEARCHING01_LINEAR;

import java.util.Scanner;

public class LINEAR02_STRING {
    public static void main(String[] args) {
        while (true){

            //FOR STRING

            Scanner value = new Scanner(System.in);
            System.out.println("Enter the element to be searched in the array [ Exit enter Esc ] : ");
            String search = value.next();
            if (search.equals("Esc")) break;
            String str = "yogesh";
            System.out.println(st_search(str , search));
        }
    }
    static String st_search(String var , String tosearch){
        if (var.isEmpty())  return "is empty";
        for (int i = 0; i < var.length(); i++) {
            if (tosearch.charAt(0) == var.charAt(i)){
                return ("the element entered index is "+ i );
            }
        }

        return ("YOU ENTERED WRONG ELEMENT");
    }
}
