package com.mycompany.labprograexamen;

import java.util.Scanner;

/**
 *
 * @author Eric Rodriguez
 */
public class Labprograexamen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        // Menú
        do {
            System.out.println("Menu:");
            System.out.println("1. Piramide");
            System.out.println("2. El Mayor");
            System.out.println("3. Calculacion");
            System.out.println("4. Caracteres Vocales");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    // Piramide
                    int numerofilas = 10;
                    for (int i = 1, numeroo = 1; i <= numerofilas; i++) {
                        int suma = 0;
                        System.out.print(numeroo);
                        suma += numeroo;
                        for (int j = 1; j < i; j++) {
                            numeroo += 2;
                            System.out.print(" " + numeroo);
                            suma += numeroo;
                        }
                        System.out.println(" = " + suma);
                    }
                }
                case 2 -> {
                    // El Mayor
                    int numerito, numeroMasGrande = 0, sumaTotal = 0, cantidadNumeros = 0;

                    System.out.println("Ingrese numeros y cuando ya no quiera diga (No)");

                    while (true) {
                        System.out.print("Favor ingrese un numero: ");
                        String terminar = sc.nextLine();
                        if (terminar.equalsIgnoreCase("No")) {
                            break;
                        }
                        numerito = Integer.parseInt(terminar);
                        sumaTotal += numerito;
                        cantidadNumeros++;
                        if (numerito > numeroMasGrande) {
                            numeroMasGrande = numerito;
                        }
                    }

                    double promedio = (double) sumaTotal / cantidadNumeros;
                    System.out.println("El numero mayr que ingreso: " + numeroMasGrande);
                    System.out.println("El promedio de todos los numeros ingresados es: " + promedio);
                }
                case 3 -> {
                    // Calculacion
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombrecliente = sc.nextLine();

                    int canalnormal = 0, canalHD = 0;
                    double subtotal = 0;

                    String tipodecanal;
                    do {
                        System.out.print("Ingrese el tipo de canal HD o NORM: ");
                        tipodecanal = sc.nextLine().toUpperCase();
                        if (tipodecanal.equals("HD")) {
                            canalHD++;
                        } else if (tipodecanal.equals("NORMAL")) {
                            canalnormal++;
                        } else {
                            System.out.println("Tipo de canal inválido.");
                            continue;
                        }
                        subtotal += (tipodecanal.equals("HD") ? 30 : 20);

                        System.out.print("¿Desea ingresar otro canal? Si o no: ");
                    } while (sc.nextLine().equalsIgnoreCase("SI"));

                    System.out.print("Ingrese el tipo de caja digital (LIGHTBOX, HDBOX, DVRBOX): ");
                    String tipoCaja = sc.nextLine().toUpperCase();
                    subtotal += (tipoCaja.equals("LIGHTBOX") ? 50 : (tipoCaja.equals("HDBOX") ? 100 : 150));

                    double impuesto = subtotal * 0.15;
                    double total = subtotal + impuesto;

                    System.out.println("\nDetalle de la cuenta:");
                    System.out.println("Canales NORMALES: " + canalnormal);
                    System.out.println("Canales HD: " + canalHD);
                    System.out.println("Subtotal: Lps " + subtotal);
                    System.out.println("Impuesto (15%): Lps " + impuesto);
                    System.out.println("Total a pagar: Lps " + total);
                }
                case 4 -> {
                    // Caracteres Vocales
                    System.out.print("Ingrese una cadena: ");
                    String cadena = sc.nextLine();

                    int contadorvocales = 0;

                    for (int i = 0; i < cadena.length(); i++) {
                        char caracter = cadena.charAt(i);
                        switch (caracter) {
                            case 'a', 'e', 'i', 'o', 'u' -> contadorvocales++;
                        }
                    }

                    System.out.println("La cadena tiene " + contadorvocales + " vocales.");
                }
                case 5 -> System.out.println("Hasta Luego");
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
