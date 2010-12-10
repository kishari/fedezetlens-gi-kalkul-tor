package hu.dbx.ws.model;


public class Result {
	
	
	private Integer numOfDays2010;
	private Integer numOfDays2011;
	
	private Integer totalPremium2010;
	private Integer totalPremium2011;
	
	private Integer dailyPremium2010;
	private Integer dailyPremium2011;
	
	private Integer numOfDays; //= numOfDays2010 + numOfDays2011
	private Integer dailyPremium; // = dailyPremium2010 + dailyPremium2011
	private Integer totalPremium; // = totalPremium2010 + totalPremium2011
	

	public Integer getNumOfDays2010() {
		return numOfDays2010;
	}
	public void setNumOfDays2010(Integer numOfDays2010) {
		this.numOfDays2010 = numOfDays2010;
	}
	public Integer getNumOfDays2011() {
		return numOfDays2011;
	}
	public void setNumOfDays2011(Integer numOfDays2011) {
		this.numOfDays2011 = numOfDays2011;
	}
	public Integer getTotalPremium2010() {
		return totalPremium2010;
	}
	public void setTotalPremium2010(Integer totalPremium2010) {
		this.totalPremium2010 = totalPremium2010;
	}
	public Integer getTotalPremium2011() {
		return totalPremium2011;
	}
	public void setTotalPremium2011(Integer totalPremium2011) {
		this.totalPremium2011 = totalPremium2011;
	}
	public Integer getDailyPremium2010() {
		return dailyPremium2010;
	}
	public void setDailyPremium2010(Integer dailyPremium2010) {
		this.dailyPremium2010 = dailyPremium2010;
	}
	public Integer getDailyPremium2011() {
		return dailyPremium2011;
	}
	public void setDailyPremium2011(Integer dailyPremium2011) {
		this.dailyPremium2011 = dailyPremium2011;
	}
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
}
