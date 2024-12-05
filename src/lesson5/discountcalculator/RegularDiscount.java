package lesson5.discountcalculator;

public class RegularDiscount implements IDiscountStrategy {

    @Override
    public double calculateDiscount(double initialAmount) {
        return initialAmount * 0.05;
    }
}
