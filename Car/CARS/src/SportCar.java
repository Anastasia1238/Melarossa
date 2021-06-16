public class SportCar extends Car{
    private double speed;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public SportCar(String producer, String autoClass, double weight, Driver driver, Engene engene) {
        super(producer, autoClass, weight, driver, engene);
        this.speed=speed;

    }
    @Override
    public String toString() {
        return "SportCar{" + "speed=" + speed + "} " + super.toString();
    }
}
