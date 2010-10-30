package hu.dbx.ws.model.facts;

public class VehicleTypeDef extends BaseDef {

	private String typeCode;
	private String description;
	private String constantName;
		

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setConstantName(String constantName) {
		this.constantName = constantName;
	}

	public String getConstantName() {
		return constantName;
	}
}
