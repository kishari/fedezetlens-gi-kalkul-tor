package hu.dbx.ws.iface.model;


import java.util.ArrayList;
import java.util.List;

public class ResultV1 {

    private List<PremiumV1> premiums = new ArrayList<PremiumV1>();
	private Integer numOfDays; //= numOfDays2010 + numOfDays2011
	private Integer dailyPremium; // = dailyPremium2010 + dailyPremium2011
	private Integer totalPremium; // = totalPremium2010 + totalPremium2011
	

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

    public List<PremiumV1> getPremiums() {
        return premiums;
    }

    public void setPremiums(List<PremiumV1> premiums) {
        this.premiums = premiums;
    }
}
