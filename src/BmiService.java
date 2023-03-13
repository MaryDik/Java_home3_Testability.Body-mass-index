public class BmiService {

    public double calculate(double kgMass, double meterGrowth) {
        double result;
        result = kgMass / (meterGrowth * meterGrowth);
        return result;
    }
}

