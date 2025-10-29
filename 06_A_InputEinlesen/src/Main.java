import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // 1. Create a Scanner object named "userInput".
        //    Ask the user to type in the following information:
        //
        //    - The first name,
        //    - last name,
        //    - age,
        //    - birthday (day)
        //    - birthday (month)
        //    - birthday (year)
        //    - whether the user is a student
        //     -and at least three (or more) questions you want to add.
        //
        //    To make it easier for the user, only ask him one question at a time
        //    In the end, greet the user with his age and let him know about
        //    all the data you have gathered from the user.
        //
        //
        //    It's up to you how you design this little program, but use all
        //    of your knowledge so far. Pay attention to the datatypes.
        //
        //    Challenge:
        //    Also calculate approximately how many days he has lived so far!
        //    To make it easier, lets assume a year has always 365 days and
        //    every month has 30 days. For the month, you can take september (09)
        //    Hint for a possible approximate formula at the bottom of the code.
        //
        //    Possible output:
        //    Thank you for your input, Hansi Meier!
        //    You are 28 years old
        //    You were born in 27.4.1994
        //    Are you a student? true
        //    Your favorite food is: Gnocchi
        //    And so far you have lived approximately ~10370 days!
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your firstname");

        String name = userInput.nextLine();

        System.out.println("Your name is " + name);

        System.out.println("Enter your Lastname");

        String lastname = userInput.nextLine();

        System.out.println("Your Lastname is " + lastname);

        System.out.println("Enter your age");

        String age = userInput.nextLine();

        System.out.println("Your " + age + " Years old");

        System.out.println("When were you born");

        String birthdate = userInput.nextLine();

        System.out.println("You were born " + birthdate );

        System.out.println("What is your favorite Animal?");

        String animal = userInput.nextLine();

        System.out.println(animal + " is your favorite Animal");

        System.out.println("What is your favorite Subject?");

        String subject = userInput.nextLine();

        System.out.println(subject + " is your favorite Subject");

        System.out.println("Do you have any Siblings?");

        String siblings = userInput.nextLine();

        System.out.println("You have " + siblings);

        System.out.println("Great your full name is " + name + lastname
                + " you are " + age + " old "  +
                "that means you were born in " + birthdate +
                " your favorite animal is " + animal +
                " your favorite subject is " + subject +
                " you have " + siblings);








        //--------------------------------------------------------------------------------------------------------------
        // 2. Ask the user to input two numbers.
        //    Print the result of an addition, subtraction, division and
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        int dif = a - b;
        int div = a / b;
        int mult = a * b;
        System.out.println("The sum is: " + sum + " The dif is: " + dif + " The div is: " + div + " The mult is: " + mult);


        //--------------------------------------------------------------------------------------------------------------
        // 3. Ask the user to input his weight and height.
        //    Calculate the body mass index (BMI) and print it to the user
        //    BMI = weight(kg) / height(m)^2
        System.out.print("Enter your weight in kilograms: ");
        double weight = userInput.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = userInput.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);


        //--------------------------------------------------------------------------------------------------------------
        // 4. Ask the user to input a number of minutes.
        //    Convert the minutes to hours and minutes and print it
        //    To test: 126minutes -> 2h and 6min
        System.out.print("Enter the number of minutes: ");
        int totalMinutes = userInput.nextInt();

        int hours = totalMinutes / 60;   // whole hours
        int minutes = totalMinutes % 60;

        System.out.println(totalMinutes + " minutes = " + hours + "h and " + minutes + "min");

        //--------------------------------------------------------------------------------------------------------------
        // 5. Ask the user to input a radius.
        //    Calculate and display its circumference (2 * π * r) and area (π * r^2).

        System.out.print("Enter the radius: ");
        double radius = userInput.nextDouble();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("Area: %.2f%n", area);

        //--------------------------------------------------------------------------------------------------------------
        // 6. Ask the user to input a bill-amount and a tip-amount(percentage)
        //    Calculate the total price.
        //    Example:
        //    Bill: 100.-
        //    Tip in %: 20
        //    Total: 120.-
        System.out.print("Enter the bill amount: ");
        double bill = userInput.nextDouble();

        System.out.print("Enter the tip percentage: ");
        double tipPercent = userInput.nextDouble();

        double tip = bill * (tipPercent / 100);
        double total = bill + tip;

        System.out.printf("Bill: %.2f%n", bill);
        System.out.printf("Tip (%.0f%%): %.2f%n", tipPercent, tip);
        System.out.printf("Total: %.2f%n", total);

        //--------------------------------------------------------------------------------------------------------------
        // 6. Write a program to calculate your monthly and yearly salary
        //    Example:
        //    What's your hourly wage? -> 30
        //    How many hours do you work a week? -> 40
        //    Your monthly wage is: 4800
        //    Your yearly salary is: 57600 excluding the 13th month

        System.out.print("What's your hourly wage? ");
        double hourlyWage = userInput.nextDouble();

        System.out.print("How many hours do you work per week? ");
        double hoursPerWeek = userInput.nextDouble();

        double weeklySalary = hourlyWage * hoursPerWeek;

        double monthlySalary = weeklySalary * 4;

        double yearlySalary = monthlySalary * 12;

        System.out.printf("Your monthly wage is: %.2f%n", monthlySalary);
        System.out.printf("Your yearly salary is: %.2f%n", yearlySalary);

        //--------------------------------------------------------------------------------------------------------------
        // 7. Write a little quiz about your favorite hobby/movie/book/song/game/dance/whatsoever.
        //    Include at least 10 questions. Use a byte to store your result.
        //    Example:
        //    Hello and welcome to my quiz about game development!
        //    Q 01: Which is the most used texture in all games based on an algorithm to generate natural looking textures
        //          terrain and much more?
        //    (User Input): I don't know
        //    It is the perlin noise (texture). If you were correct, write 1, else 0.
        //    (User Input): 0
        //    Q 02: Ok, next question! What is the name of the algorithm commonly used for pathfinding?
        //    (User Input): A-Star
        //    It's the A* or the A-star. If you were correct, write 1, else 0.
        //    (User Input): 1
        //    ....
        //    Q 10: Last question! What does 'LOD' stand for?
        //    (User Input): Don't know
        //    It stands for 'Level Of Detail'. If you were correct, write 1, else 0.
        //    Now im calculating your points....
        //    If you were honest, then you reached a total of n points! Congrats!



        // Make sure you didn't forget to close the scanner :)

        byte score = 0; // Store total points

        System.out.println("Hello and welcome to my quiz about movies!");
        System.out.println("For each question, write 1 if you got it correct, 0 if not.\n");

        // Question 1
        System.out.println("Q01: Which movie features the character 'Darth Vader'?");
        System.out.println("(User Input): ");
        userInput.nextLine(); // Read user's answer (we don't check actual answer here)
        System.out.println("Correct answer: Star Wars. If you were correct, write 1, else 0.");
        score += userInput.nextByte();

        // Question 2
        System.out.println("\nQ02: Who directed the movie 'Inception'?");
        userInput.nextLine(); // Consume leftover newline
        System.out.println("Correct answer: Christopher Nolan. If correct, write 1, else 0.");
        score += userInput.nextByte();

        // Question 3
        System.out.println("\nQ03: What is the name of the hobbit played by Elijah Wood in 'The Lord of the Rings'?");
        userInput.nextLine();
        System.out.println("Correct answer: Frodo. If correct, write 1, else 0.");
        score += userInput.nextByte();

        // Question 4
        System.out.println("\nQ04: Which movie features the song 'My Heart Will Go On'?");
        userInput.nextLine();
        System.out.println("Correct answer: Titanic. If correct, write 1, else 0.");
        score += userInput.nextByte();

        // Question 5
        System.out.println("\nQ05: Who played Jack Sparrow in 'Pirates of the Caribbean'?");
        userInput.nextLine();
        System.out.println("Correct answer: Johnny Depp. If correct, write 1, else 0.");
        score += userInput.nextByte();

        // Question 6
        System.out.println("\nQ06: What movie won the Oscar for Best Picture in 1994?");
        userInput.nextLine();
        System.out.println("Correct answer: Forrest Gump. If correct, write 1, else 0.");
        score += userInput.nextByte();

        // Question 7
        System.out.println("\nQ07: Which superhero is known as 'The Dark Knight'?");
        userInput.nextLine();
        System.out.println("Correct answer: Batman. If correct, write 1, else 0.");
        score += userInput.nextByte();

        // Question 8
        System.out.println("\nQ08: In which movie does the character 'Neo' appear?");
        userInput.nextLine();
        System.out.println("Correct answer: The Matrix. If correct, write 1, else 0.");
        score += userInput.nextByte();

        // Question 9
        System.out.println("\nQ09: What is the highest-grossing animated film of all time?");
        userInput.nextLine();
        System.out.println("Correct answer: The Lion King (2019 remake). If correct, write 1, else 0.");
        score += userInput.nextByte();

        // Question 10
        System.out.println("\nQ10: Which movie franchise features the quote 'I am your father'?");
        userInput.nextLine();
        System.out.println("Correct answer: Star Wars. If correct, write 1, else 0.");
        score += userInput.nextByte();

        // Final result
        System.out.println("\nNow I'm calculating your points...");
        System.out.println("If you were honest, then you reached a total of " + score + " points! Congrats!");

        userInput.close();
    }
    }

// Formula (approximately):
// (currentYear * daysPerYear + currentMonth * daysPerMonth) - (yourYear * daysPerYear + yourMonth * daysPerMonth);
// Example:
// (2024 * 365 + 9 *30) - (yourYear * 365 + yourMonth * 30);