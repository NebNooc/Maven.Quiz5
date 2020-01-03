package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        // Finding all Palindromes in String
        ArrayList<String> al = new ArrayList<>();
        for(int i = 0; i < string.length(); i++) {
            for(int j = i; j <= string.length(); j++) {
                if(!string.substring(i,j).equals("") && !al.contains(string.substring(i,j)))
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
        String[] arr1 = getAllSubstrings(string1);
        String[] arr2 = getAllSubstrings(string2);

        List<String> list = new ArrayList<>();
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                if(arr1[i].equals(arr2[j]))
                    list.add(arr1[i]);
            }
        }
        // Converting arraylist to array
        String[] arr = new String[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] arr = getCommonSubstrings(string1, string2);

        String longest = "";
        for (String s : arr) {
            if(s.length() > longest.length())
                longest = s;
        }
        return longest;
    }
}
