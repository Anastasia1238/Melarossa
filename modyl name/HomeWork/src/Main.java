public class Main {

        public static void main(String[] args) {


            Card cr = new Card();
            String crName = cr.getName();
            long crNuber = cr.getNumber();
            long crBulans = cr.getBalans();

            System.out.println("Имя владельца карты:" + crName);
            System.out.println("Номеркарты карты:" + crNuber);
            System.out.println("Баланс счета:" + crBulans);

        }
    }







