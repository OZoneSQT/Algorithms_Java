package math;

import util.StdOut;

/******************************************************************************
 *  Compilation:  javac Euclid.java
 *  Execution:    java Euclid p q
 *  
 *  Reads two command-line arguments p and q and computes the greatest
 *  common divisor of p and q using Euclid's algorithm.
 *
 *  Remarks
 *  -----------
 *    - may return the negative of the gcd if either p or q is negative
 *
 ******************************************************************************/

public class Euclid {

    // recursive implementation
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }

    // non-recursive implementation
    public static int gcd2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

    public static void main(String[] args) {
        int p = 678;
        int q = 1358;
        int d  = gcd(p, q);
        int d2 = gcd2(p, q);
        StdOut.println("gcd(" + p + ", " + q + ") = " + d);
        StdOut.println("gcd(" + p + ", " + q + ") = " + d2);
    }
}


