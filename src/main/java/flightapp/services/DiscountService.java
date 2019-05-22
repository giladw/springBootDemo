package flightapp.services;

import flightapp.repositories.CouponRepository;

import java.util.Random;

public class DiscountService {
    private CouponRepository repository;
    Integer percentDiscounts[] = {10, 50, 60};

    public DiscountService(CouponRepository repository) {
        this.repository = repository;
    }

    public double getDiscount(int couponId, double price) {
        if (repository.isValidCoupon(couponId) == false)
            return price;
        else {
            Random Dice = new Random();
            int n = Dice.nextInt(percentDiscounts.length);
            int percentDiscount = percentDiscounts[n];

            return (price * (100 - percentDiscount)) / 100;
        }
    }

}




