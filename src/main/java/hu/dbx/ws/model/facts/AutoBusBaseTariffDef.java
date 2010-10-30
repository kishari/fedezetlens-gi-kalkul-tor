package hu.dbx.ws.model.facts;

public class AutoBusBaseTariffDef extends BaseDef {

	private Integer seatingCapacityMin;
	private Integer seatingCapacityMax;
	private Integer value;
	
	
	public Integer getSeatingCapacityMin() {
		return seatingCapacityMin;
	}
	public void setSeatingCapacityMin(Integer seatingCapacityMin) {
		this.seatingCapacityMin = seatingCapacityMin;
	}
	public Integer getSeatingCapacityMax() {
		return seatingCapacityMax;
	}
	public void setSeatingCapacityMax(Integer seatingCapacityMax) {
		this.seatingCapacityMax = seatingCapacityMax;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	
	
}
