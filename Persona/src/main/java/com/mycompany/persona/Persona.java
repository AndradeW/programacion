package com.mycompany.persona;

import java.util.Scanner;

public class Persona {

    private static String name;
    private static int age;

    private static Scanner scanner;

    public static void Persona() {
        scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre:");
        name = scanner.next();

        System.out.println("Ingrese la edad:");
        age = scanner.nextInt();
    }

    private static void imprimir() {
        System.out.println("El nombre es: " + name);
        System.out.println("La edad es: " + age);
    }

    private static void esMayorEdad() {
        if (age >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

    public static void main(String[] args) {
        Persona.Persona();
        Persona.imprimir();
        Persona.esMayorEdad();
    }
}
