package Entities;

public class Campaign {
	private int Id;
	private String campaignName;
	private int discount;
	
	public Campaign(int id, String campaignName, int discount) {
		Id = id;
		this.campaignName = campaignName;
		this.discount = discount;
	}
	
	public int getId() {
		return Id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	

}
