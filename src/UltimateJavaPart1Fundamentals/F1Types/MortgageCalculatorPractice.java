package UltimateJavaPart1Fundamentals.F1Types;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;
        System.out.print("Principle: ");
        int principle = input.nextInt(); //p
        System.out.print("Annual Interest Rate : ");
        float annualInterest = input.nextFloat();
        float monthlyInterest =  annualInterest / PERCENT /MONTHS_IN_YEAR;//r
        System.out.print("Period(Years): ");
        byte year = input.nextByte();
        int numberOfPayments =  year * MONTHS_IN_YEAR; //n

        double mortgage = principle * (monthlyInterest*Math.pow((1+monthlyInterest),numberOfPayments))/(Math.pow((1+monthlyInterest),numberOfPayments)-1);
        String mortgageFormated = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormated);
    }
}
/*
* mortgage = p * (r*(1+r)^n)/((1+r)^n -1)
*
*
*/