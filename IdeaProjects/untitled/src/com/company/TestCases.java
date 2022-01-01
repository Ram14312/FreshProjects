package com.company;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestCases {

    public static void main(String[] args) {
        Result result= JUnitCore.runClasses(Parallelwhile.class,ParallelFor.class);
        System.out.println("Ran"+result.getRunCount());
        System.out.println("Ignored"+result.getIgnoreCount());
        System.out.println("Timed"+result.getRunTime());
        System.out.println("Failures"+result.getFailureCount());
        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }

        

    }
}
