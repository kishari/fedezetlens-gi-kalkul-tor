package hu.dbx.ws.model;


public class Result {
	
	private Integer numOfDays;
	private Integer totalPremium;
	private Integer dailyPremium;
	

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
