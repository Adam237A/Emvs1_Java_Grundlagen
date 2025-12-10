import com.berufsfachschule.temperature.Temperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Temperature temp = new Temperature();
        System.out.println("Temp: " + temp.temperatureCelsius);

        temp.temperatureCelsius = 18.32;
        System.out.println("New temp: " + temp.temperatureCelsius);

        Temperature temp2 = new Temperature(56);
        System.out.println("Temp2: " + temp2.temperatureCelsius);

        System.out.print("enter temp: ");
        Temperature temp3 = new Temperature(sc.nextDouble());

        temp.printCelsius();
        temp2.printCelsius();
        temp3.printCelsius();

        temp3.printHotOrColdCelsius();

        System.out.println("fahrenheti: " + temp3.calculateCelsiusToFahrenheit());
        System.out.println("kevin: " + temp3.calculateCelsiusToKelvin());

        sc.close();
    }
}