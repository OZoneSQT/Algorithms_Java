package algorithms.strings;

import util.StdOut;

/******************************************************************************
 *  Compilation:  javac Subsequence.java
 *  Execution:    java Subsequence s t
 *  Dependencies: StdOut.java
 *  
 *  Determines whether string s is a subsequence of string t.
 *
 *
 ******************************************************************************/


public class Subsequence {

    // is the string s a subsequence of the string t?
    public static boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (m == 0) return true;

        int i = 0;
        for (int j = 0; j < n; j++) {
            if (s.charAt(i) == t.charAt(j)) i++;
            if (i == m) return true;
        }
        return false;
    }

    public static void main(String[] args) { 
        String s = args[0];
        String t = args[1];
        StdOut.println(isSubsequence(s, t));
    }

}
