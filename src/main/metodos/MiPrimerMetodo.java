package main.metodos;

/**
 * Ejemplo básico de métodos en Java.
 * Incluye un método para saludar y otro para sumar dos números enteros.
 *
 * @author rodrigocg123
 * @version 1.0
 */
public class MiPrimerMetodo {

    /**
     * Método principal que ejecuta el ejemplo de métodos.
     * Llama a saludar() y sumar().
     *
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {

        saludar();//llama a saludar

        int resultadoSuma = sumar(5, 10);//llama a sumar
        System.out.println("La suma es: " + resultadoSuma);


    }//fin de main

    /**
     * Muestra un mensaje de bienvenida por consola.
     */
    public static void saludar() {
        System.out.println("¡Hola! Bienvenido a mi primer método en Java.");
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

    
}//fin de la clase