public class Lorry extends Car {
    private double liftingCapacity;

    public Lorry(String producer, String aClass, double weight, Driwer driver, Engine engine, double liftingCapacity) {
        super(producer, aClass, weight, driver, engine);
        this.liftingCapacity = liftingCapacity;
    }

    public double getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(double liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "liftingCapacity=" + liftingCapacity +
                "} " + super.toString();
    }
}