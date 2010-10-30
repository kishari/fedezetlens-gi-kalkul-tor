package hu.dbx.ws.model.facts;

public class BaseTariffDef extends BaseDef {

	private String vehicleType;
	private Integer value;
	
	
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Integer getValue() {
		return value;
	}
}
