package C05_structures;

import java.util.*;

public class StructuresExercisises{

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        int[] array = new int[5];
        array = new int[]{1, 2, 3, 4, 5};
        System.out.println("Longitud: "+ array.length);


        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println("Valor de array[1]: " + array[1]);
        array[1] = 300;
        System.out.println("Valor de array[1]: " + array[1]);

        // 3. Crea un ArrayList vacío.
        ArrayList<Integer> numeros = new ArrayList<>();
        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.remove(3);
        System.out.println(numeros);

        // 5. Crea un HashSet con 2 valores diferentes.
        Set<String> s = new HashSet<>(Arrays.asList("a", "b"));
        System.out.println(s);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        s.add("b");
        s.add("c");
        System.out.println(s);
        // 7. Elimina uno de los elementos del HashSet.
        s.remove("a");
        System.out.println(s);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        HashMap<String, String> directorio = new HashMap<>();
        directorio.put("Johas", "5582777769");
        directorio.put("Ana", "5534405659");
        directorio.put("extra","3");

        System.out.println(directorio);
        // 9. Modifica uno de los contactos y elimina otro.
        directorio.replace("Johas", "telefono casa");
        directorio.remove("extra");
        System.out.println(directorio);


        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        System.out.println("Problema 10");
        Integer[] array2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array2));

        ArrayList<Integer> numeros2 = new ArrayList<>(Arrays.asList(array2));
        System.out.println("ArrayList: " + numeros2);

        HashSet<Integer> hashSet = new HashSet<>(numeros2);
        System.out.println("HashSet: " + hashSet);

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(Integer n : hashSet){
            hashMap.put(n, n);
        }
        System.out.println("HashMap: " + hashMap);

    }
}


