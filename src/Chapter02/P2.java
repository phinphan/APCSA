package Chapter02;

import java.util.Scanner;

/**
 * program finds the cost of dinner
 *
 * @author Joshua Plato
 */
public class P2 {

    /**
     * main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of the meal: $");
        double meal = input.nextDouble();
        System.out.print("Enter the price of the drink: $");
        double drink = input.nextDouble();
        System.out.print("Enter the price of the dessert: $");
        double dessert = input.nextDouble();

        double foodPrice = meal + drink + dessert;
        double salesTax = 0.10 * foodPrice;
        double tip = 0.15 * (foodPrice + salesTax);
        double totalCost = foodPrice + salesTax + tip;

        System.out.println("Price of food: $" + foodPrice);
        System.out.println("Sales tax: $" + salesTax);
        System.out.println("Tip: $" + tip);
        System.out.println("Total cost: $" + totalCost);
    }
}
