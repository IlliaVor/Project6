package Part2Arrayhandling;

import java.util.Random;
import java.util.Scanner;
public class Part2Arrayhandling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int[] userArray = inputArray(in);
        int sum = calculateSum(userArray);
        System.out.println("Sum of the array elements: " + sum);


        int[] randomArray = randomArray(in);
        int largestValue = findlargestValue(randomArray);
        System.out.println("Largest value in the array: " + largestValue);


        System.out.print("Enter a value to search in the array: ");
        int searchValue = in.nextInt();
        int index = searchValueInArray(randomArray, searchValue);
        if (index != -1) {
            System.out.println("Value " + searchValue + " found at index " + index);
        } else {
            System.out.println("Value " + searchValue + " not found in the array.");
        }

        in.close();
    }


    public static int[] inputArray(Scanner in) {
        System.out.print("Enter the length of the array: ");
        int length = in.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = in.nextInt();
        }

        return arr;
    }


    public static int[] randomArray(Scanner in) {
        System.out.print("Enter the length of the random array: ");
        int length = in.nextInt();
        int[] arr = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(100);
        }

        return arr;
    }


    public static void printArray(int[] arr) {
        System.out.print("Array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }


    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }


    public static int findlargestValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    public static int searchValueInArray(int[] arr, int searchValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue) {
                return i;
            }
        }
        return -1;


    }
}