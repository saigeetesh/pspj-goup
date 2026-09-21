
public class Fitness {
    public static void main(String[] args) {

        String name = "Sai";
        int age = 18;
        double weight = 70;
        double height = 70;

        double heightMeter = height / 100;
        double bmi = weight / (heightMeter * heightMeter);

        System.out.println("===== FITNESS TRACKER =====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " cm");
        System.out.println("BMI: " + bmi);
    }
}


