package com.communityhub.HubBot;

public class CommandDNEException extends Exception {

	private String msg = null;
	
	public CommandDNEException(String msg){
		this.msg = msg;
	}
}
