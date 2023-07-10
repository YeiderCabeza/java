package SuperMercado;

public class Detergente implements ConDescuento, EsLiquido {
    private String Marca;
    private double Precio;
    private double Volumen;
    private String TipoEnvase;
    private double Descuento;

    public Detergente(String marca, double precio) {
        Marca = marca;
        Precio = precio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    @Override
    public void setVolumen(double v) {
        Volumen = v;
    }

    @Override
    public double getVolumen() {
       return Volumen;
    }

    @Override
    public void setTipoEnvase(String env) {
        TipoEnvase= env;
    }

    @Override
    public String getTipoEnvase() {
       return TipoEnvase;
    }

    @Override
    public void setDescuento(double des) {
       Descuento = des;
    }

    @Override
    public double getDescuento() {
        return Descuento; 
    }

    @Override
    public double getPrecioDescuento() {
        return Precio - (Precio * (Descuento/100.0));
    }

    @Override
    public String toString() {
        return "Detergente [Marca=" + Marca + ", Precio=" + Precio + ", Volumen=" + Volumen + ", TipoEnvase="
                + TipoEnvase + ", Descuento=" + Descuento + ", Total a Pagar="+ getPrecioDescuento() +"]";
    }

    
    
    

}
