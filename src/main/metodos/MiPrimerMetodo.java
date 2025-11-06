package main.metodos;

public class MiPrimerMetodo {

    public static void main(String[] args) {
        
        saludar();//llama a saludar
        
        int resultado = sumar(5, 10);//llama a sumar
        System.out.println("La suma es: " + resultado);
    }//fin de main

    public static void saludar() {
        System.out.println("¡Hola! Bienvenido a mi primer método en Java.");
    }//fin de saludar

    
    public static int sumar(int num1, int num2) { //declaro sumar
        return num1 + num2;
    }//fin de sumar

}//fin de la clase