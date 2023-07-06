package SuperHeroes;
public class Principal {

    public static void main(String[] args) {
        SuperHeroe super1 = new SuperHeroe("Spiderman");
        super1.setNombre("venom");
        super1.setDescripcion("igual a spiderman pero negro");

        // System.out.println("Nombre: "+super1.getNombre());
        // System.out.println("Descripcion: "+super1.getDescripcion());
        // System.out.println("Capa: "+super1.isCapa());

        System.out.println(super1);

        SuperHeroe super2 = new SuperHeroe("Batman");
        super2.setDescripcion("su superpoder es ser millonario ");
        super2.setCapa(true);

        System.out.println(super2.toString());

        SuperHeroe super3 = new SuperHeroe("Wonder woman");
        super3.setDescripcion(" princesa amazona");
        super3.setCapa(false);

        Dimension dim1 = new Dimension();
        dim1.setAlto(12);
        dim1.setAncho(32);
        dim1.setProfundida(16);

        Dimension dim2 = new Dimension(5, 20, 4);

        System.out.println(dim1.getVolumen());
        System.out.println(dim2.getVolumen());
        System.out.println(dim1.toString());
        System.out.println(dim2.toString());

        Figura fig1 = new Figura("abc12", 12000, super1, dim2);
        fig1.SubirPrecio(8000);
        System.out.println(fig1.toString());

        Figura fig2 = new Figura("abz32", 82000, super2, dim2);

        Figura fig3 = new Figura("zxw49", 97000, super3, dim2);
        

        Coleccion col1 = new Coleccion("Marvel");
        col1.AñadirFigura(fig1);
        System.out.println(col1.toString());    

        Coleccion col2 = new Coleccion("DC");
        col2.AñadirFigura(fig2);
         col2.AñadirFigura(fig3);
        System.out.println(col2.toString());

        System.out.println(col2.ConCapa());;
        
        System.out.println(col2.getValorColeccion());
        System.out.println(col2.getVolumenColeccion());


      
       

        

    }

}
