package br.com.mariojp.solid.ocp;

public class DiscountFactory {

    public  static DiscountPolicy create(CustomerType type) {
        if (type == CustomerType.REGULAR) {
            return new RegularPolicy();
        } else if (type == CustomerType.PREMIUM) {
            return new PremiumPolicy();
        } else if (type == CustomerType.PARTNER) {
            return new PartnerPolicy();
        }
        return null;
    }
}
