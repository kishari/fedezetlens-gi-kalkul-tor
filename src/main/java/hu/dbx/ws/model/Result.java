package hu.dbx.ws.model;


import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class Result {
	
	
	private PremiumList premiums = new PremiumList();
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

    @XmlElement(name = "premiums")
    public PremiumList getPremiums() {
        return premiums;
    }

    public void setPremiums(PremiumList premiums) {
        this.premiums = premiums;
    }

    public void addPremium(Premium premium) {
        this.getPremiums().getPremiumList().add(premium);
    }
}
