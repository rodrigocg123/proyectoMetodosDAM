package main.metodos;

import java.util.Scanner;

/**
 * Calculadora de áreas para formas geométricas básicas.
 *
 * <p>
 * Esta clase proporciona un programa ejecutable (método {@code main}) que muestra
 * un menú por consola para calcular áreas de:
 * <ul>
 *   <li>Cuadrado</li>
 *   <li>Rectángulo</li>
 *   <li>Triángulo</li>
 *   <li>Círculo</li>
 * </ul>
 * </p>
 *
 * <p>
 * Cada operación tiene su propio método estático que realiza el cálculo y devuelve
 * el resultado como {@code double}. El programa valida la opción seleccionada y
 * solicita los datos necesarios por consola.
 * </p>
 *
 * <h3>Ejemplo de uso</h3>
 * <pre>
 * java main.metodos.CalculadoraAreas
 * </pre>
 *
 * @author rodrigocg123
 * @version 1.0
 * @since 1.0
 */
public class CalculadoraAreas {
    /**
     * Punto de entrada del programa.
     *
     * <p>
     * Muestra un menú con las opciones disponibles y solicita al usuario la opción
     * deseada (1-5). Si la opción es válida, solicita los parámetros necesarios
     * (por ejemplo, base, altura o radio), calcula el área usando los métodos
     * correspondientes y muestra el resultado por consola. La opción 5 finaliza
     * la ejecución del programa.
     * </p>
     *
     * <p>
     * El método realiza una validación básica de la opción (comprueba que esté
     * entre 1 y 5). No se realiza validación adicional de valores numéricos
     * (por ejemplo, que sean positivos); se asume que el usuario introduce valores
     * coherentes para el cálculo del área.
     * </p>
     *
     * @param args Parámetros de línea de comandos (no utilizados).
     */
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

    /**
     * Calcula el área de un cuadrado.
     *
     * @param lado Longitud del lado del cuadrado. Se espera un valor en las mismas unidades
     *             que se desea obtener en el resultado.
     * @return El área del cuadrado (lado * lado).
     * @since 1.0
     */
    public static double areaCuadrado(double lado) {
        return lado * lado;
    }

    /**
     * Calcula el área de un rectángulo.
     *
     * @param base   Longitud de la base del rectángulo.
     * @param altura Altura del rectángulo.
     * @return El área del rectángulo (base * altura).
     * @since 1.0
     */
    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    /**
     * Calcula el área de un triángulo.
     *
     * @param base   Longitud de la base del triángulo.
     * @param altura Altura del triángulo.
     * @return El área del triángulo ((base * altura) / 2).
     * @since 1.0
     */
    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    /**
     * Calcula el área de un círculo.
     *
     * @param radio Radio del círculo.
     * @return El área del círculo (π * radio^2). Se utiliza {@link Math#PI} como
     *         valor de π.
     * @since 1.0
     */
    public static double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

}// fin de la clase
