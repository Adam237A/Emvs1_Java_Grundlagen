public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // 1. Declare variables for all primitive data types except boolean. Initialize them with appropriate values.
        // Perform type casting operations as follows:
        //      a. Start with the smallest range data type.
        //      b. Cast this type to every other type with a larger range.
        //      c. Repeat this process for each data type, always casting to types with larger ranges.
        // For each casting operation:
        //      If the cast is valid (widening conversion), perform the operation.
        //      If the cast is invalid or requires an explicit cast (narrowing conversion), write the code but comment it out.


        byte a=10;
        short b=100;
        char c= 65;
        int d=1000;
        long e=10000L;
        float f = 10.5f;
        double g = 20.99;

        // byte casting
        b = a;
        c = (char) a;
        d=a;
        e=a;
        g=a;
        f=a;

        a=(byte) b;
        c=(char) b;
        d=b;
        e=b;
        f=b;
        g=b;

        a=(byte) c;
        b=(short) c;
        d=c;
        e=c;
        f=c;
        g=c;

        a=(byte) d;
        b=(short) d;
        c=(char) d;
        e=d;
        f=d;
        g=d;

        a=(byte) e;
        b=(short) e;
        c=(char) e;
        d=(int) e;
        f=e;
        g=e;

        a=(byte) f;
        b=(short) f;
        c=(char) f;
        d=(int) f;
        e=(long) f;
        g=f;

        a=(byte) g;
        b=(short) g;
        c=(char) g;
        d=(int) g;
        e=(long) g;
        f=(float) g;
        System.out.println(a);


















        //--------------------------------------------------------------------------------------------------------------
        // 2. Now create a long with the value = 1234567890.
        //    Manually cast the long to an int and print it out

         long j=1_234_567_890L;

        int myInt = (int) j;

        System.out.println(myInt);


        //--------------------------------------------------------------------------------------------------------------
        // 3. Try to guess what the following code is doing:

        String myNumber = "33";
        int intNumber = 10;

        myNumber += intNumber;

        // Try to guess first what happens, then test it. // im guessing he's trying to add them together
        System.out.println(myNumber);

        // Can you explain what is happening?
        // instead of adding them together they stuck to eachother and became 3310 im guessing its beacuse 33 is a string instead of a variable


        //--------------------------------------------------------------------------------------------------------------
        // 4. Below is a line commented out, because it is throwing an error.
        //    What is the error and why does it happen?
        //    Try to figure out, how you could convert a String-value to an int.
        //    PS: You need to look it up in the internet.
        //    You might want to try following search term: "java string to int"
        //    Check with the System.out.println if you are actually printing an int


        //String houseNumberInString = "52";
        // int houseNumber = houseNumberInString;
        // System.out.println(houseNumber);

        //--------------------------------------------------------------------------------------------------------------
        // 5. Write down what could go wrong with your solution above

        String houseNumberInString = "52";

        // Convert String to int
        int houseNumber = Integer.parseInt(houseNumberInString);

        // Print it
        System.out.println(houseNumber);

        //Java does not allow assigning a String directly to an int
        //errors could be invalid string format, out of range or a null value

    }
}