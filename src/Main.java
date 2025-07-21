public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 74;
        double heightMeters = 1.57;

        int bmiValue = service.calculate(weightKg, heightMeters);
        System.out.println("BMI: " + bmiValue);
    }
}