package calculator;

import java.util.Scanner;

public class Main {

    private static double a;
    private static double b;

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            calculator.printMenu();

            try {
                option = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Opción inválida. Por favor, ingrese un número entero.");
                continue;
            }

            if (option == 5) {
                System.out.println("Saliendo de la aplicación...");
                break;
            }

            if (option > 4 || option < 1) {
                System.out.println("Opción inválida. Por favor, elija una opción entre 1 y 5.");
                continue;
            }

            try {
                scanValues(scanner);

                double result = 0;

                switch (option) {
                    case 1:
                        result = calculator.sum(a, b);
                        break;
                    case 2:
                        result = calculator.sub(a, b);
                        break;
                    case 3:
                        result = calculator.multi(a, b);
                        break;
                    case 4:
                        result = calculator.div(a, b);
                        break;
                }

                System.out.println("El resultado de la " + calculator.getOperationName(option) + " entre " + a + " y " + b + " es: " + result);

            } catch (Exception e) {
                System.err.println("Error: " + e);
            }

        } while (true);

        scanner.close();
    }

    public static void scanValues(Scanner scanner) throws Exception {

        try {
            System.out.println("Introduzca el primer valor: ");
            a = scanner.nextDouble();

            System.out.println("Introduzca el segundo valor: ");
            b = scanner.nextDouble();

        } catch (Exception e) {

            throw new Exception("Ingrese valores correctamente (números válidos)");
        }
    }
}