package main;

//imports:
import org.bukkit.plugin.java.JavaPlugin;
import java.io.*;

public final class Main extends JavaPlugin {
	//variables:
	public int tntNeeded;
    @Override
    public void onEnable(){
    	
   if (!getDataFolder().exists()){
	   getDataFolder().mkdir(); 
	   
   }
   
   File configFile = new File(getDataFolder() + "config.yml");
		getLogger().info("Enabling noob helper 1.1");
		getCommand("kamikaze").setExecutor(new CmdExecutor(this));
		getCommand("killme").setExecutor(new CmdKillme(this));
		if(configFile.exists())
			this.saveDefaultConfig();
		{
		String path = this.getDataFolder() + "/config.yml";
		if(!configFile.exists())
		{
			getLogger().info("config.yml does not exist. Creating a new one...");
		  
		  int integer = 15;
		this.getConfig().set(path + "tnt needed to use /kamikaze:" , integer);
		}
		tntNeeded = (int)getConfig().getInt("tnt needed to use /kamikaze:");
		this.saveConfig();
		
		}

    getLogger().info("Done");
    }
 
    @Override
    public void onDisable() {
    	getLogger().info("Disabling noob helper 1.1");
    	//disabling stuff...
    	getLogger().info("Done");
    }
}