public class tracker3 {


    static int totalSteps(int morning, int evening) {
        return morning + evening;
    }

    public static void main(String[] args) {

        int morningSteps = 4000;
        int eveningSteps = 4500;

        int total = totalSteps(morningSteps, eveningSteps);

        System.out.println("===== FITNESS TRACKER =====");
        System.out.println("Morning Steps: " + morningSteps);
        System.out.println("Evening Steps: " + eveningSteps);
        System.out.println("Total Steps: " + total);
    }
}


