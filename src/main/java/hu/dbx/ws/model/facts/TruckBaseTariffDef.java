package hu.dbx.ws.model.facts;

public class TruckBaseTariffDef extends BaseDef {

	private Integer allowedWeightMin;
	private Integer allowedWeightMax;
	private Integer carryingCapacityMin;
	private Integer carryingCapacityMax;
	private Integer value;
	

	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public void setAllowedWeightMin(Integer allowedWeightMin) {
		this.allowedWeightMin = allowedWeightMin;
	}
	public Integer getAllowedWeightMin() {
		return allowedWeightMin;
	}
	public void setAllowedWeightMax(Integer allowedWeightMax) {
		this.allowedWeightMax = allowedWeightMax;
	}
	public Integer getAllowedWeightMax() {
		return allowedWeightMax;
	}
	public void setCarryingCapacityMin(Integer carryingCapacityMin) {
		this.carryingCapacityMin = carryingCapacityMin;
	}
	public Integer getCarryingCapacityMin() {
		return carryingCapacityMin;
	}
	public void setCarryingCapacityMax(Integer carryingCapacityMax) {
		this.carryingCapacityMax = carryingCapacityMax;
	}
	public Integer getCarryingCapacityMax() {
		return carryingCapacityMax;
	}
	
}
