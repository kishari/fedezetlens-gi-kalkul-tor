package hu.dbx.ws.util;

import hu.dbx.ws.iface.model.*;
import hu.dbx.ws.model.*;

public class Mapper {
	
	public static Query mapIn(QueryV1 queryV1) {
		Query q = new Query();
		q.setStartDate(queryV1.getStartDate());
		q.setEndDate(queryV1.getEndDate());
		q.setVehicle(mapIn(queryV1.getVehicle()));
		
		return q;
	}
	
	private static Vehicle mapIn(VehicleV1 vehiclev1) {		
		Vehicle v = new Vehicle();
		if (vehiclev1 != null) {
			v.setTypeCode(vehiclev1.getTypeCode());
			v.setCarryingCapacity(vehiclev1.getCarryingCapacity());
			v.setCubicCapacity(vehiclev1.getCubicCapacity());
			v.setSeatingCapacity(vehiclev1.getSeatingCapacity());
		}
		return v;
	}
	
	/********************************************
	 * 				mapOut
	 *******************************************/
	
	public static QueryV1 mapOut(Query query) {
		QueryV1 q = new QueryV1();
		
		q.setStartDate(query.getStartDate());
		q.setEndDate(query.getEndDate());
		q.setVehicle(mapOut(query.getVehicle()));
		q.setResult(mapOut(query.getResult()));
		
		return q;
		
	}
	
	private static VehicleV1 mapOut(Vehicle vehicle) {
		VehicleV1 v = new VehicleV1();
		
		v.setCubicCapacity(vehicle.getCubicCapacity());
		v.setCarryingCapacity(vehicle.getCarryingCapacity());
		v.setTypeCode(vehicle.getTypeCode());
		
		return v;
	}
	
	private static ResultV1 mapOut(Result result) {
		ResultV1 r = new ResultV1();
		
		r.setDailyPremium(result.getDailyPremium());
		r.setNumOfDays(result.getNumOfDays());
		r.setTotalPremium(result.getTotalPremium());
		
		return r;
	}
}
