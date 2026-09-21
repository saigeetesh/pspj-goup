public class tracker {
    public static void main(String[] args) {

        int steps = 8500;

        System.out.println("===== FITNESS TRACKER =====");
        System.out.println("Steps: " + steps);

        if (steps >= 10000) {
            System.out.println("Fitness Status: Excellent");
        } else if (steps >= 7500) {
            System.out.println("Fitness Status: Good");
        } else if (steps >= 5000) {
            System.out.println("Fitness Status: Average");
        } else {
            System.out.println("Fitness Status: Need More Activity");
        }
    }
}
