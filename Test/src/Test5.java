// Вычислить сумму положительных элементов массива
// А после первого нуля (при наличии нуля)

public class Test5 {
    public static void main(String[] args) {
        int[]A={-1,2,5,8,7,-11,-6,4,-2};
        int sum=0;


        for (int i=0;i<A.length;i++){
            if (A[i]>0){
                sum=sum+A[i];
            }
        }
        System.out.println("Сумма полож.элементов массива: " +sum);

    }
}
