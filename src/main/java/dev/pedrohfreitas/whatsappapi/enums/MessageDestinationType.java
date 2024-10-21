package dev.pedrohfreitas.whatsappapi.enums;

public enum MessageDestinationType {

	PRIVATE("P"), GROUP("S");
	
	MessageDestinationType(String code){
		this.code = code;
	}
	private String code;
	
	public String getCode() {
		return this.code;
	}
}