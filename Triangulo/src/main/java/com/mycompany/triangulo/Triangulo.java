package com.mycompany.triangulo;

import java.util.Scanner;

public class Triangulo {

    private static int ladoA;
    private static int ladoB;
    private static int ladoC;

    private static Scanner scanner;

    public static void Triangulo() {
        scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de lado A: ");
        ladoA = scanner.nextInt();

        System.out.println("Ingrese el valor de lado B: ");
        ladoB = scanner.nextInt();

        System.out.println("Ingrese el valor de lado C: ");
        ladoC = scanner.nextInt();
    }

    public static void imprimirLadoMayor() {
        String lado = "lado A";
        int mayor = ladoA;

        if (ladoB > mayor) {
            mayor = ladoB;
            lado = "lado B";
        }
        if (ladoC > mayor) {
            mayor = ladoC;
            lado = "lado C";
        }

        System.out.println("El lado mayor es " + lado + " y mide " + mayor);

    }

    public static void validarEquilatero() {
        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("El tringulo es equilatero");
        } else {
            System.out.println("El triangulo no es equilatero");
        }
    }

    public static void main(String[] args) {
        Triangulo.Triangulo();
        Triangulo.imprimirLadoMayor();
        Triangulo.validarEquilatero();
    }
}
