package com.github.jakethegreat.noobhelper;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class CmdKillme implements CommandExecutor {
	public CmdKillme(Main plugin) {
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("killme")){ 
			if (!(sender instanceof Player)) {
				sender.sendMessage("This command can only be run by a player.");
			} else {
				if (args.length > 1) {
			           sender.sendMessage("Too many arguments!");
			           return false;
			        } 
			        if (args.length < 1) {
			           sender.sendMessage("Not enough arguments!");
			           return false;
			        }
		}
			Player target = (Player) sender;
			target.setHealth(0);
		return true;
}
		return false;
}
}
