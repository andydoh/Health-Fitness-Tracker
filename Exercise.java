public class Exercise {
    private String type;
    private int duration; // Duration in minutes

    public Exercise(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Getter for duration
    public int getDuration() {
        return duration;
    }

    // Setter for type
    public void setType(String type) {
        this.type = type;
    }

    // Setter for duration
    public void setDuration(int duration) {
        this.duration = duration;
    }
}
