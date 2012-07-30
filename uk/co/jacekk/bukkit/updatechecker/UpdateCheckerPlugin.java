package uk.co.jacekk.bukkit.updatechecker;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class UpdateCheckerPlugin extends JavaPlugin {
	
	protected Logger log;
	
	public void onEnable(){
		this.log = this.getLogger();
		
		UpdateChecker checker = new UpdateChecker(this, "http://dev.bukkit.org/server-mods/bloodmoon/files.rss");
		
		if (checker.updateNeeded()){
			this.log.info("A new verison is available: " + checker.getVersion());
			this.log.info("Get it from: " + checker.getLink());
			this.log.info("Direct Link: " + checker.getJarLink());
		}
	}
	
}
