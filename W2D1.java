package W2D1_Array;

public class W2D1 {
    public static void main(String[] args) {

    //  System.out.println("Sum Array is: " + sumArr());
    //  System.out.println("Average Array is: " + averageArr());
    //    checkEvenOdd();
        double[] arr = {10, 30, 40, 20, 101};
        System.out.println(sumArr(arr));
        System.out.println(averageArr(arr));
        checkEvenOdd(arr);


    }

//W2D1 Sum Array from user
    public static double sumArr(double arr[]) {
        int n = arr.length;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
//W2D2 Average Array from user
    public static double averageArr(double arr[]) {
        int n = arr.length;
        double sum = 0;
        double average = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        average = sum / n;
        return average;
    }
//W2D3 Even and odd numbers in an array
    public static void checkEvenOdd(double arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (0 == arr[i] % 2) {
                System.out.println("The number " + (i + 1) + ": " + arr[i] + " is even number");
            } else {
                System.out.println("The number " + (i + 1) + ": " + arr[i] + " is odd number");
            }
        }

    }

}
