package main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdHeal implements CommandExecutor {
	public CmdHeal(Main plugin) {
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("heal")){ 
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
			target.setHealth(10);
			target.setFoodLevel(10);
		return true;
}
		return false;
}
}
