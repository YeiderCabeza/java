package Electrodomésticos;

/**
 * Electrodomestico
 */
public class Electrodomestico {

    private String Tipo;
    private String Marca;
    private double Potencia;

    public Electrodomestico(String tipo, String marca, double pontencia) {
        Tipo = tipo;
        Marca = marca;
        Potencia = pontencia;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public double getPotencia() {
        return Potencia;
    }

    public void setPotencia(double potencia) {
        Potencia = potencia;
    }

    @Override
    public String toString() {
        return "Electrodomestico [Tipo=" + Tipo + ", Marca=" + Marca + ", Potencia=" + Potencia + "]";
    }

    public double getConsumo(int horas){
      return Potencia*horas;
    }

    public double getCosteConsumo(int horas, double CosteHora){
        return getConsumo(horas)*CosteHora;
    }
}