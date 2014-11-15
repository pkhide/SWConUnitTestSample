package camt.testexercise;

/**
 * Created by Dto on 11/16/2014.
 */
public class VendingMachine {
    private Manager manager = new Manager();

    public double calculateTotalPrice(double price) {
        double totalPrice = price * (1 + manager.getVat() / 100);
        double fraction = totalPrice - (int) totalPrice;
        double newFraction = 0;
        if (fraction > .75) {
            newFraction = 1;
        } else if (fraction > .5) {
            newFraction = .75;
        } else if (fraction > .25) {
            newFraction = .5;
        } else
            newFraction = .25;
        return (int) totalPrice + newFraction;

    }
}
