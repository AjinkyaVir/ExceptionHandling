package com.company.uncheckedexception;

public class Test {

    public static void main(String[] args) {

        /* Exception Handling
        *
        * Exception which are not checked by the compiler is call Unchecked Exception.
        *
        *  */

        System.out.println("Exception Handling : Unchecked Exception");
        //System.out.println(10/0); // Exception in thread "main" java.lang.ArithmeticException: / by zero


        int[] a = {10,20,30};
         System.out.println(a[6]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:

        System.out.println("Ajinkya".charAt(12));
        // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 12

        Integer integer = Integer.valueOf("ten");
        // Exception in thread "main" java.lang.NumberFormatException: For input string: "ten"

        System.out.println("Rest of the app");

    }

}
