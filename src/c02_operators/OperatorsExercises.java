package c02_operators;

public class OperatorsExercises {
    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        int a, b, c, d, e, f;
        a = 1 + 1;
        b = 1 - 1;
        c = 1 / 1;
        d = 1 * 1;
        e = 1 % 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        // 2. Crea una variable para cada tipo de operación de asignación.
        int A, B, C, D, E, F;
        A = 5;
        B = 56;
        B += A;
        C = 0; C -= A;
        D = B; D /= A;
        E = D; E %= A;
        F = C; F *= B;
        System.out.printf("%d, %d, %d, %d, %d, %d\n", A, B, C, D, E, F);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(5 == 5);
        System.out.println(5 <= 5);
        System.out.println(5 >= 5);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(5 == 4);
        System.out.println(5 <= 4);
        System.out.println(5 >= 6);

        // 5. Utiliza el operador lógico and.
        System.out.println((2 < 3) && (3 < 4));

        // 6. Utiliza el operador lógico or.
        System.out.println((2 < 3) || (3 < 3));

        // 7. Combina ambos operadores lógicos.
        System.out.println(((2 < 3) || (3 < 3)) && (1 == 1));
        // 8. Añade alguna negación.
        System.out.println(!((2 < 3) && (3 < 4)));

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        int i = 0;
        System.out.println(i++);
        System.out.println(i--);
        System.out.println(~i);

        // 10. Combina operadores aritméticos, de comparación y lógicos.

        System.out.println(((45 < 23)&&(1 == 1))||(7 > 45));
    }
}
