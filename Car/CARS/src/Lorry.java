public class Lorry extends Car {

    private int carrying;

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public Lorry(String producer, String autoClass, double weight, Driver driver, Engene engene) {
        super(producer, autoClass, weight, driver, engene);
        this.carrying=carrying;
    }
    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                "} " + super.toString();
    }
}
