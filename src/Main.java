public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calcBmi(1.80, 86);
        System.out.println("Ваш индекс массы тела - " + bmi);
    }
}