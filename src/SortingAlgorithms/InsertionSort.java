package SortingAlgorithms;

public class InsertionSort {
    public static void main(String[] args) {

        int[] numeros = {1,6,4,3,2,1};

        for (int i = 1; i < numeros.length; i++) {
            int pos = i;
            int aux = numeros[i];
            while ((pos>0) && (numeros[pos-1]>aux)) {
                numeros[pos]=numeros[--pos];
            }
            numeros[pos]=aux;

        }


        for (int numero : numeros) {
            System.out.print(numero+", ");
        }
    }
}
