package Concrete;

import Abstarct.SaleService;
import Entities.User;
import Entities.Campaign;
import Entities.Game;

public class SaleManager implements SaleService {
	DiscountManager discountManager;
	
	public SaleManager(DiscountManager discountManager) {
		this.discountManager = discountManager;
	}

	@Override
	public void printingLastPrice(Game game, Campaign campaign, User user) {
		double result=discountManager.discountPriceCalculation(game.getGamePice(), campaign.getDiscount());
		System.out.println("+> "+user.getFirstName()+" "+user.getLastName()+ " '" 
				+ game.getGameName() + "' oyununu '"
				+ campaign.getCampaignName()+"' kampanyası ile "
				+ game.getGamePice() + " TL yerine " 
				+ result +" TL'ye satin aldı.");
	}

}
