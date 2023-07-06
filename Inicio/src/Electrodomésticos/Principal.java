package Electrodomésticos;

public class Principal {
    public static void main(String[] args) {
        
     Electrodomestico Ele1 = new Electrodomestico("Nebera", "Haceb", 0.67);
     Ele1.setTipo("Nevera");
     System.out.println(Ele1.getTipo());

     System.out.println(Ele1.getConsumo(10));
     System.out.println(Ele1.getCosteConsumo(10, 0.5));
    
    Lavadora lava1 = new Lavadora("Sonic", 20, 6.0, false);
    Lavadora lava2 = new Lavadora("Haceb",50,6.0, true);

    System.out.println(lava1);
    System.out.println(lava1.getConsumo(10));
    System.out.println(lava2.getConsumo(10));

    System.out.println(lava1.getCosteConsumo(30, 40));

    }
}
