package hu.dbx.ws.model;


import java.util.ArrayList;
import java.util.List;

public class Result {
	
	
	private List<Premium> premiumList = new ArrayList<Premium>();
	private Integer numOfDays;
	private Integer dailyPremium;
	private Integer totalPremium;


	public Integer getNumOfDays() {
		return numOfDays;
	}
	public void setNumOfDays(Integer numOfDays) {
		this.numOfDays = numOfDays;
	}
	public void setDailyPremium(Integer dailyPremium) {
		this.dailyPremium = dailyPremium;
	}
	public Integer getDailyPremium() {
		return dailyPremium;
	}
	public void setTotalPremium(Integer totalPremium) {
		this.totalPremium = totalPremium;
	}
	public Integer getTotalPremium() {
		return totalPremium;
	}

    public List<Premium> getPremiumList() {
        return premiumList;
    }

    public void setPremiumList(List<Premium> premiumList) {
        this.premiumList = premiumList;
    }
}
