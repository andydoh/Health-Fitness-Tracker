public class Food {
    private String name;
    private int calories;

    public Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    // Corrected getter for calories
    public int getCalories() {
        return calories;
    }

    // Setter for calories
    public void setCalories(int calories) {
        this.calories = calories;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
}
