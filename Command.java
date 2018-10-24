package com.communityhub.HubBot;

import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;

public class Command {
	
	public String label = null;
	
	public Command(){
		
	}
	
	public boolean compareTo(String otherLabel){
		if(this.label.equalsIgnoreCase(otherLabel))
			return true;
		return false;
	}

	public void execute(User user, MessageChannel channel, Message msg) {
		// TODO Auto-generated method stub
		
	}
	
	
}
