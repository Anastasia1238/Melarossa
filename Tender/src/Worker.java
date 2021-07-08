
import java.util.HashSet;

public class Worker {

    private HashSet<Skill> skillHashSat;
    private int salary;

    public Worker(int salary,HashSet<Skill> skillHashSat){
        this.salary=salary;
        this.skillHashSat=skillHashSat;
    }

    public Worker() {

    }

    public HashSet<Skill> getSkillHashSat() {
        return skillHashSat;
    }

    public void setSkillHashSat(HashSet<Skill> skillHashSat) {
        this.skillHashSat = skillHashSat;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "skillHashSat=" + skillHashSat +
                ", salary=" + salary +
                '}';
    }

    public void setSkillSat(HashSet<Skill> skillsHashSat) {
    }
}