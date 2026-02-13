package C05_structures;

import java.util.Scanner;

public class ConditionalsExercises {
    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int edad = 20;
        if (edad >= 18) {
            System.out.println("Puedes votar");
        } else {
            System.out.println("No puedes votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int a = 3;
        int b = 4;
        if(b > a){
            System.out.println(b + " es mayor");
        } else if (a > b) {
            System.out.println(a + " es mayor");
        } else{
            System.out.println("Los números son iguales");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int c = 5;
        if (c > 0) {
            System.out.println("c es positivo");
        } else if (c < 0) {
            System.out.println("c es negativo");
        } else{
            System.out.println("c es cero");
        }


        // 4. Crea un programa que diga si un número es par o impar.
        if(c % 2 == 0){
            System.out.println("c es par");
        } else{
            System.out.println("c es impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        if(c > 0 && c < 101){
            System.out.println("c está en el rango de 1 a 100");
        } else{
            System.out.println("c no está en el rango de 1 a 100");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        int dia = 3;
        switch(dia){
            case 1: System.out.println("Domingo");
                break;
            case 2: System.out.println("Lunes");
                break;
            case 3: System.out.println("Martes");
                break;
            case 4: System.out.println("Miércoles");
                break;
            case 5: System.out.println("Jueves");
                break;
            case 6: System.out.println("Viernes");
                break;
            case 7: System.out.println("Sábado");
                break;
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        Scanner entrada = new Scanner(System.in);
        int calificacion;
        calificacion = entrada.nextInt();
        if(calificacion >= 90){
            System.out.println("Sobresaliente");
        } else if ((calificacion >= 60) && (calificacion < 90)) {
            System.out.println("Aprobado");
        } else{
            System.out.println("Suspenso");
        }
        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        System.out.println("Introduce tu edad: ");
        edad = 0;
        edad = entrada.nextInt();
        System.out.println("¿Estás acompañado?");
        entrada.nextLine();
        String compa;
        compa = entrada.nextLine();

        if(edad >= 15){
            System.out.println("Puedes entrar");
        } else{
            if(compa.equals("si")){
                System.out.println("Puedes entrar");
            } else {
                System.out.println("No puedes entrar");
            }
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        char l;
        l = entrada.next().charAt(0);
        switch(l){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': System.out.println("La leta es una vocal");
            break;
            default: System.out.println("La letra no es una vocal");
            break;

        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

        a = 1;
        b = 2;
        c = 3;

        if((a > b) && (a > c)){
            System.out.println(a);
        } else if ((b > a) && (b > c)) {
            System.out.println(b);
        } else{
            System.out.println(c);
        }


    }
}
