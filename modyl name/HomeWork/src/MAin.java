import java.util.Scanner;

public class MAin {
    public static void main(String[] args) {

        int day = getTime();
        if (day >= 6 && day <= 12) {
            System.out.println("Good morning!:");

        } else if (day >= 12 && day <= 16) {
            System.out.println("Good day!:");

        } else if (day >= 16 && day <= 20) {
            System.out.println("Good evening!:");

        } else {
            System.out.println("Good night!");
        }
    }

    public static int getTime() {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите время:");
        int time;
        time = in.nextInt();
        if (time > 24 | time < 0) {
            System.out.println("Неверное время:");
            getTime();
        }
        return time;
    }
}
