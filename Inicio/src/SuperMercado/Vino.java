package SuperMercado;

import java.time.LocalDate;

public class Vino implements EsLiquido, EsAlimento, ConDescuento {
    private String Marca;
    private String TipoVino;
    private double GradoAlcohol;
    private double precio;

    private double Descuento;
    private LocalDate FechaCaducidad;
    private int Calorias;
    private double Volumen;
    private String TipoEnvase;

    public Vino(String marca, String tipoVino, double gradoAlcohol, double precio) {
        Marca = marca;
        TipoVino = tipoVino;
        GradoAlcohol = gradoAlcohol;
        this.precio = precio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getTipoVino() {
        return TipoVino;
    }

    public void setTipoVino(String tipoVino) {
        TipoVino = tipoVino;
    }

    public double getGradoAlcohol() {
        return GradoAlcohol;
    }

    public void setGradoAlcohol(double gradoAlcohol) {
        GradoAlcohol = gradoAlcohol;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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
        return precio - (precio * (Descuento * 100.0));
    }

    @Override
    public void setCaducidad(LocalDate fc) {
        FechaCaducidad = fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return FechaCaducidad;
    }

    @Override
    public int getCalorias() {
        Calorias = (int) (GradoAlcohol * 10) ;
        return Calorias ;
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
        TipoEnvase = env;
    }

    @Override
    public String getTipoEnvase() {
        return TipoEnvase;
    }

    @Override
    public String toString() {
        return "Vino [Marca=" + Marca + ", TipoVino=" + TipoVino + ", GradoAlcohol=" + GradoAlcohol + ", precio="
                + precio + ", Descuento=" + Descuento + ", FechaCaducidad=" + FechaCaducidad + ", Calorias=" + Calorias
                + ", Volumen=" + Volumen + ", TipoEnvase=" + TipoEnvase + "]";
    }

    
}
