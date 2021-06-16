public class Demo {
    public static void main(String[] args) {
        Driver BMVdriver = new Driver("Рик Санчез", 52, 20);
        Engene BMVengene = new Engene("180", "BMW");
        Car car = new Car("BMW", "LUX", 2000, BMVdriver, BMVengene);

        Driver UFOdriver = new Driver("ZZZZzzz", 32, 20);
        Engene UFOengene = new Engene("5623", "UFO");
        Lorry lorry = new Lorry("UFO", "Star", 879, UFOdriver, UFOengene);

        Driver SPORTdriver=new Driver("Огурчик Рик",52,21);
        Engene SPORTengene=new Engene("120","SportCar");
        SportCar sportCar=new SportCar("SportCAR","Quick",3000,SPORTdriver,SPORTengene);

System.out.println(car);
System.out.println(lorry);
System.out.println(sportCar);
    }
}