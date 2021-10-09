package algorithms_my.fibonacci;

public class Main {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int numberToRun = 50;

        // 1756200 ns
        System.out.println("Iterative");
        long startInteractiveTime_ms = System.nanoTime();
        for (int i = 0; i < numberToRun; i++) {
            System.out.println("Fibonacci number (" + i + ") is " + fibonacci.fibonacciIterative(i));
        }
        long stopInteractiveTime_ns = System.nanoTime();

        // 157217871300 ns
        System.out.println("\nRecursive");
        long startRecursiveTime_ns = System.nanoTime();
        for (int i = 0; i < numberToRun; i++) {
            System.out.println("Fibonacci number (" + i + ") is " + fibonacci.fibonacciRecursive(i));
        }
        long stopRecursiveTime_ns = System.nanoTime();


        firstSemesterFibonacci(numberToRun);

        fibonacci.firstSemesterFibonacci(numberToRun);


        long iterativeTime = stopInteractiveTime_ns - startInteractiveTime_ms;
        double roundedInteractiveTime = iterativeTime / Math.pow(10, 9);
        System.out.println("Iterative time: " + iterativeTime + " ns ~ " + roundedInteractiveTime + " s");

        long recursiveTime = stopRecursiveTime_ns - startRecursiveTime_ns;
        double roundedRecursiveTime = iterativeTime / Math.pow(10, 9);
        System.out.println("Recursive time: " + recursiveTime + " ns ~ " + roundedRecursiveTime + " s");

    }

    // 814100 ns (in sub class)
    // 762500 ns in main class)
    private static void firstSemesterFibonacci(int n) {
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
        System.out.println("\nFirst Semester time: " + firstSemesterTime + " ns ~ " + roundedFirstSemesterTime + " s - Main class");
    }

}
