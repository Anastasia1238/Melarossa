public class Car {
    private String producer;
    private String autoClass;
    private double weight;
    private Driver driver;
    private Engene engene;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getAutoClass() {
        return autoClass;
    }

    public void setAutoClass(String autoClass) {
        this.autoClass = autoClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engene getEngene() {
        return engene;
    }

    public void setEngene(Engene engene) {
        this.engene = engene;
    }

    public Car(String producer, String autoClass, double weight, Driver driver, Engene engene){
        this.producer=producer;
        this.autoClass=autoClass;
        this.weight=weight;
        this.driver=driver;
        this.engene=engene;
    }
    public void start() {
        System.out.println("Едем");
    }

    public void stop() {
        System.out.println("Стоп");
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
                "producer='" + producer + '\'' + ", aClass='" + autoClass + '\'' + ", weight=" + weight + ", driver=" + driver + ", engine=" + engene + '}';
    }

}
