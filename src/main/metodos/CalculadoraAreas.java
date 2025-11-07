package main.metodos;

import java.util.Scanner;

public class CalculadoraAreas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("*******************************");
        System.out.println("*     Calculadora de áreas    *");
        System.out.println("*******************************");
        System.out.println(
                "OPCIONES:\n1. Área del cuadrado\n2. Área del rectángulo\n3. Área del triángulo\n4. Área del círculo\n5. Salir");
        System.out.println("*******************************");
        System.out.println("Seleccione una opción (1-5):");
        int opcion = entrada.nextInt();

        while (opcion < 1 || opcion > 5) {// validar opción
            System.out.println("Opción no válida.");
            System.out.println("Seleccione una opción (1-5):");
            opcion = entrada.nextInt();
        }

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el lado del cuadrado:");
                double lado = entrada.nextDouble();
                float resultadoCuadrado = (float) areaCuadrado(lado);
                System.out.println("El área del cuadrado es: " + resultadoCuadrado);
                break;

            case 2:
                System.out.println("Ingrese la base del rectángulo:");
                double base = entrada.nextDouble();
                System.out.println("Ingrese la altura del rectángulo:");
                double altura = entrada.nextDouble();
                float resultadoRectangulo = (float) areaRectangulo(base, altura);
                System.out.println("El área del rectángulo es: " + resultadoRectangulo);
                break;

            case 3:
                System.out.println("Ingrese la base del triángulo:");
                double baseTriangulo = entrada.nextDouble();
                System.out.println("Ingrese la altura del triángulo:");
                double alturaTriangulo = entrada.nextDouble();
                float resultadoTriangulo = (float) areaTriangulo(baseTriangulo, alturaTriangulo);
                System.out.println("El área del triángulo es: " + resultadoTriangulo);
                break;

            case 4:
                System.out.println("Ingrese el radio del círculo:");
                double radio = entrada.nextDouble();
                float resultadoCirculo = (float) areaCirculo(radio);
                System.out.println("El área del círculo es: " + resultadoCirculo);

                break;

            case 5:
                System.out.println("Saliendo de la calculadora de áreas.");
                break;

        }// fin switch
        entrada.close();
    }// fin de main

    public static double areaCuadrado(double lado) {
        return lado * lado;
    }

    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

}// fin de la clase
