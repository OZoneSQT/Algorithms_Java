package algorithms_my.fibonacci;

    /*
        Exercise 1.4
            What is the time complexity for the iterative Fibonacci function?
        Exercise 1.5
            What is the time complexity for the recursive Fibonacci function?
        Exercise 1.6
            Implement both functions and compare the difference in time usage.
            Use: Calendar.getInstance().getTimeInMillis() to obtain system time.
    */

public class Fibonacci {

    public int fibonacciIterative(int n) {
        if(n <= 1) {
            return 1;
        }
        int fib = 2;
        int prevFib = 1;

        for(int i=2; i<n; i++) {
            int temp = fib;
            fib+= prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public int fibonacciRecursive(int n) {
        if(n <= 1) {
            return 1;
        }
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    public void firstSemesterFibonacci(int n) {
        int preNumber = 0;
        int nextNumber = 0;
        int sum = 0;

        System.out.println("\nFirst Semester");
        long startFirstSemesterTime_ns = System.nanoTime();
        for(int i = 0; i < n; i++) {
            if(i == 0 || i == 1){
                preNumber = 1;
                nextNumber = 1;
                System.out.println("Fibonacci number (" + i + ") is " + preNumber );
            }else {
                sum = preNumber + nextNumber;
                System.out.println("Fibonacci number (" + i + ") is: " + sum );
                preNumber = nextNumber;
                nextNumber = sum;
            }
        }
        long stopFirstSemesterTime_ns = System.nanoTime();

        long firstSemesterTime = stopFirstSemesterTime_ns - startFirstSemesterTime_ns;
        double roundedFirstSemesterTime = firstSemesterTime / Math.pow(10, 9);
        System.out.println("\nFirst Semester time: " + firstSemesterTime + " ns ~ " + roundedFirstSemesterTime + " s - Sub class");
    }

}
