package MortgageExample;

public class MortgageCalculate {
    private final static byte Months_In_Year = 12;
    private final static byte Percent = 100;
    private static double interest;
    private static int year;
    private static int principal;

    public MortgageCalculate(double interest, int year, int principal) {
        this.interest = interest;
        this.year = year;
        this.principal = principal;
    }

    public static double calculateBalance(int totalPaymants) {
        final double monthlyInterestRate = getMonthlyInterestRate();
        final int numberOfPayments = getNumberOfPayments();
        double balance = principal * (Math.pow(1 + monthlyInterestRate, numberOfPayments) - Math.pow(1 + monthlyInterestRate, totalPaymants)
                / Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        return balance;
    }

    public double getInterest() {
        return interest;
    }
    public static int getPrincipal() {
        return principal;
    }
    public double[] getRemainingBalances() {
        var balances = new double[getNumberOfPayments()];
        for (short month = 1; month < year * balances.length; month++) {
            balances[month - 1] = calculateBalance(month);
        }
        return balances;
    }
    private static int getNumberOfPayments() {
        return year * Months_In_Year;
    }

    private static double getMonthlyInterestRate() {
        return interest / Months_In_Year /Percent;
    }

    public static double calculateMonthlyPayment() {
        final double monthlyInterestRate = getMonthlyInterestRate();
        final int numberOfPayments = getNumberOfPayments();

        double monthlyPayment = principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        return monthlyPayment;
    }


}
