import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example User creation (modify as needed to get user details)
        System.out.println("Enter user name:");
        String userName = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        System.out.println("Enter weight (in kg):");
        double weight = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter fitness goal:");
        String fitnessGoal = scanner.nextLine();

        User user = new User(userName, age, weight, fitnessGoal);
        Tracker tracker = new Tracker(user);

        while (true) {
            System.out.println("Enter an option: (1) Add Food (2) Add Exercise (3) Show Summary (4) Exit");
            int option = 0;
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // clear the invalid input
                continue;
            }

            switch (option) {
                case 1:
                    System.out.println("Enter food name:");
                    String foodName = scanner.nextLine();
                    System.out.println("Enter calorie count:");
                    int calories = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    Food food = new Food(foodName, calories);
                    tracker.addFood(food);
                    System.out.println("Food added successfully!");
                    break;
                case 2:
                    System.out.println("Enter exercise type:");
                    String exerciseType = scanner.nextLine();
                    System.out.println("Enter duration in minutes:");
                    int duration = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    Exercise exercise = new Exercise(exerciseType, duration);
                    tracker.addExercise(exercise);
                    System.out.println("Exercise added successfully!");
                    break;
                case 3:
                    tracker.displayDailySummary();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
