import java.util.HashSet;

public class Brigade extends Worker {
    private int amountOfWokers;
    private int salaryBrigade;

    public Brigade(int salary, HashSet<Skill> skillHashSat) {
        super(salary, skillHashSat);
    }


    public int getAmountOfWokers() {
        return amountOfWokers;
    }

    public void setAmountOfWokers(int amountOfWokers) {
        this.amountOfWokers = amountOfWokers;
    }

    public int getSalaryBrigade() {
        return salaryBrigade;
    }

    public void setSalaryBrigade(HashSet<Worker> salaryBrigade) {
        this.salaryBrigade = salaryBrigade;
    }

    @Override
    public String toString() {
        return "Brigade{" +
                "amountOfWokers=" + amountOfWokers +
                ", salaryBrigade=" + salaryBrigade +
                '}';
    }
}

