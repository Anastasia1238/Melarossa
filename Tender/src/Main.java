import java.util.HashSet;

public class Main {
    public static Worker main(String[] args) {

        Worker worker = new Worker();
        HashSet<Skill> skillsHashSat = new HashSet<>();

        int maxSkill = 4;
        int minSkill = 1;
        int randomSkill = minSkill + (int) (Math.random()) * (maxSkill - minSkill);

        for (int i = 0; i <= randomSkill; i++) {
            int randomSkillNext = (int) (Math.random()) * Skill.values().length);
            skillsHashSat.add(Skill.values())[randomSkillNext];
        }

        worker.setSkillSat(skillsHashSat);
        int maxSalary=1000;
        int minSalary=700;
        int randomSalary=minSalary+(int) (Math.random())*(maxSalary-minSalary);

        worker.setSalary(randomSalary);
        return worker;
    }
    public static void brigade() {
        Brigade brigade = new Brigade();
        HashSet<Worker> brigadeHashSet = new HashSet<>();

        int maxBrigadePeople = 20;
        int minBrigadePeople = 11;
        int randomPeople = minBrigadePeople + (int) (Math.random()) * (maxBrigadePeople - minBrigadePeople);

        for (int i = 1; i <= randomPeople; i++) {
            brigadeHashSet.add(workerRandom());
        }

    }

    private static Worker workerRandom() {

    }

}

