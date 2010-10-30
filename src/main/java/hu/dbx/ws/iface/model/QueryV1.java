package hu.dbx.ws.iface.model;

import java.util.Date;

import hu.dbx.ws.iface.model.VehicleV1;

public class QueryV1 {

	private Date startDate;
	private Date endDate;
	
	private VehicleV1 vehicle;
	private ResultV1 result;

	public void setVehicle(VehicleV1 vehicle) {
		this.vehicle = vehicle;
	}

	public VehicleV1 getVehicle() {
		return vehicle;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setResult(ResultV1 result) {
		this.result = result;
	}

	public ResultV1 getResult() {
		return result;
	}
}
