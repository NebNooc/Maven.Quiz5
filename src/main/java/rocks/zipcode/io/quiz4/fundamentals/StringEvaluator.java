package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        // Finding all Palindromes in String
        ArrayList<String> al = new ArrayList<>();
        for(int i = 0; i < string.length(); i++) {
            for(int j = i; j <= string.length(); j++) {
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

    public static String[] getCommonSubstrings(String string1, String string2) {
        return null;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        return null;
    }
}
