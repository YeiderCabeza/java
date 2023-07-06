package SuperHeroes;
public class SuperHeroe {
    
    private String Nombre; 
    private String Descripcion ; 
    private boolean Capa;


    public SuperHeroe(String Nombre) {
        this.Nombre = Nombre;
        this.Descripcion ="";
        this.Capa = false;
    }

// metodos get y setter

public void setNombre(String nombre) {
    Nombre = nombre;
}

public void setDescripcion(String descripcion) {
    Descripcion = descripcion;
}

public void setCapa(boolean capa) {
    Capa = capa;
}

public String getNombre() {
    return Nombre;
}

public String getDescripcion() {
    return Descripcion;
}

// public boolean getCapa() {
//     return Capa;
// }

public boolean isCapa() {
    return Capa;
}

@Override
public String toString(){
    return "Superheroe("+" Nombre: "+Nombre +", Descripcion: "+Descripcion +", Capa: "+ Capa+")";
}



} 
