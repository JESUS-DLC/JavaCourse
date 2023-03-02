package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int [] numeros = {2,5,1,3,4};
        System.out.println(numeros.length);

        for (int i = 0; i < numeros.length ; i++) {
            for (int j = 1; j < numeros.length-i ; j++) {
                if(numeros[j-1]>numeros[j]){
                   int aux = numeros[j];
                   numeros[j] = numeros[j-1];
                   numeros[j-1] = aux;
                }
            }
        }

        System.out.println(Arrays.toString(numeros));


    }
}
