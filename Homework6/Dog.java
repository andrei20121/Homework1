package Homework6;

public class Dog extends Animals {

    public static int countDog = 0;
    public static String typeThisClass = "Собака";

    Dog(String name, float maxRun, float maxSwim) {
        super(typeThisClass, name, maxRun, maxSwim);
        ++countDog;
    }



}
