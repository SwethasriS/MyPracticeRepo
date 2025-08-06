public class FinancialForecast {

    // Recursive function to predict future value
    public static double predictFutureValue(double presentValue, double rate, int years) {
        if (years == 0) return presentValue;
        return predictFutureValue(presentValue, rate, years - 1) * (1 + rate);
    }

    // Optimized version using Memoization (to avoid recomputation)
    public static double predictWithMemo(double presentValue, double rate, int years, Double[] memo) {
        if (years == 0) return presentValue;
        if (memo[years] != null) return memo[years];
        memo[years] = predictWithMemo(presentValue, rate, years - 1, memo) * (1 + rate);
        return memo[years];
    }

    public static void main(String[] args) {
        double initialAmount = 10000;     // ₹10,000 initial investment
        double annualGrowthRate = 0.07;   // 7% per year
        int forecastYears = 5;

        System.out.println("📈 Financial Forecast (Recursive):");
        for (int i = 0; i <= forecastYears; i++) {
            double result = predictFutureValue(initialAmount, annualGrowthRate, i);
            System.out.printf(" Year %d: ₹%.2f\n", i, result);
        }

        // With optimization (memoization)
        Double[] memo = new Double[forecastYears + 1];
        System.out.println("\n🧠 Financial Forecast with Memoization:");
        for (int i = 0; i <= forecastYears; i++) {
            double result = predictWithMemo(initialAmount, annualGrowthRate, i, memo);
            System.out.printf(" Year %d: ₹%.2f\n", i, result);
        }

        System.out.println("\n👩‍💻 Created by Swetha Sri – 6427409");
    }
}
