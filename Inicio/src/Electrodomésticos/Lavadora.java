package Electrodomésticos;

public class Lavadora extends Electrodomestico {

    private double Precio;
    private boolean AguaCanliente;

    public Lavadora(String marca, double pontencia, boolean aguaCanliente) {
        super("Lavadora", marca, pontencia);
        AguaCanliente = false;
    }

    public Lavadora(String marca, double Precio, double potencia, boolean aguaCanliente) {
        super("Lavadora", marca, potencia);
        this.AguaCanliente = aguaCanliente;
        this.Precio = Precio;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public boolean isAguaCanliente() {
        return AguaCanliente;
    }

    public void setAguaCanliente(boolean aguaCanliente) {
        AguaCanliente = aguaCanliente;
    }

    @Override
    public String toString() {
        return "Lavadora ["+ "Marca= " + getMarca() + ", Potencia= " + getPotencia() +
        ", Precio=" + Precio + ", AguaCanliente=" + AguaCanliente + "]";
    }

    @Override
    public double getConsumo(int hora){

        if (AguaCanliente) {
            return hora * (getPotencia()+ getPotencia() * 0.20);
        }else{
           return getPotencia() * hora;
        }

    }   
    
}
