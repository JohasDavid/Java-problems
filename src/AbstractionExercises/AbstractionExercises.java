package AbstractionExercises;

import javax.swing.*;
import java.awt.*;
import java.awt.*;


import java.util.ArrayList;

public class AbstractionExercises {
    public static void main(String[] args) {

        // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.

        // 2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.

        // 3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.

        System.out.println("Problema 3");
        Animal[] animales = new Animal[3];
        animales[0] = new Dog();
        animales[1] = new Cat();
        animales[2] = new Dog();

        for(Animal a: animales){
            a.makeSound();
        }


        // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().
            Circle circulo = new Circle(20);
        // 5. Crea una clase abstracta Employee con un método calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.

        // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y Robot implementen ese método con comportamientos diferentes.

        // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff(). Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.

        // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que implemente ambas interfaces y muestre cómo puede volar y nadar.

        // 9. Crea una clase abstracta Document con el método print(). Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.

        // 10. Crea una interfaz Payable con el método pay(). Luego implementa las clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago diferente.
    }

    static abstract class Employee{
        abstract void calculateSalary();
    }

    static class FullTimeEmployee extends Employee{
        private int years;
        @Override
        public void calculateSalary(){
            System.out.println(this.years * 2 * 10000);
        }
    }

    static class PartTimeEmployee extends Employee{
        private int years;
        @Override
        public void calculateSalary(){
            System.out.println(this.years * 10000);
        }

    }

    public interface Drawable{
        void draw();
    }

    static class Circle implements Drawable{
        private double radius;

        Circle(double r){
        this.radius = r;
        }

        @Override
        public void draw(){
            System.out.printf("Dibuja círculo de radio: %lf", this.radius);
        }

    }

    static class Square implements Drawable{
        private double length;

        Square(double l){
            this.length = l;
        }

        @Override
        public void draw(){
            System.out.printf("Dibuja cuadrado de lado: %lf", this.length);
        }
    }

    static class Point{
        public double x, y;
        Point(double x, double y){
            this.x = x;
            this.y = y;
        }
    }

    static class Triangle implements Drawable{
        private Point p1, p2, p3;

        Triangle(Point p1, Point p2, Point p3){
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }

        @Override
        public void draw(){
            System.out.printf("Dibuja triangulo con vetices: (%lf, %lf), (%lf, %lf), (%lf, %lf)", p1.x, p1.y, p2.x, p2.y, p3.x, p3.y);
        }

    }



    static abstract class Animal{
        abstract void makeSound();
    }

    static class Dog extends Animal{
        void makeSound(){
            System.out.println("guau");
        }
    }

    static class Cat extends Animal{
        void makeSound(){
            System.out.println("miau");
        }
    }

    public interface Playable{
        void play();
    }

    static class Guitar implements Playable{

        @Override
        public void play(){
            System.out.println("Suena la guitarra.");
        }
    }

    static class Piano implements Playable{
        @Override
        public void play(){
            System.out.println("Suena el piano.");
        }
    }


    static abstract class Shape{
        abstract double calculateArea();
    }

    static class Circleproblem1 extends Shape{
        private double radius = 0;

        @Override
        public double calculateArea(){
            return (this.radius * this.radius) * Math.PI;
        }
    }

    static class Rectangle extends Shape{
        private double length = 0, width = 0;

        @Override
        public double calculateArea(){
            return this.width * this.length;
        }

    }


}
