public class Tracker1 {
    public static void main(String[] args) {

        int choice = 2;

        System.out.println("===== FITNESS TRACKER =====");
        System.out.println("Exercise Choice: " + choice);

        switch (choice) {
            case 1:
                System.out.println("Exercise: Walking");
                break;

            case 2:
                System.out.println("Exercise: Running");
                break;

            case 3:
                System.out.println("Exercise: Cycling");
                break;

            default:
                System.out.println("Invalid Exercise");
        }
    }
}
