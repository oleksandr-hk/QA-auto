package lesson5.discountcalculator;

public class VipDiscount implements IDiscountStrategy {

    @Override
    public double calculateDiscount(double initialAmount) {
        return initialAmount * 0.10;
    }
}
