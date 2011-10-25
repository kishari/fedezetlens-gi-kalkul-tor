package hu.dbx.ws.model;

/**
 * Created by IntelliJ IDEA.
 * User: Csaba Harangozó
 * Date: 2011.10.25.
 * Time: 10:14
 */
public class Premium {
    private Integer year;
    private Integer numOfDays;
    private Integer dailyPremium;
    private Integer totalPremium;

    public Premium(Integer year, Integer numOfDays, Integer dailyPremium, Integer totalPremium) {
        this.year = year;
        this.numOfDays = numOfDays;
        this.dailyPremium = dailyPremium;
        this.totalPremium = totalPremium;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getDailyPremium() {
        return dailyPremium;
    }

    public void setDailyPremium(Integer dailyPremium) {
        this.dailyPremium = dailyPremium;
    }

    public Integer getTotalPremium() {
        return totalPremium;
    }

    public void setTotalPremium(Integer totalPremium) {
        this.totalPremium = totalPremium;
    }

    public Integer getNumOfDays() {
        return numOfDays;
    }

    public void setNumOfDays(Integer numOfDays) {
        this.numOfDays = numOfDays;
    }
}
