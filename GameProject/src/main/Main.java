package main;
import java.util.Date;

import Abstarct.UserCheckService;
import Adapters.MernisCheckAdapter;
import Concrete.CampaignManager;
import Concrete.DiscountManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		Game codMw3=new Game(1,"Call of Duty: Modern Warfare 3", 99);
		Game sniperGhost=new Game(2,"Sniper Ghost Warrior 2", 20);
		Game nfsMostWanted=new Game(3,"Need For Speed: Most Wanted", 129);
		Game gta5=new Game(4,"Grand Theft Auto V", 220);
		Game warface=new Game(5,"Warface", 40);
		GameManager gameManager=new GameManager();
		
		CampaignManager campaignManager=new CampaignManager();
		Campaign all30Percent=new Campaign(1, "Tüm oyunlarda %30 indirim", 30);
		Campaign war35Percent=new Campaign(2, "Savas oyunlarinda %35 indirim", 35);
		Campaign race45Percent=new Campaign(1, "Yaris oyunlarinda %45 indirim", 45);
				
		User zeyneb=new User(1, "Zeyneb Eda", "YILMAZ","12345678910",new Date(1998,9,20));
		User engin=new User(2, "Engin", "Demiroð","23456789101",new Date(1985,1,6));
		UserCheckService userCheckService=new MernisCheckAdapter();			
		UserManager userManager=new UserManager(userCheckService);
		userManager.userAdd(zeyneb);
		userManager.userAdd(engin);
		userManager.userUpdate(zeyneb);
		
		gameManager.add(codMw3);
		gameManager.add(nfsMostWanted);
		gameManager.add(sniperGhost);
		
		campaignManager.campaignAdd(war35Percent);
		campaignManager.campaignAdd(race45Percent);
		campaignManager.campaignAdd(all30Percent);
		
		DiscountManager discountManager=new DiscountManager();
		SaleManager saleManager=new SaleManager(discountManager);
		saleManager.printingLastPrice(codMw3,war35Percent, zeyneb);
		saleManager.printingLastPrice(nfsMostWanted, race45Percent, zeyneb);
		
		campaignManager.campaignDelete(all30Percent);
		campaignManager.campaignUpdate(race45Percent);
		gameManager.delete(sniperGhost);
		
		
	}

}
