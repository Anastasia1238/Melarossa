//Факториалом числа натурального числа n называется произведение чисел от 1 до n включительно.
//Факториалом нуля называют единицу. Написать программу нахождения факториала данного числа.
//Реализовать через рекурсию и без рекурсии.
//Вывести на экран факториал N, N - введенное с клавиатуры число.
public class Test2 {
    public static void main(String[] args) {
        System.out.println(factorial(0));
    }
    public static int factorial(int F){
        int result=1;
        for (int i=1;i<=F;i++){
            result=result*i;
        }
        return  result;
    }
    public static int factoriale(int F){
        if (F<=0){
            return 1;
        }else {
            return F*factoriale(F-1);
        }

    }
}
