package SortingAlgorithms;

public class BinarySearch {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(array.length);
        int target = 8;
        System.out.println("busqeda");
        int busqueda = binarySearch(array, target);

        if (busqueda!=1) {
            System.out.println("el elemento que buscaste esta en la posicion: "+busqueda);
        }else{
            System.out.println("no fue encontrado tu elemento");
        }
    }

    // low , high y middle son indices
    public static int binarySearch(int[] array,int target) {
        int low =0;
        int high= array.length-1;

        while(low<high){
            int middle = (low +high)/2;
            if(array[middle]==target){
                return middle;
            }
            else if(array[middle]>target){
                high = middle-1;
            }else{
                low = middle+1;
            }
        }

        return -1;
    }
}
