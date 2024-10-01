package com.mycompany.edad;

import com.mycompany.Sort.BubbleSort;
import com.mycompany.Sort.InsertionSort;
import com.mycompany.Sort.SelectionSort;
import com.mycompany.Sort.SortStrategy;
import com.mycompany.Sort.Sorter;
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

        System.out.println("Ingrese la opción del algoritmo a usar: ");
        System.out.println("1. Burbuja");
        System.out.println("2. Seleccion");
        System.out.println("3. Insercion");
        int op = teclado.nextInt();

        SortStrategy s;

        switch (op) {
            case 2 -> {
                s = new SelectionSort();
            }
            case 3 -> {
                s = new InsertionSort();
            }
            default -> {
                s = new BubbleSort();
            }
        }

        System.out.println("Se usará " + s.getClass().getSimpleName());
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

        Edad.edad = new int[10];

        teclado = new Scanner(System.in);

        do {
            System.out.println("\n\tM E N U P R I N C I P A L");
            System.out.println("1. Registrar edades");
            System.out.println("2. Publicar edades");
            System.out.println("3. Calcular promedio de edades");
            System.out.println("4. Identificar edad máxima");
            System.out.println("5. Identificar edad mínima");
            System.out.println("6. Ordenar edades");
            System.out.println("7. Buscar edad");
            System.out.println("8. Salir");
            System.out.println("Digite su opción...");

            op = teclado.nextInt();
            switch (op) {
                case 1 ->
                    Edad.registrarEdades();
                case 2 ->
                    Edad.publicarEdades();
                case 3 ->
                    Edad.calcularPromedioEdades();
                case 4 ->
                    Edad.edadMaxima();
                case 5 ->
                    Edad.edadMinima();
                case 6 ->
                    Edad.ordenarEdades();
                case 7 -> {
                    System.out.println("Ingrese la edad a buscar: ");
                    Edad.buscarEdad(teclado.nextInt());
                }
                case 8 ->
                    System.out.println("Ud presionó SALIR....");
                default ->
                    System.out.println("Opción no válida");
            }
        } while (op != 8);
    }
}
