public class Main {

    public static void main(String[] args) {
        int[] array = { 32, 2, 98, 65, 43, 1, 45, 67 };
        // int[] array = {32,2,98,65,43,1,45,67};
        // int[] array = {2,32,98,65,43,1,45,67};
        // int[] array = {2,32,65,98,43,1,45,67};
        // int[] array = {2,32,65,43,98,1,45,67};
        // int[] array = {2,32,65,43,1,98,45,67};
        // int[] array = {2,32,65,43,1,45,98,67};
        // int[] array = {2,32,65,43,1,45,67,98};

        for (int item : array) {
            System.out.println(item);
        }
        int[] resultado = OrdenarNumero(array);
        System.out.println();
        for (int item : resultado) {
            System.out.println(item);
        }
    }

    public static int[] OrdenarNumero(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            // System.out.println("el valor de i "+i);
            for (int j = i + 1; j < lista.length; j++) {
                // System.out.println("el valor de j "+j);
                if (lista[i] > lista[j]) {
                    int anterior = lista[i];// 3
                    int nuevoMenor = lista[j];// 2
                    lista[i] = nuevoMenor;// 2
                    lista[j] = anterior;// 3
                }
            }
        }

        return lista;
    }

}
