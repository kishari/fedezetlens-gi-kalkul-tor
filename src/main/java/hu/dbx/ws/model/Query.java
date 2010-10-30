package hu.dbx.ws.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

public class Query {

	private String callerId;
	private Date startDate;
	private Date endDate;
	
	private Vehicle vehicle;
	private Result result = new Result();
	
	private MessageList messages = new MessageList();

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setMessages(MessageList messages) {
		this.messages = messages;
	}

	@XmlElement(name = "messages")
	public MessageList getMessages() {
		return messages;
	}
	
	public void addMessage(Message message) {
		this.messages.getMessages().add(message);
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public Result getResult() {
		return result;
	}

	public void setCallerId(String callerId) {
		this.callerId = callerId;
	}

	public String getCallerId() {
		return callerId;
	}
}
