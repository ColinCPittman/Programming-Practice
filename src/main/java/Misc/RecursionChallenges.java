package Misc;

import java.util.Arrays;

public class RecursionChallenges {
    public static void main(String[] args) {
        // System.out.println(isInString2('a', "cream"));
        // System.out.println(howManyTimesCharInStr("ale", 'p'));
        // System.out.println(reverse("abc"));
        System.out.println(isPalindrome("A Santa at NASA"));
        int array[] = {1, 2, 3, 4, 5, 6};
        System.out.println(multiplyArray(array));
        System.out.println(countDigitsNonNegative(2457));
        System.out.println(addAllDigitsNonNegative(1234));
        System.out.println(addAllDigitsNonNegative(11111));
        System.out.println(isSorted(array));
        System.out.println(substrings("Dimitri assface", 4));
        System.out.println(substringCounter("d", "d"));
        System.out.println(interleaving("ACDABC", "ABC", "ACD"));
        System.out.println(interleavingNonRecursive("ACDABC","ABC","ACD"));
        //recursive method to multiply all the elements in an array
        //write a recursive method to check if an array is sorted
    }

    public static boolean interleaving(String str1, String str2, String str3) {
        if (str1.equals("")) return true;

        if (!str2.isEmpty() && str1.substring(0, 1).equals(str2.substring(0, 1))) {
            if (interleaving(str1.substring(1), str2.substring(1), str3)) {
                return true;
            }
        }

        if (!str3.isEmpty() && str1.substring(0, 1).equals(str3.substring(0, 1))) {
            if (interleaving(str1.substring(1), str2, str3.substring(1))) {
                return true;
            }
        }

        return false;
    }
    
    public static boolean interleavingNonRecursive(String A, String B, String C) {
        int lenA = A.length(), lenB = B.length(), lenC = C.length();

        if (lenA != lenB + lenC) {
            return false;
        }

        boolean[][] dp = new boolean[lenB + 1][lenC + 1];
        dp[0][0] = true;

        for (int i = 1; i <= lenB; ++i) {
            dp[i][0] = dp[i - 1][0] && B.charAt(i - 1) == A.charAt(i - 1);
        }
        for (int j = 1; j <= lenC; ++j) {
            dp[0][j] = dp[0][j - 1] && C.charAt(j - 1) == A.charAt(j - 1);
        }

        for (int i = 1; i <= lenB; ++i) {
            for (int j = 1; j <= lenC; ++j) {
                dp[i][j] = (dp[i - 1][j] && A.charAt(i + j - 1) == B.charAt(i - 1)) ||
                        (dp[i][j - 1] && A.charAt(i + j - 1) == C.charAt(j - 1));
            }
        }

        return dp[lenB][lenC];
    }
    public static int substringCounter(String str, String sub) {
        if (str.length() < sub.length()) return 0;
        if (str.substring(0, sub.length()).equals(sub)) return 1 + substringCounter(str.substring(1), sub);
        return 0 + substringCounter(str.substring(1), sub);
    }

    public static String substrings(String str, int length) {
        if (str.length() < length) return "";
        if (str.length() == length) return str;
        return str.substring(0, length) + "\n" + substrings(str.substring(1), length);
    }

    public static int addAllDigitsNonNegative(int number) {
        if (number / 10 == 0) return number;
        return (number % 10) + addAllDigitsNonNegative(number / 10);
    }

    public static int countDigitsNonNegative(int number) {
        if (number / 10 == 0) return 1;
        return 1 + countDigitsNonNegative(number / 10);
    }

    public static boolean isSorted(int[] array) {
        if (array.length == 1) return true;
        if (array[0] < array[1]) {
            return isSorted(Arrays.copyOfRange(array, 1, array.length));
        }
        return false;
    }

    public static int multiplyArray(int[] array) {
        int sum;
        if (array.length == 1) return array[0];
        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i + 1];
        }
        return array[0] * multiplyArray(newArray);
    }
    // public static int largestElement(int[] array) {
    //     if(array.length == 1) return array[0];
//
    // };

    //write a method that determines if a string is a palindrome. Palindromes are symmetrical like AMMA.
    public static boolean isPalindrome(String str) {
        str = str.trim().toLowerCase();
        if (str.length() < 2) return true;
        if (str.length() >= 2) {
            if (str.charAt(0) == str.charAt(str.length() - 1)) return isPalindrome(str.substring(1, str.length() - 1));
        }
        return false;
    }

    public static String reverse(String str) {
        if (str.length() == 1) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static int howManyTimesCharInStr(String str, char c1) {
        if (str.equals("")) return 0;
        if (str.charAt(0) == c1) return 1 + howManyTimesCharInStr(str.substring(1), c1);
        return howManyTimesCharInStr(str.substring(1), c1);
    }

    public static boolean isInString(char value, String str) {
        char current;
        try {
            current = str.charAt(0);
            if (current == value) return true;
            return isInString(value, str.substring(1));
        } catch (IndexOutOfBoundsException err) {
            return false;
        }
    }

    public static boolean isInString2(char value, String str) {
        char current;
        if (str.equals("")) return false;
        current = str.charAt(0);
        if (current == value) return true;
        else return isInString(value, str.substring(1));

    }
}
