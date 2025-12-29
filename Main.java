
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("\n--- Unit Converter Menu ---");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Kilometers to Miles");
            System.out.println("4. Miles to Kilometers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        convertCelsiusToFahrenheit(scanner);
                        break;
                    case 2:
                        convertFahrenheitToCelsius(scanner);
                        break;
                    case 3:
                        convertKilometersToMiles(scanner);
                        break;
                    case 4:
                        convertMilesToKilometers(scanner);
                        break;
                    case 5:
                        System.out.println("Exiting. Goodbye!");
                        scanner.close();
                        return; // Exit the main method
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input from the scanner
            }
        }
    }

    public static void convertCelsiusToFahrenheit(Scanner scanner) {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
    }

    public static void convertFahrenheitToCelsius(Scanner scanner) {
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
    }

    public static void convertKilometersToMiles(Scanner scanner) {
        System.out.print("Enter distance in Kilometers: ");
        double kilometers = scanner.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println(kilometers + " km is equal to " + miles + " miles");
    }

    public static void convertMilesToKilometers(Scanner scanner) {
        System.out.print("Enter distance in Miles: ");
        double miles = scanner.nextDouble();
        double kilometers = miles / 0.621371;
        System.out.println(miles + " miles is equal to " + kilometers + " km");
    }
}
