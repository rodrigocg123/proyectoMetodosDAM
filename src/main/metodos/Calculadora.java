package main.metodos;

import java.util.Scanner;

/**
 * Calculadora de operaciones básicas.
 * Permite realizar suma, resta, multiplicación, división y módulo entre dos
 * números enteros.
 * Incluye menú interactivo para seleccionar la operación.
 *
 * @author rodrigocg123
 * @version 1.0
 */
public class Calculadora {
    /**
     * Método principal que ejecuta el menú de la calculadora y gestiona la entrada
     * del usuario. Presenta un menú interactivo con las siguientes opciones:
     * <ul>
     * <li>1. Sumar</li>
     * <li>2. Restar</li>
     * <li>3. Multiplicar</li>
     * <li>4. Dividir</li>
     * <li>5. Módulo</li>
     * <li>6. Salir</li>
     * </ul>
     * El programa valida las entradas y maneja casos especiales como la división
     * por cero.
     *
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("-------------------------------------------");
        System.out.println("Calculadora de operaciones básicas");
        System.out.println("-------------------------------------------");
        System.out.println(
                "Menu de operaciones:\n 1. Sumar\n 2. Restar\n 3. Multiplicar\n 4. Dividir\n 5. Módulo\n 6. Salir");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("Seleccione una operación (1-5):");
        System.out.println("-------------------------------------------");
        int opcion = entrada.nextInt();

        while (opcion < 1 || opcion > 6) {// validar opción
            System.out.println("Opción no válida.");
            System.out.println("Seleccione una operación (1-5):");
            opcion = entrada.nextInt();
        }
        if (opcion == 6) {// salir de la calculadora
            System.out.println("Saliendo de la calculadora.");
            entrada.close();
            return;
        }

        System.out.println("Ingrese el primer número:");
        int numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número:");
        int numero2 = entrada.nextInt();

        do {
            switch (opcion) {
                case 1:
                    int resultadoSuma = sumar(numero1, numero2);
                    System.out.println("La suma de " + numero1 + " + " + numero2 + " es: " + resultadoSuma);
                    return;
                case 2:
                    int resultadoResta = restar(numero1, numero2);
                    System.out.println("La resta de " + numero1 + " - " + numero2 + " es: " + resultadoResta);
                    return;

                case 3:
                    int resultadoMultiplicacion = multiplicar(numero1, numero2);
                    System.out.println(
                            "La multiplicación de " + numero1 + " X " + numero2 + " es: " + resultadoMultiplicacion);

                    return;

                case 4:
                    if (numero2 == 0) {
                        System.out
                                .println(
                                        "Error: División por cero no permitida. Por favor, ingrese un divisor distinto de cero.");
                        System.out.println("Ingrese el segundo número:");
                        numero2 = entrada.nextInt();
                    }
                    float resultadoDividir = dividir(numero1, numero2);
                    System.out.println("La división entre " + numero1 + " / " + numero2 + " es: " + resultadoDividir);
                    return;
                case 5:
                    int resultadoModulo = modulo(numero1, numero2);
                    System.out.println("El módulo de " + numero1 + " % " + numero2 + " es: " + resultadoModulo);
                    return;

                default:
                    break;

            }
        } while (opcion > 1 && opcion < 5);

        entrada.close();
    }

    /**
     * Realiza la suma de dos números enteros.
     *
     * @param num1 Primer sumando.
     * @param num2 Segundo sumando.
     * @return La suma de num1 y num2.
     */
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Realiza la resta de dos números enteros.
     *
     * @param num1 Minuendo.
     * @param num2 Sustraendo.
     * @return La diferencia entre num1 y num2.
     */
    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Realiza la multiplicación de dos números enteros.
     *
     * @param num1 Primer factor.
     * @param num2 Segundo factor.
     * @return El producto de num1 y num2.
     */
    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Realiza la división de dos números enteros.
     * Si el divisor es cero, muestra un mensaje de error y retorna 0.
     * En una implementación más robusta, se debería lanzar una excepción.
     *
     * @param num1 Dividendo.
     * @param num2 Divisor.
     * @return El cociente de num1 entre num2, o 0 si el divisor es cero.
     * @throws ArithmeticException (potencialmente en una implementación futura) si
     *                             el divisor es cero
     */
    public static float dividir(float num1, float num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: División por cero.");
            return 0; // o lanzar una excepción
        }
    }

    /**
     * Calcula el módulo (resto) de la división entre dos números enteros.
     * Utiliza el operador % para calcular el resto de la división.
     * Nota: Si el divisor es cero, se producirá una ArithmeticException.
     *
     * @param num1 Dividendo.
     * @param num2 Divisor.
     * @return El resto de num1 dividido entre num2.
     * @throws ArithmeticException si el divisor es cero
     */
    public static int modulo(int num1, int num2) {
        return num1 % num2;
    }

}
