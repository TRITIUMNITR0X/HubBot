package com.communityhub.HubBot;

import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class CommandListener extends ListenerAdapter{
	
	CommandManager cmdMngr = new CommandManager();
	
	@Override
    public void onMessageReceived(MessageReceivedEvent e){
    	
    	User user = e.getAuthor();
    	MessageChannel chnl = e.getChannel();
    	Message msg = e.getMessage();
    	
    	/*
    	 * Attempts to execute a matching command
    	 * 
    	 * true : command was executed
    	 * false : command was not executed and user receives a failture message
    	 */
    	if(! cmdMngr.tryCommand(user, chnl, msg))
    		chnl.sendMessage("Unrecognized command! " + user.getAsMention()).queue();
    	
	}
	
	public CommandManager getCommandManager(){
		return cmdMngr;
	}
	
}

