public class tracker4 {
    
    public static void main(String[] args) {

        int[] steps = {8000, 9000, 7500, 10000, 8500};

        System.out.println("===== FITNESS TRACKER =====");

        for (int i = 0; i < steps.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + steps[i] + " steps");
        }
    }
}


