package W1D3_String;

import java.util.Scanner;

public class W1D3 {
    public static void main(String[] args){
//D3H1 compare two strings
/*        String str1 = "I am beautiful";
        String str2 = "I AM BEAUTIFUL";
        String str3 = "I Am BeautifuL ";
        compareString(str1, str2);
        compareString(str1, str3);*/
//D3H2+3 Concatenate and Get length of String
/*        String lastName = "Nguyen Thi Tuyet";
        String firstName = "Nhi";
        String fullName = lastName + " " + firstName;
        System.out.println("My name is: " + fullName);
        System.out.println("Length of fullName is: " + fullName.length());*/
//D3H4+5+6 Get a substring & uppercase & lowercase
/*        String str = "It is better to be hated for what you are than to be loved for what you are not";
        System.out.println(str.substring(0, 42)); //Get a substring
        System.out.println(str.substring(42, 79));
        String upstr = str.toUpperCase(); //Uppercase
        System.out.println(upstr);
        System.out.println(upstr.toLowerCase()); //Lowercase*/
//D3H7 Reverse a string
/*        String str = "Love your life";
        reverseString2(str);
        reverseString(str);*/
//D3H8 Count number of time a character repeated in a string.
        String str = "Hello world Hello world Hello world Hello world";
        System.out.println("The key word repeated " + countRepeated02(str) + " times in string!");
//D3H9 Convert integer to string
/*        int a = 12345;
        System.out.println(convertToString(a) + 10);*/
//D3H10 Convert string to integer
/*        String b = "12345";
        System.out.println(convertToInt(b) + 10);*/
//D3H11 Swap the 2 strings
/*        String a = "Life";
        String b = "Love";
        String c;
        System.out.println("Before: " + a + " " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After: " + a + " " + b);*/
//D3H12 Check string is palindrome or not
/*        String str = inputString();
        if (str.equals(reverseString03(str))) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is NOT Palindrome");
        }*/

    }

// Convert string to integer
    public static int convertToInt(String str) {
        int number;
        try {
            number = Integer.parseInt(str);
        } catch (Exception ex){
            System.err.println(ex.toString());
            return 0;
        }
        return number;
    }
// Convert integer to string
    public static String convertToString(int number) {
        String str = String.valueOf(number);
        return str;
    }
// Count number of repeated
    public static int countRepeated(String str) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter character: ");
        String key = input.next();
        input.close();
        int count = 0;
        for (int i = 0; i <= str.length() - key.length(); i++ ) {
            String check = str.substring(i, i + key.length());
            int compare = key.compareToIgnoreCase(check);
            if (compare == 0) {
                count++;
            }
        }
        return count;
    }
    public static int countRepeated02(String str) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter character: ");
        String key = input.next();
        input.close();
        String newStr = str.toLowerCase();
        String newKey = key.toLowerCase();
        int count = 0;
        int a;
        a = newStr.indexOf(newKey);
        if (a != -1) {
            count = 1;
            for (int i = a; i <= str.length() - key.length(); i++) {
                a = newStr.indexOf(newKey, i);
                if (a != -1) {
                    i = i + a + key.length();
                    count++;
                }
            }
        } else count = 0;
        return count;
    }
// Reverse a string -> Print only
    public static void reverseString(String str) {
    for (int i = str.length() - 1; i >= 0 ; i--)
        System.out.print(str.charAt(i));
    }
    public static void reverseString02(String str) {
        StringBuilder new_str = new StringBuilder();
        new_str.append(str);
        new_str = new_str.reverse();
        System.out.println(new_str);
    }
// Reverse a string 03 -> return String
    public static String reverseString03(String str) {
        String strRev = "";
        for (int i = str.length() - 1; i >= 0 ; i--)
            strRev = strRev + str.charAt(i);
        return strRev;
    }
// Compare String
    public static void compareString(String str1, String str2) {
        int compare = str1.compareToIgnoreCase(str2);
        if (compare == 0) {
            System.out.println(str1 + " is equal to " + str2);
        } else {
            System.out.println(str1 + " is NOT equal to " + str2);
        }
    }
    public static int compareString02(String str1, String str2) {
        int compare = str1.compareToIgnoreCase(str2);
        int count = 0;
        if (compare == 0) {
            count ++;
        }
        return count;
    }
// Get string from the user
    public static String inputString() {
        System.out.println("Please enter string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        return str;
    }
}
