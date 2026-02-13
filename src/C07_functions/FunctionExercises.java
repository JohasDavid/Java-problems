package C07_functions;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionExercises {
    public static void main(String[] args) {

        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
       System.out.println("Problema 1");
       System.out.println("Llamando a la función 1: ");
       funcion1();

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
        System.out.println("Problema 2");
        Saludo("Johas");

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
        System.out.println("Problema 3");
        int a  = 59, b = 45;
        System.out.println(Resta(a, b));


        // 4. Crea un método que calcule el cuadrado de un número (n * n).
        System.out.println("Problema 4");
        a = 567;
        System.out.printf("El cuadrado de %d, es: %d\n", a, Cuadrado(a));

        // 5. Escribe una función que reciba un número y diga si es par o impar.
        System.out.println("Problema 5");
        parImpar(a);

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        System.out.println("Problema 6");
        System.out.println(mayor(45));

        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        System.out.println("Problema 7");
        String nombre = "Johas";
        System.out.printf("%s tiene longitud %d\n",nombre, strlen(nombre));

        //  8. Crea un mtodo que reciba un array de enteros, calcula su media y lo retorna.
        System.out.println("Problema 8");
            int[] array = {1, 2, 3, 4, 5};
        System.out.println(media(array));

        // 9. Escribe un método que reciba un número y retorna su factorial.
        System.out.println("Problema 9");
        int l = 10;
        System.out.println(factorial(l));

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
        System.out.println("Problema 10");
        ArrayList<String> problema10 = new ArrayList<>(Arrays.asList("Johas", "David", "Morales", "Barroso"));
        printArray(problema10);
    }
    public static void funcion1(){
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    public static void Saludo(String nombre){
        System.out.println("Hola "+ nombre);
    }

    public static int Resta(int a, int b){
        return a - b;
    }

    public static int Cuadrado(int a){
        return a * a;
    }

    public static void parImpar(int a){
        System.out.printf("%s\n", a % 2 == 0 ? "par": "impar");
    }

    public static Boolean mayor(int edad){
        if(edad >= 18){
            return true;
        }else{
            return false;
        }
    }

    public static int strlen(String cadena){
        return cadena.length();
    }

    public static double media (int []a){
        int suma = 0;
        for(int b : a){
            suma += b;
        }
        return (double) suma / a.length;
    }

    public static long factorial(int i){

        long factorial = 1;
        for(int k = i; k > 0; k--){
            factorial *= k;
        }
        return factorial;
    }

    public static void printArray(ArrayList<String> array){
        for(String a : array){
            System.out.println(a);
        }
    }
}
