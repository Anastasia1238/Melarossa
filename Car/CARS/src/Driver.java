
public class Driver extends Person{
    private int experience;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Driver(String fullName, int age, int experience){
        super(fullName, age);
        this.experience=experience;
    }
    @Override
    public String toString(){
        return "Driver{"+
        "experience='" + experience + '\'' +
                "} " + super.toString();
    }
}
