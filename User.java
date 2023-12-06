public class User {
    private String name;
    private int age;
    private double weight;
    private String fitnessGoal;

    public User(String name, int age, double weight, String fitnessGoal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.fitnessGoal = fitnessGoal;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for weight
    public double getWeight() {
        return weight;
    }

    // Setter for weight
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Getter for fitness goal
    public String getFitnessGoal() {
        return fitnessGoal;
    }

    // Setter for fitness goal
    public void setFitnessGoal(String fitnessGoal) {
        this.fitnessGoal = fitnessGoal;
    }
}
