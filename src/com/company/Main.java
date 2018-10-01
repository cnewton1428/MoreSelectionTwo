package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
//	 1. Read and sort letters (need array)
        //More Selection Control Structures

        //2. Process Customer Record
        Scanner input = new Scanner(System.in);

        System.out.println("Customer name");
        String Name = input.nextLine();

        System.out.println("Purchase amount: ");
        int Amount = input.nextInt();

        System.out.println("Tax Code: Please enter a number from 0 to 3");
        int TaxCode = input.nextInt();

        double tax = 0;
        if (TaxCode == 0) {
            tax = (Amount * 0.00);

        } else if (TaxCode == 1) {
            tax = (Amount * 0.03);

        } else if (TaxCode == 2) {
            tax = (Amount * 0.05);

        } else if (TaxCode == 3) {
            tax = (Amount * 0.07);
        }

            double Total = (tax + Amount);


            System.out.println("The Customer's name is " + Name +
                    "\nThe Purchase Amount is $" + Amount + "\nSales Tax is : " + tax + "\nTotal amount due is : $" + Total);
        }
    }
