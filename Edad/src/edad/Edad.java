package edad;

import Sort.BubbleSort;
import Sort.InsertionSort;
import Sort.SelectionSort;
import Sort.SortStrategy;
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

    public static void ordenarEdades() {

        teclado = new Scanner(System.in);

        System.out.println("Ingrese la opci�n del algoritmo a usar: ");
        System.out.println("1. Burbuja");
        System.out.println("2. Seleccion");
        System.out.println("3. Insercion");
        int op = teclado.nextInt();

        SortStrategy s;

        switch (op) {
            case 2:
                s = new SelectionSort();
                System.out.println("Se usar� Seleccion");
                break;
            case 3:
                s = new InsertionSort();
                System.out.println("Se usar� Insercion");
                break;
            default:
                s = new BubbleSort();
                System.out.println("Se usar� Burbuja");
                break;
        }

        sorter = new Sorter(s);
        sorter.sort(edad);
    }

    public static void buscarEdad(int edadABuscar) {
        boolean encontrado = false;

        for (int i = 0; i < edad.length; i++) {
            if (edad[i] == edadABuscar) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Encontrado");
        } else {
            System.out.println("No encontrado");
        }
    }

    public static void main(String[] args) {
        int op = 0;

        teclado = new Scanner(System.in);

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
            System.out.println("4. Identificar edad m�xima");
            System.out.println("5. Identificar edad m�nima");
            System.out.println("6. Ordenar edades");
            System.out.println("7. Buscar edad");
            System.out.println("8. Salir");
            System.out.println("Digite su opci�n...");

            op = teclado.nextInt();
            switch (op) {
                case 1:
                    Edad.registrarEdades();
                    break;
                case 2:
                    Edad.publicarEdades();
                    break;
                case 3:
                    Edad.calcularPromedioEdades();
                    break;
                case 4:
                    Edad.edadMaxima();
                    break;
                case 5:
                    Edad.edadMinima();
                    break;
                case 6:
                    Edad.ordenarEdades();
                    break;
                case 7:
                    System.out.println("Ingrese la edad a buscar: ");
                    Edad.buscarEdad(teclado.nextInt());
                    break;
                case 8:
                    System.out.println("Ud presion� SALIR....");
                    break;
                default:
                    System.out.println("Opci�n no v�lida");
            }
        } while (op != 8);
    }
}
