package W1D3_String;

import java.util.Scanner;

public class W1D3_02 {
    public static void main(String[] args) {
        String str = "Hello world Hello world Hello world Hello world";
        String subStr = "Hello world Hello world Hello";
        System.out.println(countRepeated(str, subStr));
    }
    public static int countRepeated(String str, String subStr) {
        int count = 0;
        int a;
        a = str.indexOf(subStr);
        if (a != -1) {
            count = 1;
            for (int i = a; i <= str.length() - subStr.length(); i++) {
                a = str.indexOf(subStr, i);
                if (a != -1) {
                    i = i + a + subStr.length();
                    count++;
                }
            }
        } else count = 0;
        return count;
    }

}
