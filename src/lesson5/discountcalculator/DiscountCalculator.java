package lesson5.discountcalculator;

public class DiscountCalculator {
    private IDiscountStrategy discountStrategy;

    public DiscountCalculator(IDiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public IDiscountStrategy getDiscountStrategy(CustomerType customerType) throws Exception {
        switch (customerType) {
            case VIP -> {
                return new VipDiscount();
            }
            case REGULAR -> {
                return new RegularDiscount();
            }
            case EMPLOYEE -> {
                return new EmployeeDiscount();
            }
            default -> throw new Exception("Unsupported customer type");
        }
    }
}
