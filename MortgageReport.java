package MortgageExample;

import java.text.NumberFormat;

public class MortgageReport {
    private static NumberFormat currency;
    private static MortgageCalculate calculator;
    public MortgageReport (MortgageCalculate calculator){
        this.calculator =calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public  void printBalancmonth() {
        for (double balance : calculator.getRemainingBalances()) ;
        System.out.println(currency.format(balance));

        }

    }

