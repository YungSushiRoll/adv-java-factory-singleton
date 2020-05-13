package singleton.calculator;

public class ThreadSafeCalcTool extends Thread {

    private static int totalBMICalculated = 0;
    private static int numberOfCalculations = 0;

    public static double calcBMI(double height, double weight, MeasurementSystem measurementSystem) {
        double bmi = weight / Math.pow(height, 2);
        if (measurementSystem == MeasurementSystem.ENGLISH) {
            bmi *= 703;
        }
        totalBMICalculated += bmi;
        numberOfCalculations++;

        return bmi;
    }


    public void averageBMI() {
        start();
    }

    @Override
    public void run() {
        // CalcTool calcTool = CalcTool.getInstance();
        EnumCalcTool calcTool = EnumCalcTool.INSTANCE;
        double aveBMI = (totalBMICalculated / numberOfCalculations);
        System.out.println(aveBMI);
    }
}
