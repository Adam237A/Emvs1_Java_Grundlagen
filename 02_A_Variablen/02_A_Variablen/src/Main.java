public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // Naming

        // Which are valid variable names and which are not?
        // Try to determine what is valid and what is not without uncommenting the code.
        // If something is not valid, write a comment explaining why it is not valid.

        // Example:
        // int myVariable; // Valid
        // int %myVariable; // Not Valid, starts with a special character.


        // int 1stNumber;

        // int firstNumber;

        // int tryThisNumber;

        // int _myNumber;

        // int int;

        // int _number_;

        // int i;

        // int number1;

        // int .product;

        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Naming convention

        // Which are recommended variable names and which are not?

        // Example:
        // int myVariable; // recommended
        // int _myVariable; // not recommended, starts with a special character
        // int g; // not recommended, depending on the context, it can make sense. E.g. in the context of gravitational acceleration

        int number1; //recommended
        int speed;//recommended
        int JustANUmber;// not recommended should start with an lowercase J
        int justAnotherNumber;// recommended
        int _weather;//not recommended should start with a letter
        int _Id;//not recommended should start with a letter
        int $Money;//not recommended starts with dollar sign instead of letter
        int moneyinthebankaccount;//not recommended should follow the lower camel case with multiple words
        int aLotOfmoneyonbankAccount;//recommended
        int circumstanceEarthInKM;//recommended
        int circumstanceEarth_KM;//recomended

        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Declaration and initialization of variables

        // Add the appropriate data type before the variable name, so, that it becomes a valid declaration and initialization.
        // (Variable names are in german to not reveal the result)

        float meineGleitkommaZahl = 23.5f;

        byte meineSehrKleineGanzzahl = 50;

        char meinUnicodeZeichen = '\u003D';

        short meineKleineGanzzahl = 200;

        char meinBuchstabe = 'B';

        float meineNegativeGleitkommaZahl = -14.612f;

        double meineGrosseGleitkommaZahl = 50.1234567890123d;

        boolean meinWahrheitswert1 = false;

        int meineNormaleGanzzahl = 50_000;

        long meineGrosseGanzzahl = 123_456_789_012_345L;

         boolean meinWahrheitswert2 = true;


        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Keyword final

        // Based on the variable name/value, decide if the keyword "final" is suitable or not.
        // If it is suitable, apply the recommended naming convention for variables with the "final" keyword.
        // Write -why- you decided to either mark it as final or not.

//
        int monyInBankAccount = 100_000; //Money in the Bank account can change

       final short myBirthyear = 2001;// u cannot change your birthyear

        byte amountOfMonths = 12;// the amount of months can change depends on how u write it

        float gravityForce = 9.81f;// cannot change gravityforce

        final byte amountOfMinutesPerHour = 60; //in an hour there is 60 min

       final short amountOfSecondsPerHour = 3600;// in an hour there are 3600 sec

        float pi = 3.14159f;//the number of pi is infinite

       final short amountOfStudents = 167;// wont change unless new student

        //--------------------------------------------------------------------------------------------------------------
    }
}