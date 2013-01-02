package com.github.jakethegreat.noobhelper;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CmdBuildHut implements CommandExecutor
{

	public CmdBuildHut(Main main) {
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("killme")){ 
		//make a square dirt house
			return true;
		}
		return false;
	}

}
