public class BmiService {
    public double calcBmi(double heightM, double weightKg) {
        double bmi = weightKg / (heightM * heightM);
        return bmi;
    }

}


