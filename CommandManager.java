package com.communityhub.HubBot;

import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;

public class CommandManager {

	private final String token = "NdpTLf4Hqc4dqxv3LzBNjG6FpQxTruoO";
	private final String prefix = "/";
	
	private Command[] cmds = new Command[0];
	
	public CommandManager(){
		
	}
	
	public boolean tryCommand(User user, MessageChannel channel, Message msg){
		String msgRaw = msg.getContentRaw();
		String label = msgRaw.substring(0, msgRaw.indexOf(' '));
		
		for(Command c: cmds){
			if(c.compareTo(label)){
				c.execute(user, channel, msg);
				return true;
			}
		}
		return false;
	}
	
	public String getToken(){
		return token;
	}
	
	public String getPrefix(){
		return prefix;
	}
	
	public Command[] getCommands(){
		return cmds;
	}
	
	
}
