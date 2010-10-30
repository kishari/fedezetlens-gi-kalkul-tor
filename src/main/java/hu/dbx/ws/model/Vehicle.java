package hu.dbx.ws.model;

public class Vehicle {
	
	private String typeCode;
	private Integer cubicCapacity;
	private Integer seatingCapacity;
	private Integer carryingCapacity;
	private Integer maximumPower = null; //amíg nem használatos, legyen null
	

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

	public void setMaximumPower(Integer maximumPower) {
		this.maximumPower = maximumPower;
	}
	public Integer getMaximumPower() {
		return maximumPower;
	}
}
