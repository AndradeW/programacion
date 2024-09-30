package edad;

import Sort.BubbleSort;
import Sort.InsertionSort;
import Sort.SelectionSort;
import Sort.Sorter;
import java.util.Scanner;

public class Edad {

    private static Scanner teclado;
    private static Sorter sorter;

    private static int[] edad;

    public static void registrarEdades() {
        for (int i = 0; i < edad.length; i++) {
            System.out.print("Digite la edad a registrar....");
            edad[i] = teclado.nextInt();
        }
    }

    public static void publicarEdades() {
        for (int i = 0; i < edad.length; i++) {
            System.out.println("Indice: " + i + " Edad: " + edad[i]);
        }
    }

    public static void calcularPromedioEdades() {
        float suma = 0;
        float promedio = 0;
        for (int i = 0; i < edad.length; i++) {
            suma += edad[i];
            promedio = suma / edad.length;

        }
        System.out.println("El promedio es: " + promedio);
    }

    public static void edadMaxima() {
        int max = edad[0];
        for (int i = 0; i < edad.length; i++) {
            if (max < edad[i]) {
                max = edad[i];
            }
        }
        System.out.println("La edad maxima es: " + max);
    }

    public static void edadMinima() {
        int min = edad[0];
        for (int i = 0; i < edad.length; i++) {
            if (min > edad[i]) {
                min = edad[i];
            }
        }
        System.out.println("La edad minima es: " + min);
    }

    public static void main(String[] args) {
        int op = 0;

        teclado = new Scanner(System.in);
        sorter = new Sorter(new InsertionSort());

        edad = new int[10];

        edad[0] = 20;
        edad[1] = 5;
        edad[2] = 7;
        edad[3] = 2;
        edad[4] = 50;
        edad[5] = 15;
        edad[6] = 99;
        edad[7] = 30;
        edad[8] = 1;
        edad[9] = 12;
        do {
            System.out.println("M E N U P R I N C I P A L");
            System.out.println("1. Registrar edades");
            System.out.println("2. Publicar edades");
            System.out.println("3. Calcular promedio de edades");
            System.out.println("4. Identificar edad máxima");
            System.out.println("5. Identificar edad mínima");
            System.out.println("6. Ordenar edades");
            System.out.println("7. Salir");
            System.out.println("Digite su opción....");

            op = teclado.nextInt();
            switch (op) {
                case 1:
                    registrarEdades();
                    break;
                case 2:
                    publicarEdades();
                    break;
                case 3:
                    calcularPromedioEdades();
                    break;
                case 4:
                    edadMaxima();
                    break;
                case 5:
                    edadMinima();
                    break;
                case 6:
                    sorter.sort(edad);
                    break;
                case 7:
                    System.out.println("Ud presionó SALIR....");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (op != 7);
    }
}
