package hu.dbx.ws.iface.model;

public class VehicleV1 {
	
	private String typeCode;
	private Integer cubicCapacity;
	private Integer seatingCapacity;
	private Integer carryingCapacity;
	
	
	public Integer getCubicCapacity() {
		return cubicCapacity;
	}
	public void setCubicCapacity(Integer cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}
	public Integer getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(Integer seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	public Integer getCarryingCapacity() {
		return carryingCapacity;
	}
	public void setCarryingCapacity(Integer carryingCapacity) {
		this.carryingCapacity = carryingCapacity;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public String getTypeCode() {
		return typeCode;
	}

}
