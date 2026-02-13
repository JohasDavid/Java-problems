package C06_loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class LoopsExercises {
    public static void main(String[] args) {
        // 1. Imprime los números del 1 al 10 usando while.
        System.out.println("Problema 1");
        int contador = 1;
        while(contador < 11){
            System.out.println(contador);
            contador++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        System.out.println("Problema 2");
        ArrayList<Integer> array= new ArrayList<>();
        for(int i = 0; i < 11; i++){
            array.add(i);
        }
        int j = 0;
        do{

            System.out.println(array.get(j));
            j++;
        }while(j != array.size());


        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        System.out.println("Problema 3");
        for(int i = 1; i < 51; i++){
            System.out.println(5 * i);
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        System.out.println("Problema 4");
        int[] array2 = {1, 2, 3, 4, 5};
        int suma = 0;
        for(j = 0; j < 5; j++){
            System.out.println(array2[j]);
            suma += array2[j];
        }
        System.out.println(suma);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        System.out.println("Problema 5");
        for(j = 0; j < 5; j++){
            System.out.println(array2[j]);
        }
        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        System.out.println("Problema 6");
        HashSet<Integer> forEachHashSet= new HashSet<>();
        forEachHashSet.add(1);
        forEachHashSet.add(2);
        forEachHashSet.add(3);
        for(Integer entero : forEachHashSet){
            System.out.println(entero);
        }

        HashMap<String, Integer> forEachHashMap = new HashMap<>();
        forEachHashMap.put("uno", 1);
        forEachHashMap.put("dos", 2);
        forEachHashMap.put("tres", 3);

        for(Integer entero : forEachHashMap.values()){
            System.out.println(entero);
        }

        for(String entero : forEachHashMap.keySet()){
            System.out.println(entero);
        }

        // 7. Imprime los números del 10 al 1 (descendente) con un bucle for.
        System.out.println("Problema 7");
        for(int k = 10; k > 0; k--){
            System.out.println(k);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        System.out.println("Problema 8");
        for(j = 0; j < 21; j++){
            if(j % 3 == 0){
                continue;
            }else{System.out.println(j);}
        }

        for(j = 0; j < 21; j++){
            System.out.println(j % 3 == 0 ? "" : j);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        System.out.println("Problema 9");
        ArrayList<Integer> negativo= new ArrayList<>();
        negativo.add(23);
        negativo.add(24);
        negativo.add(-1);
        negativo.add(55);

        for(j = 0; j < negativo.size(); j++){
            if(negativo.get(j) < 0){
                break;
            }
            System.out.println(negativo.get(j));
        }
        // 10. Crea un programa que calcule el factorial de un número dado.
        System.out.println("Problema 10\n");
        Scanner scaner = new Scanner(System.in);
        int m = scaner.nextInt();
        int factorial = 1;
        for( int i = m; i > 0; i--){
            factorial *= i;
        }
        System.out.printf("Factorial: %d", factorial);
    }
}
