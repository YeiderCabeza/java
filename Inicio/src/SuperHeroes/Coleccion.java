package SuperHeroes;

import java.util.ArrayList;

public class Coleccion {
    private String NombreColeccion;
    private ArrayList<Figura> ListaFiguras;

    public Coleccion(String nombreColeccion) {
        NombreColeccion = nombreColeccion;
        ListaFiguras = new ArrayList<Figura>();
    }

    public String getNombreColeccion() {
        return NombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        NombreColeccion = nombreColeccion;
    }

    public void AñadirFigura(Figura Fig) {
        ListaFiguras.add(Fig);
    }

    public void SubirPrecio(double Cantidad, String id) {
        for (Figura f : ListaFiguras) {
            if (f.getCodigo().equals(id)) {
                f.SubirPrecio(Cantidad);
            }
        }
    }

    @Override
    public String toString() {
        String cadena = "Coleccion " + NombreColeccion + "\n----------------------\n";
        for (Figura f : ListaFiguras) {
            cadena += f + "\n";
        }
        return cadena;
    }

    public String ConCapa() {
        String cadena = "Listado de Figuras con capas " + "\n--------------------------\n";
        for (Figura f : ListaFiguras) {
            if (f.getCaracteristicas().isCapa()) {
                cadena += f + "\n";
            }
        }
        return cadena;
    }

    public Figura MasValioso() {
        double MayorValor = 0.0;
        Figura FigValiosa = null;
        for (Figura f : ListaFiguras) {

            if (f.getPrecio() > MayorValor) {
                MayorValor = f.getPrecio();
                FigValiosa = f;
            }
        }
        return FigValiosa;
    }

    public double getValorColeccion(){
        double ValorCol = 0.0;
        for(Figura f: ListaFiguras){ 
            ValorCol += f.getPrecio();
        }
        return ValorCol;
    }

    public double getVolumenColeccion(){ 
        double VolumennFig = 0.0;
        for(Figura f:ListaFiguras){
            VolumennFig += f.getDimension().getVolumen();
        }
        return VolumennFig+200;
    }

}