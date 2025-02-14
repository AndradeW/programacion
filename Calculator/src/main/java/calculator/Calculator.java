package calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private static final Map<Integer, String> operations = new HashMap<>();

    static {
        operations.put(1, "Suma");
        operations.put(2, "Resta");
        operations.put(3, "Multiplicación");
        operations.put(4, "División");
    }

    public Calculator() {
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double multi(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division por cero");
        }
        return a / b;
    }

    void printMenu() {
        System.out.println("---------------------------------------------");
        System.out.println("M E N U  P R I N C I P A L ");

        System.out.println("Seleccione una opcion para realizar la operacion ");

        operations.forEach((key, value) -> System.out.println(key + ". " + value));

        System.out.println("5. Salir");
    }

    public String getOperationName(int option) {
        return operations.get(option);
    }
}
