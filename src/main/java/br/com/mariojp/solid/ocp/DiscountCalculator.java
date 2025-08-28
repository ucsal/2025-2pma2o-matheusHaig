package br.com.mariojp.solid.ocp;

public class DiscountCalculator {
    public double apply(double amount, CustomerType type) {
        DiscountPolicy policy = DiscountFactory.create(type);
        if (policy != null) {
            return policy.apply(amount);
        }
        return amount;
    }
}
