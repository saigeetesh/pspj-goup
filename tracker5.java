public class tracker5 {
    public static void main(String[] args) {

        int[][] fitness = {
            {8000, 300},
            {9000, 350},
            {7500, 280},
            {10000, 400},
            {8500, 320}
        };

        System.out.println("===== FITNESS TRACKER =====");

        for (int i = 0; i < fitness.length; i++) {
            System.out.println("Day " + (i + 1)
                    + " - Steps: " + fitness[i][0]
                    + ", Calories: " + fitness[i][1]);
        }
    }
}

