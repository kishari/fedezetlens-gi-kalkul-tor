package hu.dbx.ws.model.facts;

public class MotorBikeBaseTariffDef extends BaseDef {

	private Integer powerMin;
	private Integer powerMax;
	private Integer cubicCapacityMin;
	private Integer cubicCapacityMax;
	private Integer value;
	
		
	public Integer getValue() {
		return value;
	}
	
	public void setValue(Integer value) {
		this.value = value;
	}

	public void setPowerMin(Integer powerMin) {
		this.powerMin = powerMin;
	}

	public Integer getPowerMin() {
		return powerMin;
	}

	public void setPowerMax(Integer powerMax) {
		this.powerMax = powerMax;
	}

	public Integer getPowerMax() {
		return powerMax;
	}

	public void setCubicCapacityMin(Integer cubicCapacityMin) {
		this.cubicCapacityMin = cubicCapacityMin;
	}

	public Integer getCubicCapacityMin() {
		return cubicCapacityMin;
	}

	public void setCubicCapacityMax(Integer cubicCapacityMax) {
		this.cubicCapacityMax = cubicCapacityMax;
	}

	public Integer getCubicCapacityMax() {
		return cubicCapacityMax;
	}

}
