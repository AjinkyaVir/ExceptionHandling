package com.company.error;

public class Test {

    public static void main(String[] args) {

        /* Error are caused duo to system resource */

        int[] a = new int[1000000000]; //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
    }

}
