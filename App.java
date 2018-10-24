package com.communityhub.HubBot;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class App
{	
    public static void main( String[] args )throws Exception
    {
    	CommandListener cmdLsn = new CommandListener();
    	
    	@SuppressWarnings("deprecation")
		JDA jda = new JDABuilder(AccountType.BOT).setToken(cmdLsn.getCommandManager().getToken()).buildBlocking();
    	jda.addEventListener(cmdLsn);
    }
}
