/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 */
/*
How many euros are you exchanging? 81
        What is the exchange rate? 1.3751
        81 euros at an exchange rate of 1.3751 is
        111.38 U.S. dollars.

        c_to / c_from = rate
        c_to is the amount in U.S. dollars.
        c_from is the amount in euros.
        rate is the per-unit current exchange rate from c_from to c_to.
*/


import java.util.*;
public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //Scanner method declared

        //Variables that are going to be used
        int euros;
        double rate;
        double dollars;

        System.out.print("How many euros are you exchanging? ");
        euros = in.nextInt();

        System.out.print("What is the exchange rate? ");
        rate = in.nextDouble();



        dollars = (rate * euros);

        System.out.println(euros + " euros at an exchange rate of " + rate + " is \n " + dollars + " U.S dollars.");

    }
}
