package MortgageExample;

import java.util.Scanner;

public class Mortgage {

    public static void main(String[] args) {
        final  byte Months_In_Year = 12;
        final  byte Percent = 100;



        Scanner sc = new Scanner(System.in);
        System.out.println("Your name is ?");
        String name = sc.next();
        System.out.println("Your surname is ?");
        String surname = sc.next();

        int principal= (int) Console.readOutput("Principal" , 1000 ,1000000);
        double interest = Console.readOutput("Interest rate " ,1,30);
        int year =(int) Console.readOutput("Number of year " ,1,30);

        double monthlyPayment = MortgageCalculate.calculateMonthlyPayment();
        MortgageReport.printPayment(monthlyPayment);
        MortgageReport.printBalancmonth();
    }

}
