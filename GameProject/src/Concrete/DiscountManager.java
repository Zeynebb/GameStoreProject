package Concrete;

import Abstarct.DiscountService;

public class DiscountManager implements DiscountService{

	@Override
	public double discountPriceCalculation(double gamePrice, int campaignDiscount) {
		double result=(gamePrice*campaignDiscount)/100;
		return result;
	}

}
