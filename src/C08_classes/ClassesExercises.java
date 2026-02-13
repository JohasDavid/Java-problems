package C08_classes;

import java.util.ArrayList;

public class ClassesExercises {
    public static void main(String[] args) {
        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.

        System.out.println("Problema 1:");
        String autor = "Miguel de Cervantes";
        String title = "El ingenioso hidalgo Don Quijote de la Mancha";

        Book quijote = new Book(autor,title);
        System.out.println("Autor: " + quijote.author);
        System.out.println("Libro: " + quijote.title);
        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        System.out.println("Problema 2");
        Dog perro = new Dog();
        perro.bark();
        // 3. Añade un constructor a la clase Book que reciba title y author.
        System.out.println("Problema 3");
        System.out.println("Lo hice desde el problema 1.");
        // 4. Crea una clase Car con atributos brand y model y un método showData().
        System.out.println("Problema 4");

        Car carro = new Car("Corolla", "Toyota");
        carro.showData();
        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        System.out.println("Problema 5");
        Student test = new Student(75);
        test.Aproved();
        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        System.out.println("Problema 6");
        BankAccount santander = new BankAccount(10000);
        santander.mostrarSaldo();
        santander.deposit(23000);
        santander.mostrarSaldo();

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        System.out.println("Problema 7");
        Rectangle rectangulo = new Rectangle(5.5, 7.7);
        rectangulo.perimetro();
        rectangulo.area();

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        System.out.println("Problema 8");
        Worker pepito = new Worker("Pepito", 10000);
        System.out.println("Salario: " + pepito.getSalario());

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        System.out.println("Problema 9");

        Person johas = new Person("Johas");
        Person isabel = new Person("Isabel");

        ArrayList<Person> personas = new ArrayList<>();

        personas.add(johas);
        personas.add(isabel);

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        System.out.println("Problema 10");
        Product llaves = new Product("Llaves", 50.00);
        llaves.printPrecio();
        llaves.descuento(5.50);
        llaves.printPrecio();
    }

    static class Product{
        private String name;
        private double precio;
        Product(String name, double precio){
            this.name = name;
            this.precio = precio;
        }

        public void descuento(double descuento){
            if(descuento < this.precio) {
                this.precio -= descuento;
            }
        }

        public void printPrecio(){
            System.out.println("Precio: " + this.precio);
        }
    }


    static class Person{
        private String name;
        Person(String name){
            this.name = name;
        }
        public void getName(){
            System.out.println("Nombre: " + this.name);
        }
    }
    static class Worker{
        private double salario;
        private String nombre;

        Worker(String nombre, double salario){
            this.nombre = nombre;
            this.salario = salario;
        }

        public double getSalario(){
            return this.salario;
        }

    }


    static class Rectangle{
        private double base, altura;

        public void area(){
            double area = this.base * this.altura;
            System.out.println("Area: " + area);
        }

        public void perimetro(){
            double perimetro = this.base * 2 + this.altura * 2;
            System.out.println("Perimetro: " + perimetro);
        }

        Rectangle(double base, double altura){
            this.base = base;
            this.altura = altura;
        }

    }



    static class BankAccount{
        private double balance;

        BankAccount(int a){
            this.balance = a;
        }

        public void deposit(int a){
            if(a > 0){
                this.balance += a;
            }else{
                System.out.println("El monto a depositar debe ser positivo");
            }
        }

        public void mostrarSaldo(){
            System.out.println("Saldo: " + this.balance);
        }

    }



    static class Book{
        public String title, author;

        public Book(String title, String author){
            this.title = title;
            this.author = author;
        }
    }

    static class Dog{
        public void bark(){
            System.out.println("Estoy ladrando.");
        }
    }

    static class Car{
        private String model, brand;

        public Car(String model, String brand){
            this.brand = brand;
            this.model = model;
        }

        public void showData(){
            System.out.println("Marca: " + this.brand);
            System.out.println("Modelo: "+ this.model);
        }
    }

    static class Student{
        private int score;

        public boolean Aproved(){
            if(this.score < 60){
                System.out.println("Reprobado");
                return false;
            }else{
                System.out.println("Aprobado");
                return true;
            }
        }

        public Student(int cal){
            this.score = cal;
        }
    }


}
