package com.berufsfachschule.temperature;

public class Temperature {
    public double temperatureCelsius;

    public Temperature() {
        this.temperatureCelsius = 16.0;
    }

    public Temperature(double temp) {
        this.temperatureCelsius = temp;
    }

    public void printCelsius() {
        System.out.println(temperatureCelsius + "° Celsius");
    }

    public void printHotOrColdCelsius() {
        if (temperatureCelsius > 24) {
            System.out.println("It's hot: " + temperatureCelsius + "° Celsius!");
        } else {
            System.out.println("It's freezing: " + temperatureCelsius + "° Celsius!");
        }
    }

    public double calculateCelsiusToFahrenheit() {
        return (temperatureCelsius * 9/5) + 32;
    }

    public double calculateCelsiusToKelvin() {
        return temperatureCelsius + 273.15;
    }
}