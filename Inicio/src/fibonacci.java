// import java.util.Scanner;

// public class fibonacci {
// // 0 1 2 3 5 8 13 21 34 55 89

//     public static void main(String[] args) {
//         int tamaño = 0;
//         int inicial = 0;
//         int variable = 1; 

//         System.out.println("Digite el tamaño de la fibonacci");
//         Scanner teclado = new Scanner(System.in);
//         tamaño = teclado.nextInt();
//         System.out.println("el tamaño del fibonacci " + tamaño);

//         for (int i = 0; i < tamaño; i++) {
//             if(tamaño >= variable){
//               int resultado = inicial + variable;
//               inicial = variable;
//               variable = resultado;
//               System.out.println(variable);
//             //   resultado = inicial + variable;
//             }
           
//         }
//     }

// }

public class fibonacci {
    public static void main(String[] args) {
        int n = 10; // Número hasta el cual generar la secuencia de Fibonacci

        System.out.println("Secuencia de Fibonacci hasta " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
