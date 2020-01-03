package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        // Finding all Palindromes in String
        ArrayList<String> al = new ArrayList<>();
        for(int i = 0; i < string.length(); i++) {
            for(int j = i; j <= string.length(); j++) {
                if(isPalindrome(string.substring(i, j)) && !al.contains(string.substring(i,j)) && !string.substring(i,j).equals(""))
                    al.add(string.substring(i,j));
            }
        }
        // Converting arraylist to array
        String[] arr = new String[al.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = al.get(i);
        }

        return arr;
    }

    public static Boolean isPalindrome(String string) {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder();
        for(int i = string.length() - 1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }
        return sb.toString();
    }
}
