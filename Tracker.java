import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private List<Food> foodLog = new ArrayList<>();
    private List<Exercise> exerciseLog = new ArrayList<>();
    private User user; // User object to access user's weight

    public Tracker(User user) {
        this.user = user;
    }

    public void addFood(Food food) {
        foodLog.add(food);
    }

    public void addExercise(Exercise exercise) {
        exerciseLog.add(exercise);
    }

    public int getTotalCalories() {
        int total = 0;
        for (Food food : foodLog) {
            total += food.getCalories();
        }
        return total;
    }

    public int getCaloriesBurned() {
        int total = 0;
        for (Exercise exercise : exerciseLog) {
            total += calculateCaloriesBurned(exercise);
        }
        return total;
    }

    private int calculateCaloriesBurned(Exercise exercise) {
        double weight = user.getWeight();
        int duration = exercise.getDuration();
        double caloriesBurnedPerMinute;

        switch (exercise.getType().toLowerCase()) {
            case "running":
                caloriesBurnedPerMinute = 0.075 * weight;
                break;
            case "cycling":
                caloriesBurnedPerMinute = 0.055 * weight;
                break;
            // Add cases for other types of exercises
            default:
                caloriesBurnedPerMinute = 0.035 * weight; // Default calculation
        }

        return (int) (caloriesBurnedPerMinute * duration);
    }

    public void displayDailySummary() {
        System.out.println("Total Calories Consumed: " + getTotalCalories());
        System.out.println("Total Calories Burned: " + getCaloriesBurned());
        System.out.println("Net Calories: " + (getTotalCalories() - getCaloriesBurned()));
    }
}
