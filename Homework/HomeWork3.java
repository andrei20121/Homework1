package Homework;

import java.util.Arrays;
import java.util.Random;

public class HomeWork3 {
    public static Random random = new Random();

    public static void main(String[] args){

        System.out.println("**********WORK 1*************");

        int[] workArray = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(workArray(workArray)));

        System.out.println("**********WORK 2*************");
        int[] myArrayTwo = new int[100];
        workArrayTwo(myArrayTwo);

        System.out.println("**********WORK 3*************");

        int[] workArray3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        workArrayThree(workArray3);

        System.out.println("**********WORK 4*************");

        doubleArray(10);

        System.out.println("**********WORK 5*************");

        int[] workArrayFour = returnArray(5, 50);
        //printArray1("5. Array from method", workArrayFour);
        System.out.println(Arrays.toString(workArrayFour));

        System.out.println("**********WORK 6*************");

        int[] workArrayFive = {1, 5, 3, 2, 11, 4};
        System.out.println(minArray(workArrayFive));
        System.out.println(maxArray(workArrayFive));

        System.out.println("**********WORK 7*************");
            //Не понял как делать, добавил в себе в бэклог, чуть позже попробую решить)
    }

    public static int[] workArray(int[] myArray){
        for (int i = 0; i < myArray.length; i++){
            if(myArray[i] == 0 ){
                myArray[i] = 1;
            } else {
                myArray[i] = 0;
            }
        } return myArray;
    }

    public static void workArrayTwo(int[] myArrayTwo){
        for (int i = 0; i < myArrayTwo.length; i++){
            myArrayTwo[i] = i + 1;
        }
        System.out.println(Arrays.toString(myArrayTwo));
    }

    public static void workArrayThree(int[] workArray3){
        for(int i = 0; i < workArray3.length; i++){
            if(workArray3[i] < 6){
                workArray3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(workArray3));
    }

    public static void doubleArray(int size){
        int[][] workArray4 = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                workArray4[i][i] = 1;
                workArray4[i][workArray4.length - 1 - i] = 1;
                System.out.print(workArray4[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[] returnArray(int len, int initialValue){
        int[] lengthArray = new int[len];
        for (int i = 0; i < lengthArray.length; i++) {
            len += initialValue;
            int a = (int) (Math.random() * ++len) + initialValue;
            lengthArray[i] = a;
        }
        return lengthArray;
    }

    public static int minArray(int[] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if (min > array[i])
                min = array[i];
        }
        return min;
    }
    public static int maxArray(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if (max < array[i])
                max = array[i];
        }
        return max;
    }
}
