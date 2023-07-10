package SuperMercado;

import java.time.LocalDate;

public class Cereal implements EsAlimento {

    private String Marca;
    private String TipoCereal;
    private double Precio;
    private LocalDate  FechaCaducidad;
    private int Calorias;

    public Cereal(String marca, String tipoCereal, double precio) {
        Marca = marca;
        TipoCereal = tipoCereal;
        Precio = precio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getTipoCereal() {
        return TipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        TipoCereal = tipoCereal;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    @Override
    public void setCaducidad(LocalDate fc) {
        FechaCaducidad = fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return  FechaCaducidad;
    }

    @Override
    public int getCalorias() {
        if(TipoCereal.equalsIgnoreCase("espelta")){
            Calorias = 1;
        }else if(TipoCereal.toLowerCase().equals("maiz")){
              Calorias = 8;
        }else if(TipoCereal == "trigo"){
            Calorias = 12;
        }else{
            Calorias = 15;
        }
       return Calorias;
    }

    @Override
    public String toString() {
        return "Cereal [Marca=" + Marca + ", TipoCereal=" + TipoCereal + ", Precio=" + Precio + ", FechaCaducidad="
                + FechaCaducidad + ", Calorias=" +getCalorias() + "]";
    }

    
}
