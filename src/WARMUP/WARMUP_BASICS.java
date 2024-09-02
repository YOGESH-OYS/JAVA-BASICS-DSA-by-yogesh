package WARMUP;

public class WARMUP_BASICS {
        public static void main(String[] args) {
            int a = 10;
            int b = 12;

            String app = "java", spp= "jack";
            System.out.println(app);
            System.out.println(spp);
                /* The code below will print the words Hello World
                to the screen , MULTI LINE COMMAND */

            //SINGLE LINE COMMAND//
            System.out.println("Hello world!");
            System.out.println("I am learning Java.");
            System.out.println("It is awesome!");
            System.out.println(3);
            System.out.println(3 + 3);
            System.out.println(2 * 5);
            System.out.println(a>b);

            int myNum;
            myNum = 20;
            System.out.println(myNum);//20 OUTPUT//

            float f1 = 35e3f;
            double d1 = 12E4d;
            System.out.println(f1);
            System.out.println(d1);

            //----------------------------CASTING----------------------//

            //Widening Casting//
            int mInt = 9;
            double myDouble = mInt;
            System.out.println(mInt);      //9//
            System.out.println(myDouble);  //9.0//
            //narrow casting//

            double mDouble = 9.78d;
            int myInt = (int) mDouble; // Manual casting: double to int

            System.out.println(mDouble);   // Outputs 9.78
            System.out.println(myInt);      // Outputs 9

            //-----------------------------STRING OPERATORS-------------------------//

            String mapla = "kAajnkAjAbdkhbDf";
            String name = "kuduki";
            String dummy = mapla.concat(name); //CONCATINATION//
            String txt = "hi and \"hello\"java" , man = "it's me";
            System.out.println((txt+man));
            System.out.println(man);
            System.out.println(txt);
            System.out.println(mapla.length());
            System.out.println(mapla.toLowerCase());
            System.out.println(mapla.toUpperCase());
            System.out.println(mapla.indexOf("j"));
            System.out.println(mapla.concat(name));
            System.out.println(dummy.length());

            //-----------------------------MATH-----------------------------------//

            int ab = 12;
            int ba = 13;
            double ssa = Math.min(ab,ba);
            double sds = Math.max(ab,ba);
            int dss = (int) Math.sqrt(ab);//narrow casting//
            int dfd = (int) (Math.random() * 101);//narrow casting//
            double ddf = Math.abs(ab);
            System.out.println(ssa);
            System.out.println(sds);
            System.out.println(dss);
            System.out.println(dfd);
            System.out.println(ddf);


            //--------------------------------------boolian if else ---------------------------//

            int myAge = 65;
            int votingAge = 18;

            if (myAge >= votingAge) {
                System.out.println("Old enough to vote!");
            } else
            {
                System.out.println("Not old enough to vote.");
            }

            //-----------------SHORT HAND IF ELSE------------------------//
            //variable = (condition) ? expressionTrue :  expressionFalse;//

            String result = (votingAge<=myAge) ? "eligible" : "not eligible" ;
            System.out.println(result);


            //-------------------------------SWITCH---------------------------//
            int day = 3;
            String DAY = "";
            switch (day) {
                case 1:
                    DAY="Thursday";
                    break;
                case 2:
                    DAY="Thursday";
                    break;
                case 3:
                    DAY="Thursday";
                    break;
                case 4:
                    DAY="Thursday";
                    break;
                case 5:
                    DAY="Thursday";
                    break;
                case 6:
                    DAY="Thursday";
                    break;
                case 7:
                    DAY="Thursday";
                    break;
            }
            System.out.println(DAY);

            //----------------------------------------WHILE & DO WHILE LOOP -------------------------//


            int i = 0;
            while (i<=2) {
                System.out.println(i);
                i++;
            }


            int j = 0;
            do {
                System.out.println(j);
                j++;
            }
            while (j>=2);
            //------------------------------------FOR LOOP -------------------------------//


            for (int s = 0; s < 5; s++) {
                System.out.println(s); //System.out.print(s+" ");//
            }

            for (int v = 1; v <= 2; v++) {
                System.out.println("Outer: " + v); // Executes 2 times

                // Inner loop
                for (int m = 1; m <= 3; m++) {
                    System.out.println(" Inner: " + m); // Executes 6 times (2 * 3)
                }
            }

            //----------------------------------FOR EACH LOOP ----------------------------//

            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

            for (String q : cars) {
                if(q.length()> 3){
                    System.out.println(q);
                }
            }

            String[] cas = {"Volvo", "BMW", "Ford", "Mazda"};
            cas[0] = "Opel";
            for (String car : cas){
                System.out.println(car);
            }



            //---------------------------Continue and break -------------------------------------//


            for (int p = 0; p < 10; p++) {
                if (p >= 4) {

                    break; //continue except 4 rest will be printed //
                }
                System.out.println(p);
            }

            //------------------------------array loop------------------------------//
            int[][] mann ={{1,2,3,4},{5,6,7}};
            for (int l=0; l< mann.length ; ++l){
                for (int w=0; w < mann[l].length;++w){
                    System.out.println(mann[l][w]);
                }
            }
        }
}
