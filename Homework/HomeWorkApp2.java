package Homework;

public class HomeWorkApp2 {
    public static void main(String[] args){
        System.out.println("**********WORK 1*************");

        System.out.println("Result: " + myBool(5, 5));

        System.out.println("**********WORK 2*************");

        myPositive(10);

        System.out.println("**********WORK 3*************");

        System.out.println(myNegative(2));

        System.out.println("**********WORK 4*************");

        myLine("Передается строка номер", 10);

        System.out.println("**********WORK 5*************");

        System.out.println(myYear( 100));

        System.out.println("**********FINISH*************");
    }
    public static boolean myBool( int a, int b){
        if(a + b >=10 && a + b < 20){
           return true;
        } else{
            return false;
        }
    }

    public static void myPositive( int c){
        if( c % 2 == 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean myNegative( int d){
        if( d <= 0){
            System.out.print("Мне вернулось отрицательное число, это: " + d + ", ");
            return true;
        } else {
            System.out.print("Мне вернулось положительное число, это: " + d + ", ");
            return false;
        }
    }

    public static void myLine( String s, int f){
        for(int i = 1; i <= f; i++){
            System.out.println( s + " " + i);
        }
    }

    public static boolean myYear(int j){

        if( j % 4 == 0 && j % 100 != 0 || j % 400 == 0 ){
            System.out.print("Год " + j + " високосный и он возвращает: ");
            return true;
        } else {
            System.out.print("Год " + j + " невисокосный и он возвращает: ");
            return false;
        }
    }


}
