package PolymorphismExercises;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismExercises {
    public static void main(String[] args) {

        // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        Cow Cw1 = new Cow();

        List<Animal> list = new ArrayList<Animal>(List.of(d1, c1, Cw1));

        for(Animal animal : list){
            animal.makeSound();
        }
        // 2. Crea una clase Shape con el método calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
        Circle circle = new Circle(100);
        Rectangle rectangle = new Rectangle(10, 20);
        Rectangle rectangle1 = new Rectangle(20,10);

        List<Shape> shapes = new ArrayList<Shape>(List.of(circle, rectangle, rectangle1));

        for(Shape s : shapes){
            s.calculateArea();
        }
        // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.
        Printer.print();
        Printer.print(1);
        Printer.print(2, "lalilulelo");
        // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.

        // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
        List<Vehicle> lista = new ArrayList<Vehicle>();
        Vehicle bike = new Bike();
        Vehicle car = new Car();
        Vehicle truck = new Truck();

        lista.add(bike);
        lista.add(car);
        lista.add(truck);

        for(Vehicle vehicle: lista){
            vehicle.start();
        }

        // 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
        EmailNotification n = new EmailNotification();
        sendNotification(n);
        // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.
        for(Animal animal : list){
            animal.getType();
        }
        // 8. Crea una clase Converter con métodos convert(int), convert(double), y convert(String) que devuelvan diferentes formatos de texto.
        Converter.convert(5);
        Converter.convert(4.5);
        Converter.convert("Hola");
        // 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de Product e imprime el precio final de cada uno.

        // 10. Crea una clase Character con método attack(). Luego crea subclases Warrior, Archer, Mage con ataques diferentes. En main, crea un array de Character y llama a attack() para cada uno.
    }

    public static class Converter{
        public static void convert(int a){
            System.out.println("Integer: " + a);
        }

        public static void convert(double a){
            System.out.println("Double: " + a);
        }

        public static void convert(String a){
            System.out.println("String: " + a);
        }
    }

    public static void showAnimalType(Animal animal){
        animal.getType();
    }

    public static void sendNotification(Notification n){
        n.send();
    }

    public static class Notification{
        public void send(){
            System.out.println("Send notification.");
        }
    }

    public static class EmailNotification extends Notification{
        public void send(){
            System.out.println("Send email notification");
        }
    }

    public static class SMSNotification extends Notification{
        public void send(){
            System.out.println("Sens SMS notification");
        }
    }

    public static class Vehicle{
        public void start(){
            System.out.println("Vehicle start.");
        }
    }

    public static class Car extends Vehicle{
        @Override
        public void start(){
            System.out.println("Car start");
        }
    }

    public static class Bike extends Vehicle{
        @Override
        public void start(){
            System.out.println("Bike start");
        }
    }

    public static class Truck extends Vehicle{
        @Override
        public void start(){
            System.out.println("Truck start");
        }
    }

    public static class Greeter{
        public static void greet(){
            System.out.println("Hello");
        }
        public static void greet(String name){
            System.out.println("Hello: " + name);
        }
    }

    public static class Printer{
        public static void print(){
            System.out.println("No argumentos.");
        }
        public static void print(int a){
            System.out.println("Un argumento.");
        }
        public static void print(int b, String palabra){
            System.out.println("Dos argumentos: " + palabra);
        }

    }

    public static class Shape{
        public void calculateArea(){
            System.out.println("Calculating area: ");
        }
    }

    public static class Circle extends Shape{
        private double radius;
        Circle(double radius){
            this.radius = radius;
        }

        @Override
        public void calculateArea(){
            System.out.println("Area: " + (this.radius * this.radius * Math.PI));
        }
    }

    public static class Rectangle extends Shape{
        private double width, height;
        Rectangle(double width, double height){
            this.width = width;
            this.height = height;
        }

        @Override
        public void calculateArea(){
            System.out.println("Area: " + (this.height * this.width));
        }
    }

    public static class Animal{
        public void makeSound(){
            System.out.println("Sonido.");
        }
        public void getType(){
            System.out.println("Animal");
        }
    }

    public static class Dog extends Animal{
        @Override
        public void makeSound(){
            System.out.println("woof");
        }

        @Override
        public void getType(){
            System.out.println("Dog");
        }
    }

    public static class Cat extends Animal{
        @Override
        public void makeSound(){
            System.out.println("meow");
        }

        @Override
        public void getType(){
            System.out.println("Cat");
        }
    }

    public static class Cow extends Animal{
        @Override
        public void makeSound(){
            System.out.println("muuuuu");
        }

        @Override
        public void getType(){
            System.out.println("Cow");
        }
    }
}
