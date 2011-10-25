package hu.dbx.ws.iface.model;


import java.util.ArrayList;
import java.util.List;

public class ResultV1 {

    private PremiumListV1 premiums = new PremiumListV1();
	private Integer numOfDays;
	private Integer totalPremium;
	

	public Integer getNumOfDays() {
		return numOfDays;
	}
	public void setNumOfDays(Integer numOfDays) {
		this.numOfDays = numOfDays;
	}
	public void setTotalPremium(Integer totalPremium) {
		this.totalPremium = totalPremium;
	}
	public Integer getTotalPremium() {
		return totalPremium;
	}

    public PremiumListV1 getPremiums() {
        return premiums;
    }

    public void setPremiums(PremiumListV1 premiums) {
        this.premiums = premiums;
    }

}
