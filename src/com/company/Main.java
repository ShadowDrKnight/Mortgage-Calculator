//Mortgage Calculator

package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Loan: ");
        double loan = input.nextDouble();

        System.out.print("Annual Interest Rate(%): ");
        double AIR = (input.nextDouble()/100); // Annual Interest Rate %
        double MIR = AIR /12; // monthly interest rate (1 year = 12 months)

        System.out.print("Period (Years): ");
        int period = input.nextInt();

        int payments = period * 12;

        double mortgage = loan * ((MIR * (Math.pow((1 + MIR), payments))) / ((Math.pow((1 + MIR), payments))-1)); // formula from https://www.wikihow.com/Calculate-Mortgage-Payments

        String result = NumberFormat.getCurrencyInstance().format(mortgage); // This method is only called once so we can chain it in one "single" command
        System.out.println("Monthly mortgage is: " + result);
    }
}