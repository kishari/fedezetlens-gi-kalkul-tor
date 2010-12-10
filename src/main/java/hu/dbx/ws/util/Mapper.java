package hu.dbx.ws.util;

import java.util.ArrayList;
import java.util.List;

import hu.dbx.ws.iface.model.*;
import hu.dbx.ws.model.*;

public class Mapper {
	
	public static Query mapIn(QueryV1 queryV1) {
		Query q = new Query();
		q.setStartDate(queryV1.getStartDate());
		q.setCallerId(queryV1.getCallerId());
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
			v.setMaximumAllowedWeight(vehiclev1.getMaximumAllowedWeight());
			v.setMaximumNettoPower(vehiclev1.getMaximumNettoPower());
			
			v.setCubicCapacityNotDefined(vehiclev1.isCubicCapacityNotDefined());
		}
		return v;
	}
	
	/********************************************
	 * 				mapOut
	 *******************************************/
	
	public static QueryV1 mapOut(Query query) {
		QueryV1 q = new QueryV1();
		
		q.setCallerId(query.getCallerId());
		q.setStartDate(query.getStartDate());
		q.setEndDate(query.getEndDate());
		q.setVehicle(mapOut(query.getVehicle()));
		q.setResult(mapOut(query.getResult()));
		q.setMessages(mapOut(query.getMessages()));
		return q;
		
	}
	
	private static VehicleV1 mapOut(Vehicle vehicle) {
		VehicleV1 v = new VehicleV1();
		
		v.setCubicCapacity(vehicle.getCubicCapacity());
		v.setCarryingCapacity(vehicle.getCarryingCapacity());
		v.setTypeCode(vehicle.getTypeCode());
		v.setMaximumNettoPower(vehicle.getMaximumNettoPower());
		v.setMaximumAllowedWeight(vehicle.getMaximumAllowedWeight());
		
		v.setCubicCapacityNotDefined(vehicle.isCubicCapacityNotDefined());
		
		return v;
	}
	
	private static ResultV1 mapOut(Result result) {
		ResultV1 r = new ResultV1();
		
		r.setNumOfDays2010(result.getNumOfDays2010());
		r.setNumOfDays2011(result.getNumOfDays2011());
		
		r.setDailyPremium2010(result.getDailyPremium2010());
		r.setDailyPremium2011(result.getDailyPremium2011());
		
		r.setTotalPremium2010(result.getTotalPremium2010());
		r.setTotalPremium2011(result.getTotalPremium2011());
		
		r.setNumOfDays(result.getNumOfDays());
		r.setDailyPremium(result.getDailyPremium());
		r.setTotalPremium(result.getTotalPremium());
		
		return r;
	}
	
	private static MessageListV1 mapOut(MessageList messages) {
		List<MessageV1> list = new ArrayList<MessageV1>();
		MessageListV1 messagesV1 = new MessageListV1();
		for (Message m : messages.getMessages()) {
			list.add( mapOut(m) );
		}
		messagesV1.setMessages(list);
		
		return messagesV1;
	}
	
	private static MessageV1 mapOut(Message message) {
		MessageV1 messageV1 = new MessageV1();
		
		messageV1.setCode(message.getCode());
		messageV1.setSeverity(message.getSeverity());
		messageV1.setDescription(message.getDescription());
		messageV1.setContext(message.getContext());
		
		return messageV1;
	}
}
