package Lesson1.online;

public class Lesson2 {

    public static void main(String[] args){
       String name = "Andrei";
       switch (name){
           case "An":
               System.out.println("An");
               break;
           case "dr":
               System.out.println("dr");
               break;
           case "ei":
               System.out.println("ei");
               break;
           default:
               System.out.println("Andrei");
               break;

       }

       System.out.println("Result myMath = " + myMath(2, 10));

       table( 10, 10);
    }
    public static int myMath(int bse, int sin) {
        int result = 1;
        for(int i = 1; i <= sin; i++){
            result = result + bse;
        }
        return result;
    }

    public static void table( int width, int height){
        for(int i = 1; i < width; i++){
            for (int j = 1; j < height; j++){
                System.out.print( i * j +"\t");
            }
            System.out.println();
        }
    }

}
