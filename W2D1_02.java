package W2D1_Array;

import java.util.Scanner;

public class W2D1_02 {
    public static void main(String[] args) {

        //  System.out.println("Sum Array is: " + sumArr());
        //  System.out.println("Average Array is: " + averageArr());
        checkEvenOdd();

    }

    //W2D1 Sum Array from user
    public static double sumArr() {
        int n;
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please enter the number of elements of the array: ");
            n = sc.nextInt();
        } while (n < 0);
        double array[] = new double[n];
        System.out.println("Please enter the number: ");
        for (int i = 0; i < n; i++) {
            System.out.print("The number " + (i + 1) + ": ");
            array[i] = sc.nextDouble();
            sum = sum + array[i];
        }
        return sum;
    }
    //W2D2 Average Array from user
    public static double averageArr() {
        int n;
        double sum = 0;
        double average = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please enter the number of elements of the array: ");
            n = sc.nextInt();
        } while (n < 0);
        double array[] = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("The number " + (i + 1) + ": ");
            array[i] = sc.nextDouble();
            sum = sum + array[i];
        }
        average = sum / n;
        return average;
    }
    //W2D3 Even and odd numbers in an array
    public static void checkEvenOdd() {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please enter the number of elements of the array: ");
            n = sc.nextInt();
        } while (n < 0);
        int array[] = new int[n];
        System.out.println("Please enter the number: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            if (0 == array[i] % 2) {
                System.out.println("The number " + (i + 1) + ": " + array[i] + " is even number");
            } else {
                System.out.println("The number " + (i + 1) + ": " + array[i] + " is odd number");
            }
        }

    }

}
