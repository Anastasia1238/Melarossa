//Реализовать сортировку пузырьком.
public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{1, 20, 12, 46, 35, 2, 8, 9, 7, 13};
        sort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
    public static void sort(int[]array){
        for (int i=0;i<array.length-1;i++){
            for (int k=array.length-1;k>i;k--){
                if (array[k-1]>array[k]){
                        int sd=array[k-1];
                        array[k-1]=array[k];
                        array[k]=sd;

                }
            }
        }
    }
}