package dev.pedrohfreitas.whatsappapi.enums;

public enum MessageStatus {
	PENDING("P"), SENT("S");
	
	MessageStatus(String code){
		this.code = code;
	}
	private String code;
	
	public String getCode() {
		return this.code;
	}

}
