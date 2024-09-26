package com.mycompany.empleado;

import java.util.Scanner;

public class Empleado {

    private static String name;
    private static int salary;

    private static Scanner scanner;

    public static void Empleado() {
        scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre:");
        name = scanner.next();

        System.out.println("Ingrese el sueldo:");
        salary = scanner.nextInt();
    }

    private static void imprimirDatos() {
        System.out.println("El nombre es: " + name);
        System.out.println("El sueldo es: " + salary);
    }

    private static void pagaImpuestos() {
        if (salary >= 3000) {
            System.out.println("Debe pagar impuesto");
        } else {
            System.out.println("No debe pagar impuesto");
        }
    }

    public static void main(String[] args) {
        Empleado.Empleado();
        Empleado.imprimirDatos();
        Empleado.pagaImpuestos();
    }
}
