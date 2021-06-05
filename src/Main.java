public class Main {

    public static void main(String[] args) {
        Person man = new Person("Рик Санчез", 50);
        String manFullName = man.getFullName();
        int manAgg = man.getAgg();

        System.out.println("Полное имя:" + manFullName);
        System.out.println("Возраст:" + manAgg);
        System.out.println();
        man.move();
        man.talk();

    }

}


