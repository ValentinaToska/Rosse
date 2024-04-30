package MortgageExample;

import java.util.Scanner;

public class Console {
    private static Scanner sc = new Scanner(System.in);
    public static double readOutput(String output){
        return sc.nextDouble();
    }

    public static double readOutput(String output, double min, double max) {
        double value;
        while (true) {
            System.out.println(output + ":");
            value = sc.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Set an interest rate between" + min + " and" + max);
        }
        return value;
    }
}
