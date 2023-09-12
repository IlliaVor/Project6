package Part1Arrays;
import java.util.Arrays;
public class Part1Syntax {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i * 4;

        }

        int size = 5;
        double[] array2 = new double[size];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i * 3;
        }

        System.out.println("Length of Array 1: " + array1.length);
        System.out.println("Length of Array 2: " + array2.length);


        System.out.println("Array 1 elements:");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Element located at index " + i + ": " + array1[i]);

        }

        System.out.println("Array 2 elements:");
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Element located at index " + i + ": " + array2[i]);
        }

        int[] array3 = {1, 4, 6, 9, 11, 8};
        Arrays.sort(array3);
        System.out.println("Right location: ");

        for (int i = 0; i < array3.length; i++) {
            System.out.println("Element located at index " + i + ": " + array3[i]);


        }

        int[] a = new int[10];
        a[4] = 45;
        System.out.println("5th element value: " + a[4]);


        int[] b = new int[10];
        int value = b[1000];


        }



    }







