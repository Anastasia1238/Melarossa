public class Car {
    private String producer;
    private String aClass;
    private double weight;
    private Driwer driwer;
    private Engine engine;

    public Car(String producer, String aClass, double weight, Driwer driwer, Engine engine) {
        this.producer = producer;
        this.aClass = aClass;
        this.weight = weight;
        this.driwer = driwer;
        this.engine = engine;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getaClass() {
        return aClass;
    }

    public void setaClass(String aClass) {
        this.aClass = aClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driwer getDriver() {
        return driwer;
    }

    public void setDriver(Driwer driwer) {
        this.driwer = driwer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", aClass='" + aClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driwer +
                ", engine=" + engine +
                '}';
    }
}
