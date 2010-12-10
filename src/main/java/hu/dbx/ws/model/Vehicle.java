package hu.dbx.ws.model;

public class Vehicle {
	
	private String typeCode;
	private Integer cubicCapacity;
	private Integer seatingCapacity;
	private Integer carryingCapacity;
	private Integer maximumNettoPower;
	private Integer maximumAllowedWeight;
	private boolean cubicCapacityNotDefined;
	

	public void setCubicCapacity(Integer cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}
	public Integer getCubicCapacity() {
		return cubicCapacity;
	}
	public void setSeatingCapacity(Integer seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	public Integer getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setCarryingCapacity(Integer carryingCapacity) {
		this.carryingCapacity = carryingCapacity;
	}
	public Integer getCarryingCapacity() {
		return carryingCapacity;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public String getTypeCode() {
		return typeCode;
	}

	public void setMaximumAllowedWeight(Integer maximumAllowedWeight) {
		this.maximumAllowedWeight = maximumAllowedWeight;
	}
	public Integer getMaximumAllowedWeight() {
		return maximumAllowedWeight;
	}
	public void setMaximumNettoPower(Integer maximumNettoPower) {
		this.maximumNettoPower = maximumNettoPower;
	}
	public Integer getMaximumNettoPower() {
		return maximumNettoPower;
	}
	public void setCubicCapacityNotDefined(boolean cubicCapacityNotDefined) {
		this.cubicCapacityNotDefined = cubicCapacityNotDefined;
	}
	public boolean isCubicCapacityNotDefined() {
		return cubicCapacityNotDefined;
	}
}
