package math;

import util.StdOut;

/******************************************************************************
 *  Compilation:  javac IntegerToBinary.java
 *  Execution:    java IntegerToBinary n
 *  
 *  Prints out the binary representation of the integer n.
 *
 *  % java IntegerToBinary 8
 *  1000
 *
 *  % java IntegerToBinary 366
 *  101101110
 *
 ******************************************************************************/

public class IntegerToBinary {

    public static void convert(int n) {
        if (n == 0) return;
        convert(n / 2);
        StdOut.print(n % 2);
    }

    public static void main(String[] args) {
        int n = 52254;  // input integer to convert
        convert(n);
        StdOut.println();
    }

}


