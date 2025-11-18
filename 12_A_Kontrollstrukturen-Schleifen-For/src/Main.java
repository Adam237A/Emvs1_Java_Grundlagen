public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Solve the following exercises __only__ with for-loops
        // Exercise 01-05 are similar to the while-exercises, just with a for instead of a while-loop.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Consider the following code:
        //      Do not run this code immediately!
        //
        //      for (int iteratorEx1 = 0; iteratorEx1 < 10; ) {
        //          System.out.println("iteratorEx1:" + iteratorEx1 + " ");
        //      }
        //
        //      Questions to consider:
        //      1. What would happen if you ran this code as is?
        //      2. Why does this behavior occur?
        //      3. How can you modify the code to achieve the desired output:
        //         i:0 i:1 i:2 i:3 i:4 i:5 i:6 i:7 i:8 i:9
        // 1.Running this code as is would create an infinite loop printing "iteratorEx1:0" repeatedly.
        // 2.This behavior occurs because the increment expression in the for loop is empty, so the variable iteratorEx1 never increases and remains stuck at 0.
        // 3.You can modify the code by adding iteratorEx1++ in the increment section of the for loop to achieve the desired output.

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Using for loops, print each task and its numbers to the console (all numbers inclusive):
        //      02-01. 0 to 100
        //      02-02. 42 to 100
        //      02-03. 42 to 123
        //      02-04. Even numbers (0, 2, 4, ...) from 0 to 10
        //      02-05. Odd numbers (1, 3, 5, ...) from 0 to 10
        //      02-06. -10 to 20
        //      02-07. 35 to 0 (descending)
        //      02-08. 15 to -20 (descending)
        //      02-09. Even numbers from 10 to -10 (descending)
        //      02-10. Odd numbers from 10 to -10 (descending)
        System.out.println("Exercise 02");
// 02. Using for loops, print each task and its numbers to the console (all numbers inclusive):

// 02-01. 0 to 100
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

// 02-02. 42 to 100
        for (int i = 42; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

// 02-03. 42 to 123
        for (int i = 42; i <= 123; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

// 02-04. Even numbers (0, 2, 4, ...) from 0 to 10
        for (int i = 0; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

// 02-05. Odd numbers (1, 3, 5, ...) from 0 to 10
        for (int i = 1; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

// 02-06. -10 to 20
        for (int i = -10; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

// 02-07. 35 to 0 (descending)
        for (int i = 35; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

// 02-08. 15 to -20 (descending)
        for (int i = 15; i >= -20; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

// 02-09. Even numbers from 10 to -10 (descending)
        for (int i = 10; i >= -10; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

// 02-10. Odd numbers from 10 to -10 (descending)
        for (int i = 9; i >= -9; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03.  Calculate the sum of all numbers from 0-100 (both inclusive). Print it to the console.

        int forSum_03 = 0;

        // Your code here
        for (int i = 0; i <= 100; i++) {
            forSum_03 += i;
        }
        System.out.println(forSum_03); // Should be 5050

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Calculate the sum of all even numbers from 0-100 (both inclusive). Print it to the console.

        int forSum_04 = 0;

        // Your code here
        for (int i = 0; i <= 100; i += 2) {
            forSum_04 += i;
        }

        System.out.println(forSum_04); // Should be 2550

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Calculate the sum of all odd numbers from 0-100 (both inclusive). Print it to the console.

        int forSum_05 = 0;

        // Your code here
        for (int i = 1; i <= 100; i += 2) {
            forSum_05 += i;
        }


        System.out.println(forSum_05); // Should be 2500

    }
}