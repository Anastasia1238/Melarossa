
import java.util.HashMap;
import java.util.HashSet;

public class Tender extends Brigade {
    public static void main(String[] args) {

    }
    public Tender(int salary, HashSet<Skill> skillHashSat) {
        super(salary, skillHashSat);

        HashMap<Skill, Integer> workerBridade = new HashMap<>();

        workerBridade.put(Skill.TILERS, 3);
        workerBridade.put(Skill.ROOFER, 2);
        workerBridade.put(Skill.MASON, 4);
        workerBridade.put(Skill.ELECTRICIAN, 3);
        workerBridade.put(Skill.GLAZIER, 1);

        System.out.println(workerBridade);
    }
}


