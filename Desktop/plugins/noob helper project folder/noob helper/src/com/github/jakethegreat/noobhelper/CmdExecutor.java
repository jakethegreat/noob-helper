package com.github.jakethegreat.noobhelper;

//imports:
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
public class CmdExecutor implements CommandExecutor {
	//Main main;
    
	public CmdExecutor(Main plugin) {
		//main = new Main(main);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("kamikaze")){ 
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
			      
			        Player target = (Bukkit.getServer().getPlayer(args[0]));
			        if (target == null) {
			           sender.sendMessage(args[0] + " is not online or does not exist!");
			           return false;
			        }
			        
			        PlayerInventory inventory = target.getInventory(); // The player's inventory
			        ItemStack itemstack = new ItemStack(Material.TNT, 15 ); // A stack of tnt
			     
			        if (inventory.contains(itemstack)) {
			        float explosionPower = 4F; //This is the explosion power - TNT explosions are 4F by default
			        target.getWorld().createExplosion(target.getLocation(), explosionPower);
			        target.setHealth(0);
			        if (!inventory.contains(itemstack)) {
			        	sender.sendMessage("not enough tnt!");
			        	return false;
			        }
			}
			return true;
		} 
		}
		return false; 
	}
}


