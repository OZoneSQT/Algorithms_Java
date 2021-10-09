package exercises.sorting; /******************************************************************************
 *  Compilation:  javac SPT.java
 *  Execution:    java SPT < jobs.txt
 *  Dependencies: Job.java
 *  
 *  Given a set of jobs and processing times, find a schedule
 *  that minimizes the average completion time of jobs.
 *
 ******************************************************************************/

import util.StdIn;
import util.StdOut;

import java.util.Arrays;

public class SPT {

    public static void main(String[] args) {
        int n = StdIn.readInt();
        Job[] jobs = new Job[n];
        for (int i = 0; i < n; i++) {
            String name = StdIn.readString();
            double time = StdIn.readDouble();
            jobs[i] = new Job(name, time);
        }

        // sort jobs in ascending order of processing time 
        Arrays.sort(jobs);

        // print out schedule
        for (int i = 0; i < n; i++)
            StdOut.println(jobs[i]);
    }

}