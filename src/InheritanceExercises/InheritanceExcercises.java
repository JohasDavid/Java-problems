package InheritanceExercises;

public class InheritanceExcercises {
    public static void main(String[] args) {

        // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
        Car v1 = new Car();
        v1.move();
        v1.honk();

        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().

        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        d1.makesound();
        c1.makesound();

        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.

        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.
        Circle a = new Circle(10);
        Rectangle b = new Rectangle(10, 20);
        a.calculateArea();
        b.calculateArea();

        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
        Bird bird = new Bird();
        Eagle eagle = new Eagle();
        bird.fly();
        eagle.fly();
        eagle.fly_super();


        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.

        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().

        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.

        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
    }

    public static class Bird{
        public void fly(){
            System.out.println("Bird Fly");
        }
    }

    public static class Eagle extends Bird{
        @Override
        public void fly(){
            System.out.println("Eagle fly");
        }
        public void fly_super(){
            super.fly();
        }
    }

    public abstract static class Shape{
        abstract void calculateArea();
    }

    public static class Circle extends Shape{
        private double radius;
        Circle(double r){
            this.radius = r;
        }
        @Override
        public void calculateArea(){
            System.out.println("Area: ");
            System.out.printf("%.2f\n", this.radius * this.radius * Math.PI);
        }
    }

    public static class Rectangle extends Shape{
        private double side1, side2;
        Rectangle(double a, double b){
            this.side2 = b;
            this.side1 = a;
        }
        @Override
        public void calculateArea(){
            System.out.println("Area: ");
            System.out.printf("%.2f\n", this.side1 * this.side2);

        }
    }

    public static class Employee{
        private String name;
        private float salary;
        Employee(String name, float salary){
            this.name = name;
            this.salary = salary;
        }

    }

    public static class Manager extends Employee{
        private String department;
        Manager(String name, float salary, String department){
            super(name, salary);
            this.department = department;
        }
    }

    public static class Animal{
        public void makesound(){};
    }

    public static class Dog extends Animal{

        @Override
        public void makesound(){
            System.out.println("Woof");
        }
    }

    public static class Cat extends Animal{

        @Override
        public void makesound(){
            System.out.println("Meow");
        }
    }

    public static class Person{
        private String name;
        private int age;
        Person(String name, int age){
            this.name = name;
            this.age = age;
        }
    }

    public static class Student extends Person{
        private int grade;
        Student(String name, int age, int grade){
            super(name, age);
            this.grade = grade;

        }

        public void study(){
            System.out.println("Studing...");
        }

    }

    public static class Vehicle{
        public static void move(){
            System.out.println("Vehicule move");
        }
    }

    public static class Car extends Vehicle{
        public static void honk(){
            System.out.println("Honk");
        }
    }
}
