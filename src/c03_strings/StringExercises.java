package c03_strings;

public class StringExercises {
    public static void main(String[] args) {
        // 1. Concatena dos cadenas de texto.
    String nombre = new String();
    nombre = "Johas David";
    String apellidos = new String();
    apellidos = "Morales Barroso";
    String nombreCompleto = nombre + " " + apellidos;
    System.out.println(nombreCompleto);
        // 2. Muestra la longitud de una cadena de texto.
        int longitud;
        longitud = nombre.length();
        System.out.println(longitud);
        longitud = apellidos.length();
        System.out.println(longitud);

        // 3. Muestra el primer y último carácter de un string.
        System.out.println(nombre.charAt(0));
        System.out.println(nombre.charAt(nombre.length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        nombre = nombre.toUpperCase();
        apellidos = apellidos.toLowerCase();

        System.out.println(nombre);
        System.out.println(apellidos);
        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(nombre.contains("JOHAS"));

        // 6. Formatea un string con un entero.
        var age = 30;
        System.out.println(String.format("Hola %s. Tengo %d años.", nombre, 30));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        String prueba = " Hola me llamo Johas ";
        System.out.println(prueba.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-)
        String guiones = "Johas David Morales Barroso";
        System.out.println(guiones);
        guiones = guiones.replace(" ", "-");
        System.out.println(guiones);
        // 9. Comprueba si dos strings son iguales.
        boolean a = guiones.equals("Johas-David-Morales-Barroso");
        System.out.println(a);

        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(guiones.length() == "lalilulelo".length());
    }
}
