
import java.util.Scanner;

public class App {

    private int Sumar(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    };

    private int Restar(int num1, int num2) {
        int resultado = num1 - num2;
        return resultado;
    };

    private int Multiplicar(int num1, int num2) {
        int resultado = num1 * num2;
        return resultado;
    };

    private int Dividir(int num1, int num2) {
        int resultado = num1 / num2;
        return resultado;
    };

    public static void main(String[] args) {
        App aplicacion = new App();
        System.out.println("Calculadora");
        System.out.println("-----------------------------");
        int num1 = 0;
        int num2 = 0;
        boolean validacion = true;

        try {
            Scanner Scanner = new Scanner(System.in);
            System.out.println("Bienvenido :)");
            while (validacion == true) {

                System.out.println("Que operacion desea realizar?");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");

                int Opcion = Scanner.nextInt();

                if (Opcion < 0) {
                    System.out.println("Debe de ser un numero valido, por favor intente nuevamente! ");
                } else if (Opcion == 5) {
                    System.out.println("Gracias por utilizar este programa !!");
                    validacion = false;
                } else {
                    System.out.println("Digita el primer numero: ");
                    num1 = Scanner.nextInt();
                    System.out.println("Digita el segundo numero: ");
                    num2 = Scanner.nextInt();
                }

                if (Opcion == 1) {
                    System.out.println(aplicacion.Sumar(num1, num2));
                } else if (Opcion == 2) {
                    System.out.println(aplicacion.Restar(num1, num2));
                } else if (Opcion == 3) {
                    System.out.println(aplicacion.Multiplicar(num1, num2));
                } else if (Opcion == 4) {
                    System.out.println(aplicacion.Dividir(num1, num2));
                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
