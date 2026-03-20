package ExceptionExercises;

import java.util.ArrayList;
import java.util.List;

public class ExeptionExercises {

    public static void main(String[] args) {

        // 1. Divide dos números almacenados en dos variables. Maneja la división por cero con try-catch.
        int a = 5;
        int b = 20;
        int c = 0;
        division(b, a);
        division(a, b);
        division(c, a);
        division(a, c);

        // 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el ArrayIndexOutOfBoundsException.
        int[] lista = {0, 0, 0};
        for(int i = 0; i < 3; i++){
            lista[i] = i;
        }
        try{
            int entero = lista[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        
        // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el NullPointerException.
            String prueba = null;
            try {
                System.out.println(prueba.length());
            }catch(NullPointerException e){
                System.out.println(e.getMessage());
            }
        // 4. Escribe una función que transforma texto a número. Usa try-catch para manejar entradas no válidas (NumberFormatException).

        // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o no error.

        // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido es negativo.

        // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50.

        // 8. Crea un programa con varios bloques catch: uno para ArithmeticException, otro para ArrayIndexOutOfBoundsException.

        // 9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta.

        // 10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.
    }

    public static void division(int a, int b){
        try{
            int c = a / b;
            System.out.printf("%d / %d = %d\n", a, b, c);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0.");
        }
    }
}
