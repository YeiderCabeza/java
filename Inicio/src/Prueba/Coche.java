package Prueba;
public class Coche {
    private String Marca;
    private String Modelo;
    private int Año;

    public Coche(String marca, String modelo, int año) {
        Marca = marca;
        Modelo = modelo;
        Año = año;
    }


    public String getMarca() {
        return Marca;
    }


    public void setMarca(String marca) {
        Marca = marca;
    }


    public String getModelo() {
        return Modelo;
    }


    public void setModelo(String modelo) {
        Modelo = modelo;
    }


    public int getAño() {
        return Año;
    }


    public void setAño(int año) {
        Año = año;
    }

public static void main(String[] args) {
    Coche coche1 = new Coche("bmw", "2020", 2023);
    System.out.println(coche1.getMarca());
      System.out.println(coche1.getModelo());
        System.out.println(coche1.getAño());
}
}

