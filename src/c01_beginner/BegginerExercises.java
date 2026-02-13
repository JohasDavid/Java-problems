package c01_beginner;

public class BegginerExercises {
    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        var nombre = new String();
        nombre = "Johas";
        System.out.println(nombre);

        String nombreCompleto = "Johas David Morales Barroso";
        System.out.println(nombreCompleto);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int edad = 30;
        System.out.println(edad);
        // 3. Crea una variable double con tu altura en metros.
        double estatura = 1.66;
        System.out.println(estatura);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean gustaProgramar = true;
        System.out.println("Te gusta programar: " + gustaProgramar);

        // 5. Declara una constante con tu email.
        final String correo = "johasdavid@icloud.com";
        System.out.println(correo);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char inicial = 'J';
        System.out.println(inicial);
        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String localidad = new String();
        localidad = "CDMX";
        System.out.println(localidad);
        localidad = "Distrito Federal";
        System.out.println(localidad);
        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 5, b = 7;
        System.out.println(a + b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(correo.getClass().getSimpleName());
        System.out.println(((Object)a).getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int c;
        c = 56;
        System.out.println(c);
    }
}
