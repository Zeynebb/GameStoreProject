package Concrete;

import Abstarct.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void campaignAdd(Campaign campaign) {
		System.out.println(">> '"+ campaign.getCampaignName()+"' isimli kampanya eklendi.");
	}

	@Override
	public void campaignDelete(Campaign campaign) {
		System.out.println(">> '"+campaign.getCampaignName()+"' isimli kampanya silindi.");
	}

	@Override
	public void campaignUpdate(Campaign campaign) {
		System.out.println(">> '"+campaign.getCampaignName()+"' isimli kampanya güncellendi.");
	}

}
