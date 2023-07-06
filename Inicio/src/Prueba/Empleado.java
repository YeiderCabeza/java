package Prueba;
// 4. Ejercicio de Abstracción:
// a) Crea una clase abstracta llamada "Empleado" con los atributos "nombre" (String) y "salario" (double).
// b) Implementa un constructor que acepte los valores para los atributos y un método abstracto llamado "calcularSalarioMensual()".
// c) Crea dos clases que hereden de "Empleado": "Programador" y "Gerente".
// d) Implementa el método "calcularSalarioMensual()" en cada clase para que calcule y devuelva el salario mensual correspondiente a cada empleado.
// e) Crea objetos de las clases "Programador" y "Gerente" e invoca el método "calcularSalarioMensual()" en cada uno.
public abstract class Empleado {
    private String Nombre;
    protected double Salario;

    public Empleado(String nombre, double salario) {
        Nombre = nombre;
        Salario = salario;
    }

    public abstract double calcularSalarioMensual();

}

class Programador extends Empleado {

    public Programador(String nombre, double salario) {
        super(nombre, salario);

    }

    @Override
    public double calcularSalarioMensual() {
        return Salario;
    }

}

class Gerente extends Empleado {

    public Gerente(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularSalarioMensual() {
        return Salario;
    }

    public static void main(String[] args) {

        Programador progr1 = new Programador("Jose", 140000);
        Gerente ger1 = new Gerente("Maria", 300000);

        System.out.println("El salario del programador " + progr1.calcularSalarioMensual());
        System.out.println("El salario de gerente " + ger1.calcularSalarioMensual());

    }

}
