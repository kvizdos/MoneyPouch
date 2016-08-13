/* Copywrite Kenton Vizdos
 * 2016-~
 * github.com/kvizdos
 */ 

package com.Kento.StrukCraftMoneyPouch;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class MPExecutor implements CommandExecutor{

	private final Main PLUGIN;

	public MPExecutor(Main plugin) {
		this.PLUGIN = plugin;
	}	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player p = (Player) sender;

		if (cmd.getName().equalsIgnoreCase("mp")) {
			if (args.length == 0) {
				p.sendMessage(ChatColor.GREEN + "Money Pouch: Please do /mp <open/pay>");
				return true;
			} else if(args[0].equalsIgnoreCase("open")) {

			}
		}
		return false;
	}
}
