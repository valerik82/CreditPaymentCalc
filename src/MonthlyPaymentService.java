public class MonthlyPaymentService {
    public double calculate(double percent, int creditPeriod, int creditSum) {
        double monthlyRate = (percent / (100 * 12));
        double annuityPayment = creditSum * (monthlyRate / (1 - Math.pow((1 + monthlyRate), (-1 * creditPeriod))));
        return annuityPayment;


    }
}
