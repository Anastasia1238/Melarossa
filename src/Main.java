public class Main {
    public static void main(String[] args) {
        Animals[] a = new Animals[3];
        a[0] = new Dog();
        a[1] = new Cat();
        a[2] = new Horse();

        System.out.println(a[0]);
    }

}

class Animals {
    String food;
    String location;

    public void sleep() {
        System.out.println("Животное спит:");
    }

    public void eat() {
        System.out.println("Животное ест");
    }

    public void makeNoise() {
        System.out.println("Животное издает звук");
    }

    public Animals(String food, String location) {
        this.food = food;
        this.location = location;
    }

    Animals() {
    }
}

class Cat extends Animals {
    int indulge;

    @Override
    public void eat() {
        System.out.println("Fish");
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу");
    }
}

class Dog extends Animals {
    int write;

    @Override
    public void eat() {
        System.out.println("Bone");
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав");
    }
}

class Horse extends Animals {
    int speed;

    @Override
    public void eat() {
        System.out.println("Grass");
    }

    @Override
    public void makeNoise() {
        System.out.println("Иго-го");
    }
}

class Veterinar extends Animals {

    public void treatAnimal() {
        this.food = food;
        this.location = location;
        System.out.println();

    }


}


