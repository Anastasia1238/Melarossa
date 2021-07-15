// Вывести на консоль N Чисел Фибоначчи используя рекурсию и без рекурсии.
//Числа Фибоначчи – это ряд чисел, в котором каждое последующее
// число равно сумме двух предыдущих: 1, 1, 2, 3, 5, 8, 13 и т. д.
public class Test1 {
    public static void main(String[] args) {
        int[]array=new int[10];
        array[0]=0;
        array[1]=1;
        for (int i=2;i<array.length;i++){
            array[i]=array[i-1]+array[i-2];
        }
        for (int i=0;i<array.length;++i){
            System.out.println(array[i]);

        }

    }
    public static int Fibonacci(int n) {
        if (n <= 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);

        }
    }
}