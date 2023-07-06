package SuperHeroes;

public class Dimension {
    private double Alto;
    private double Ancho;
    private double Profundida;

    public Dimension() {
        this.Alto = 0;
        this.Ancho = 0;
        this.Profundida = 0;
    }

    public Dimension(double alto, double ancho, double profundida) {
        Alto = alto;
        Ancho = ancho;
        Profundida = profundida;
    }

    public double getAlto() {
        return Alto;
    }

    public void setAlto(double alto) {
        Alto = alto;
    }

    public double getAncho() {
        return Ancho;
    }

    public void setAncho(double ancho) {
        Ancho = ancho;
    }

    public double getProfundida() {
        return Profundida;
    }

    public void setProfundida(double profundida) {
        Profundida = profundida;
    }

    public double getVolumen(){
       return Alto*Ancho*Profundida;
    }

    @Override
    public String toString() {
        return "Dimension [Alto=" + Alto + ", Ancho=" + Ancho + ", Profundida=" + Profundida +", Volumen= "+ getVolumen() + "]";
    }


}
