/*Автомобили. Создать класс Car в пакете com.company.vehicles, Engine в пакете com.company.details и Driver в пакете com.company.professions. Класс Driver содержит поля - ФИО, стаж вождения.
Класс Engine содержит поля - мощность, производитель.
Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine. Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево". А также метод toString(), который выводит полную информацию об автомобиле, ее водителе и моторе.
Создать производный от Car класс  - Lorry (грузовик), характеризуемый также грузоподъемностью кузова. Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью. Пусть класс Driver расширяет класс Person. */

public class CarDemo {
    public static void main(String[] args) {
        Driwer bmwDriwer = new Driwer("Иванов В.В.", 50, false, 30);
        Engine bmwEngine = new Engine("60", "BMW");
        Car car = new Car("BMW", "C", 5000, bmwDriwer, bmwEngine);

        Driwer lorryDriver = new Driwer("Петров В.В.", 45, false, 20);
        Engine lorryEngine = new Engine("30", "LorryEngine");
        Lorry lorry = new Lorry("Грузовик", "D", 8000, lorryDriver, lorryEngine, 70);

        Driwer sportDriver = new Driwer("Сидоров В.В.", 30, false, 15);
        Engine sportEngine = new Engine("80", "SportEngine");
        SportCar sportCar = new SportCar("SportCar", "C", 4000, sportDriver, sportEngine, 300);

        System.out.println(car);
        System.out.println(lorry);
        System.out.println(sportCar);
    }
}