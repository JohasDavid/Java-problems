package C09_AccessModifiersExercises;

public class AccessModifiersExercises {
    public static void main(String[] args) {

        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
        System.out.println("Problema 1");
        otraClase prueba = new otraClase();
        prueba.mostrarNombre();
        prueba.mostrarEdad();

        prueba.cambiarEdad(35);
        prueba.cambiarNombre("David");

        prueba.mostrarNombre();
        prueba.mostrarEdad();

        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
        System.out.println("Problema 2");
        Product jabon = new Product("Jabón", 10.0);
        Product otro = new Product("Imposible", -3);

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
        System.out.println("Problema 3");
        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
        System.out.println("Problema 4");
        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        System.out.println("Problema 5");
        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
        System.out.println("Problema 6");
        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
        System.out.println("Problema 7");

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.

        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
    }

    static class Car{

        private double speed = 0;

        public void accelerate(double a){
            if( a > 0){
                if(this.speed + a <= 120){
                    this.speed += a;
                }else{
                    System.out.println("Exceso de velocidad.");
                }
            }else{
                System.out.println("Valor inválido");
            }
        }

        public void brake(double a){
            if( a > 0){
                if(this.speed - a >= 0){
                    this.speed -= a;
                }else{
                    System.out.println("Freno de más.");
                }
            }else{
                System.out.println("Valor inválido");
            }
        }
    }

    static class Student{
        private int grade = 0;

        public void setGrade(int grade) {
            if(grade > 0 && grade <= 100) {
                this.grade = grade;
            }else{
                System.out.println("Nota inválida");
            }
        }

        public boolean isPassed(){
            return this.grade >= 60;
        }
    }

    static class Rectangle{
        private double width = 0, height = 0, area;

        Rectangle(double width, double height){
            if( width > 0 && height > 0 ){
            this.width = width;
            this.height = height;
            }else {
                System.out.println("Valores inapropiados");
            }
        }
        public double calculateArea(){
            if(this.height > 0 && this.width > 0) {
                this.area = this.width * this.height;
                return this.area;
            }else{
                System.out.println("Introduce valores para height y width.");
                return 0;
            }
        }

        public void setHeight(double height){
            if(height > 0){
                this.height = height;
            }else{
                System.out.println("Valor inapropiado");
            }
        }

        public void setWidth(double width){
            if( width > 0 ){
                this.width = width;
            }else{
                System.out.println("Valor inapropiado.");
            }
        }
    }

    static class Employee{
        private double salary;
        Employee(double salary){
            this.salary = salary;
        }

        void raiseSalary(double percent){
            if(0.0 < percent && percent <= 1.0){
                this.salary = this.salary * (1 + percent);
            }else{
                System.out.println("El incremento debe de ser positivo");
            }
        }
    }


    static class User{
        private String username, password;

        public void setUsername(String username){
            this.username = username;
        }

        public void setPassword(String password){
            this.password = password;
        }

        public boolean checkPassword(String inputPassword){
            if(this.password.equals(inputPassword)){
                return true;
            }else{
                return false;
            }
        }

    }


    static class Temperature{
        private double Celsius;
        void setCelsius(double T){
            this.Celsius = T;
        }
        Temperature(double T){
            setCelsius(T);
        }
    }


    static class Book{
        private String title;
        public String getTitle(){
            return this.title;
        }
        Book(String a){
            this.title = a;
        }

    }


    static class BankAccount{
        private double balance = 0;

        public void deposit(double amount){
            if(amount > 0){
                this.balance += amount;
            }else{
                System.out.println("Monto inválido");
            }
        }

        public void withdraw(double amount){
            if(this.balance >= amount){
                this.balance -= amount;
            }else{
                System.out.println("Monto inválido");
            }
        }

    }



    static class Product{
        private double price = 0;
        public String name;

        public void setPrice(double price){
            if(price > 0){
                this.price = price;
            }else{
                System.out.println("Error el precio debe ser mayor a 0");
            }
        }

        Product(String name, double price){
            this.name = name;
            setPrice(price);
        }
    }

    static class Person{
        private String name;
        private int age;

        Person(String name, int age){
            this.age = age;
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name){
            this.name = name;
        }

        public int getAge(){
            return this.age;
        }

        public String getName(){
            return this.name;
        }
    }

    static class otraClase{
        Person johas = new Person("Johas", 31);

        public void mostrarNombre(){
            System.out.println(johas.getName());
        }

        public void mostrarEdad(){
            System.out.println(johas.getAge());
        }

        public void cambiarNombre(String nombre){
            johas.setName(nombre);
        }

        public void cambiarEdad(int age){
            johas.setAge(age);
        }

    }
}
