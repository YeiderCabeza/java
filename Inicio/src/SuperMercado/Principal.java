package SuperMercado;

import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<EsAlimento> lista = new ArrayList<>();

        Detergente det = new Detergente("Ariel",1.200);
        det.setPrecio(1000);
        det.setDescuento(10);
        det.setVolumen(100);
        det.setTipoEnvase("Plastico");
        System.out.println(det);


        Cereal Cere = new Cereal("Zucarita", "aguacate", 10000);
        Cere.setCaducidad(LocalDate.of(2034,07,04));
        // System.out.println("Este cereal contiene "+Cere.getCalorias()+" Calorias .");
        System.out.println(Cere);

        Vino Vino1 = new Vino("blue lader", "Frances", 5, 90.000);
        Vino1.setCaducidad(LocalDate.of(2099, 8, 22));
        System.out.println(Vino1.getCalorias());
        Vino1.setVolumen(10);
        Vino1.setTipoEnvase("Botella de vidrio");

        System.out.println(Vino1);

        lista.add(Vino1);
        lista.add(Cere);
       
        System.out.println(lista);

        int TotalCalorias = 0;
        for(EsAlimento Productos : lista){
            TotalCalorias += Productos.getCalorias();
        }
          System.out.println("El total de calorias es: "+TotalCalorias);



    }
}
