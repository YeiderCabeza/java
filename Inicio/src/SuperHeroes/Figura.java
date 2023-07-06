package SuperHeroes;
public class Figura {
    private String Codigo;
    private double Precio;
    private SuperHeroe Caracteristicas;
    private Dimension Dimension;
    
    public Figura(String cod, double precio, SuperHeroe caracteristicas, Dimension dimension) {
        Codigo = cod;
        Precio = precio;
        Caracteristicas = caracteristicas;
        Dimension = dimension;
    }

   public void SubirPrecio(double Cantidad){
        Precio += Cantidad;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public SuperHeroe getCaracteristicas() {
        return Caracteristicas;
    }

    public void setCaracteristicas(SuperHeroe caracteristicas) {
        Caracteristicas = caracteristicas;
    }

    public Dimension getDimension() {
        return Dimension;
    }

    public void setDimension(Dimension dimension) {
        Dimension = dimension;
    }


    @Override
    public String toString() {
        return "Figura [Codigo=" + Codigo + ", Precio=" + Precio + ",\n" + Caracteristicas
                + ",\n" + Dimension + "]";
    }

    
}
