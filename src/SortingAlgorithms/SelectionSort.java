package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] numeros = {2,5,1,3,4};

        for (int i = 0; i < numeros.length ; i++) {
            int minIndex = i;
            for (int j = i+1; j < numeros.length; j++) {
                if(numeros[minIndex]>numeros[j]){
                    minIndex= j;
                }
            }
                    int aux = numeros[i];
                    numeros[i] = numeros[minIndex];
                    numeros[minIndex] = aux;


        }

        System.out.println(Arrays.toString(numeros));
    }
}
