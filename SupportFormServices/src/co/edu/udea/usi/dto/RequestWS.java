package co.edu.udea.usi.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RequestWS {

	public String getEventTime() {
		return eventTime;
	}
	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTypeRequest() {
		return typeRequest;
	}
	public void setTypeRequest(String typeRequest) {
		this.typeRequest = typeRequest;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private String eventTime;
	private String user;
	private String office;
	private String description;
	private String typeRequest;
	private String channel;
	private int priority;
	private int level;
	private String state;
}
