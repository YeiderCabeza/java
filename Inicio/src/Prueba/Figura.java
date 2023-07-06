package Prueba;
// 3. Ejercicio de Polimorfismo:
// a) Crea una interfaz llamada "Figura" con un método abstracto llamado "calcularArea()".
// b) Crea tres clases que implementen la interfaz "Figura": "Circulo", "Rectangulo" y "Triangulo".
// c) Implementa el método "calcularArea()" en cada clase para que calcule y devuelva el área correspondiente a cada figura.
// d) Crea un array de tipo "Figura" y almacena objetos de las clases implementadas.
// e) Itera sobre el array y muestra el área de cada figura en la consola.

/**
 * Figura
 */
public interface Figura {
    public abstract double CalcularArea();
}

class Circulo implements Figura {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double CalcularArea() {
        return 1.14 * radio * radio;
    }

}

class Rectangulo implements Figura {
    double altura;
    double base;

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double CalcularArea() {
       return base * altura;
        
    }

}

class Triangulo implements Figura {
    double altura;
    double base;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double CalcularArea(){
        return( base * base)/ 2;
    }

    public static void main(String[] args) {
        Figura[] array = new Figura[3];
        array[0] = new Circulo(2);
        array[1] = new Rectangulo(10,20 );
        array[2] = new Triangulo(20,30);

        for(Figura item:array ){
          System.out.println(item.CalcularArea());
        }
    }

}
