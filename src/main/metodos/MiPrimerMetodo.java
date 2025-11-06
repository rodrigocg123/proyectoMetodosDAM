package main.metodos;

public class MiPrimerMetodo {

    public static void main(String[] args) {

        saludar();//llama a saludar

        int resultadoSuma = sumar(5, 10);//llama a sumar
        System.out.println("La suma es: " + resultadoSuma);

        int resultadoResta = restar(10, 5);
        System.out.println("La resta es: " + resultadoResta);

        int resultadoMultiplicacion = multiplicar(4, 3);
        System.out.println("La multiplicación es: " + resultadoMultiplicacion);

        int resultadoDivision = dividir(20, 4);
        System.out.println("La división es: " + resultadoDivision);

        int resultadoModulo = modulo(20, 6);
        System.out.println("El módulo es: " + resultadoModulo);
        
    }//fin de main

    public static void saludar() {
        System.out.println("¡Hola! Bienvenido a mi primer método en Java.");
    }//fin de saludar

    
    public static int sumar(int num1, int num2) { //declaro sumar
        return num1 + num2;
    }//fin de sumar

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }//fin de restar

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }//fin de multiplicar

    public static int dividir(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: División por cero.");
            return 0; // o lanzar una excepción
        }
    }//fin de dividir

    public static int modulo(int num1, int num2) {
        return num1 % num2;
    }//fin de modulo

}//fin de la clase