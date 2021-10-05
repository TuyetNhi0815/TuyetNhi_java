package W1D2_Conditional;

import java.util.Scanner;

public class W1D2 {
    public static void main(String[] args){
//D2H1 Check positive or negative
/*        double number = 0;
        number = inputDouble(number);
        if (number >= 0){
            System.out.println("The number " + number + " is positive");
        } else {
            System.out.println("The number " + number + " is negative");
        }*/
//D2H2 Find greatest of 3 numbers.
/*        double num1 = 0, num2= 0, num3 = 0;
        double maxNum;
        num1 = inputDouble(num1);
        num2 = inputDouble(num2);
        num3 = inputDouble(num3);
        maxNum = Math.max(Math.max(num1, num2), num3);
        System.out.println("The greatest of 3 numbers is: " + maxNum);*/
//D2H3 Display the multiplication table
/*        int num1 = 0;
        num1 = inputInt(num1);
        if (num1 > 9 | num1 < 2){
            System.out.println("invalid value");
            System.out.println("Please enter a number from 2 to 9!");
        } else {
            System.out.println("Multiplication table of " + num1);
            for (int i = 1; i <= 10; i++){
                System.out.println(num1 + " x " + i + " = " + num1*i);
            }
        }*/
//D2H4 Count the number of digits
/*        int count = 0;
        count = countNumber(count);
        System.out.println("The number has " + count + " digits");*/
//D2H5 Reverse a number
/*        int num = 0;
        num = reverseNumber(num);
        System.out.println(num);*/
//D2H6 Palindrome
/*        int num = 0;
        checkPalindrome(num);*/
    }

// Check Palindrome
    public static void checkPalindrome(int number){
        int num, temp;
        System.out.println("Please enter number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        temp = num;
        int reverse = 0;
        for (;num != 0; num /= 10) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
        }
        if (temp == reverse){
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is NOT Palindrome");
        }
    }
//Reverse a number
    public static int reverseNumber(int number){
        int num = 0;
        num = inputInt(num);
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return reverse;
    }
//CountNumber of digits
    public static int countNumber(int number){
        int num = 0;
        int count = 0;
        num = inputInt(num);
        if (num == 0) {
            count = 1;
        }
        while (num != 0) {
            num = num / 10;
            ++count;
        }
        return count;
    }
//Get dounle number from the user
    public static double inputDouble(double number){
        double num;
        Scanner input = null;
        System.out.println("Please enter number: ");
        try {
            input = new Scanner(System.in);
            num = input.nextDouble();
        } catch (Exception ex){
            System.err.println(ex.toString());
            return 0;
        }
        return num;
    }
//Get Int number from the user
    public static int inputInt(int number){
        int num;
        Scanner input = null;
        System.out.println("Please enter number: ");
        try {
            input = new Scanner(System.in);
            num = input.nextInt();
        } catch (Exception ex){
            System.err.println(ex.toString());
            return 0;
        }
        return num;
    }
}
