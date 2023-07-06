package Prueba;

// a) Crea una clase abstracta llamada "Animal" con el atributo "nombre" (String) y un método abstracto llamado "hacerSonido()".
// b) Crea dos clases que hereden de "Animal": "Perro" y "Gato".
// c) Implementa el método "hacerSonido()" en cada clase para que imprima un sonido característico de cada animal.
// d) Crea objetos de las clases "Perro" y "Gato" e invoca el método "hacerSonido()" en cada uno.

public abstract class Animal {

  private String Nombre;

  public Animal(String nombre) {
    Nombre = nombre;
  }

  public abstract void HacerSonido();

}

class Gato extends Animal {

  public Gato(String nombre) {
    super(nombre);
  }

  @Override
  public void HacerSonido() {
    System.out.println("el Gato hace miauuu");
  }

}

class Perro extends Animal {

  public Perro(String Nombre) {
    super(Nombre);
  }

  @Override
  public void HacerSonido() {
    System.out.println("El Perro hace guau ");
  }

  public static void main(String[] args) {
    Perro perro = new Perro("Roffu");
    Gato gato = new Gato("Linda");

    perro.HacerSonido();
    gato.HacerSonido();
  }

}
