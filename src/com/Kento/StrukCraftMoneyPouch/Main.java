/* Copywrite Kenton Vizdos
 * 2016-~
 * github.com/kvizdos
 */ 

package com.Kento.StrukCraftMoneyPouch;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin implements Listener {
	
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
	}
	
	public void onDisable() {
		
	}
	
	
	private void openMP(Player p) {
		Inventory mp = Bukkit.createInventory(null, 27, ChatColor.GOLD + "Money Pouch");

		ItemStack ICB = new ItemStack(Material.NETHER_STAR);
		ItemMeta ICBM = ICB.getItemMeta();
		
	    ArrayList<String> Lore = new ArrayList<String>();
		Lore.add(ChatColor.GRAY + "Will show the balance and commands for the money pouch.");
		
		ICBM.setDisplayName(ChatColor.BLUE + "Iron Crown Balance" + ChatColor.GRAY + " *Left Click*");
		ICBM.setLore(Lore);
		ICB.setItemMeta(ICBM);
		
		ItemStack SSB = new ItemStack(Material.PRISMARINE_SHARD);
		ItemMeta SSBM = SSB.getItemMeta();
		
	    ArrayList<String> LoreSSB = new ArrayList<String>();
		Lore.add(ChatColor.GRAY + "Will show the balance and commands for the money pouch.");
		
		SSBM.setDisplayName(ChatColor.DARK_PURPLE + "Struk-Shard Balance" + ChatColor.GRAY + " *Left Click*");
		SSBM.setLore(LoreSSB);
		SSB.setItemMeta(SSBM);
		
		
		ItemStack Locked = new ItemStack(Material.BARRIER);
		ItemMeta LockedM = Locked.getItemMeta();
		
		LockedM.setDisplayName(ChatColor.RED + "Locked");
		Locked.setItemMeta(LockedM);

		mp.setItem(0, Locked);
		mp.setItem(1, Locked);
		mp.setItem(2, Locked);
		mp.setItem(3, Locked);
		mp.setItem(4, Locked);
		mp.setItem(5, Locked);
		mp.setItem(6, Locked);
		mp.setItem(7, Locked);
		mp.setItem(8, Locked);
		mp.setItem(12, ICB);
		mp.setItem(14, SSB);
		mp.setItem(18, Locked);
		mp.setItem(19, Locked);
		mp.setItem(20, Locked);
		mp.setItem(21, Locked);
		mp.setItem(22, Locked);
		mp.setItem(23, Locked);
		mp.setItem(24, Locked);
		mp.setItem(25, Locked);
		mp.setItem(26, Locked);


		p.openInventory(mp);
	}
	
	private void openIC(Player p) {
		Inventory IC = Bukkit.createInventory(null, 27, ChatColor.GOLD + "Money Pouch");

		ItemStack BAL = new ItemStack(Material.NETHER_STAR);
		ItemMeta BALM = BAL.getItemMeta();
				
		BALM.setDisplayName(ChatColor.BLUE + "Iron Crown Balance" + ChatColor.WHITE + " : " + ChatColor.GRAY + "" + getConfig().getString("PlayerData." + p.getName() + ".IronCrownBal"));
		BAL.setItemMeta(BALM);
		
		ItemStack Locked = new ItemStack(Material.BARRIER);
		ItemMeta LockedM = Locked.getItemMeta();
		
		LockedM.setDisplayName(ChatColor.RED + "Locked");
		Locked.setItemMeta(LockedM);

		// HELP
		ItemStack H = new ItemStack(Material.SIGN);
		ItemMeta HM = H.getItemMeta();
		
	    ArrayList<String> LoreH = new ArrayList<String>();
		LoreH.add(ChatColor.DARK_PURPLE + "*" + ChatColor.GRAY + "/mp pay [player] [currency] [amount]");
		LoreH.add(ChatColor.DARK_PURPLE + "*" + ChatColor.GRAY + "/mp dropall [currency]");
		LoreH.add(ChatColor.WHITE + "Do " + ChatColor.GRAY + "/help " + ChatColor.WHITE + "to get more information on these commands.");
		HM.setDisplayName(ChatColor.WHITE + "Commands For Money Pouch");
		HM.setLore(LoreH);
		H.setItemMeta(HM);
		
		IC.setItem(0, Locked);
		IC.setItem(1, Locked);
		IC.setItem(2, Locked);
		IC.setItem(3, Locked);
		IC.setItem(4, Locked);
		IC.setItem(5, Locked);
		IC.setItem(6, Locked);
		IC.setItem(7, Locked);
		IC.setItem(8, Locked);
		IC.setItem(12, BAL);
		IC.setItem(14, H);
		IC.setItem(18, Locked);
		IC.setItem(19, Locked);
		IC.setItem(20, Locked);
		IC.setItem(21, Locked);
		IC.setItem(22, Locked);
		IC.setItem(23, Locked);
		IC.setItem(24, Locked);
		IC.setItem(25, Locked);
		IC.setItem(26, Locked);
		p.openInventory(IC);
	}

	private void openSS(Player p) {
		Inventory SS = Bukkit.createInventory(null, 27, ChatColor.GOLD + "Money Pouch");

		ItemStack BAL = new ItemStack(Material.PRISMARINE_SHARD);
		ItemMeta BALM = BAL.getItemMeta();
				
		BALM.setDisplayName(ChatColor.DARK_PURPLE + "Struk Shard Balance" + ChatColor.WHITE + " : " + ChatColor.GRAY + "" + getConfig().getString("PlayerData." + p.getName() + ".StrukShardBal"));
		BAL.setItemMeta(BALM);
		
		ItemStack Locked = new ItemStack(Material.BARRIER);
		ItemMeta LockedM = Locked.getItemMeta();
		
		LockedM.setDisplayName(ChatColor.RED + "Locked");
		Locked.setItemMeta(LockedM);

		// HELP
		ItemStack H = new ItemStack(Material.SIGN);
		ItemMeta HM = H.getItemMeta();
		
	    ArrayList<String> LoreH = new ArrayList<String>();
		LoreH.add(ChatColor.DARK_PURPLE + "*" + ChatColor.GRAY + "/mp pay [player] [currency] [amount]");
		LoreH.add(ChatColor.DARK_PURPLE + "*" + ChatColor.GRAY + "/mp dropall [currency]");
		LoreH.add(ChatColor.WHITE + "Do " + ChatColor.GRAY + "/help " + ChatColor.WHITE + "to get more information on these commands.");
		HM.setDisplayName(ChatColor.WHITE + "Commands For Money Pouch");
		HM.setLore(LoreH);
		H.setItemMeta(HM);
		
		SS.setItem(0, Locked);
		SS.setItem(1, Locked);
		SS.setItem(2, Locked);
		SS.setItem(3, Locked);
		SS.setItem(4, Locked);
		SS.setItem(5, Locked);
		SS.setItem(6, Locked);
		SS.setItem(7, Locked);
		SS.setItem(8, Locked);
		SS.setItem(12, BAL);
		SS.setItem(14, H);
		SS.setItem(18, Locked);
		SS.setItem(19, Locked);
		SS.setItem(20, Locked);
		SS.setItem(21, Locked);
		SS.setItem(22, Locked);
		SS.setItem(23, Locked);
		SS.setItem(24, Locked);
		SS.setItem(25, Locked);
		SS.setItem(26, Locked);
		p.openInventory(SS);
	}

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {
		Action a = e.getAction();
		ItemStack is = e.getItem();
		
		if(a == Action.PHYSICAL || is == null || is.getType() == Material.AIR)
			return;
		
		if(is.getType() == Material.RABBIT_HIDE)
			openMP(e.getPlayer());
	}
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		if(!e.getInventory().getName().equalsIgnoreCase(ChatColor.GOLD + "Money Pouch"))
			return;
		Player p = (Player) e.getWhoClicked();
		e.setCancelled(true);
		
		if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR || !e.getCurrentItem().hasItemMeta()) 
			return;
		
		switch(e.getCurrentItem().getType()) {
		case NETHER_STAR:
			e.setCancelled(true);
			openIC(p);
			break;
			
		case PRISMARINE_SHARD:
			e.setCancelled(true);
			openSS(p);
			break;
		default:
			return;
				
		}

		
		
	}

	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		if(getConfig().contains("PlayerData." + p.getName())) {
			p.sendMessage(ChatColor.GREEN + "You Have " + getConfig().getString("PlayerData." + p.getName() + ".IronCrownBal") + " Iron Crowns and " + getConfig().getString("PlayerData." + p.getName() + ".StrukShardBal") + " Struk-Shards");
		} else {
			getConfig().set("PlayerData." + p.getName() + ".IronCrownBal", 0);
			getConfig().set("PlayerData." + p.getName() + ".StrukShardBal", 0);
			saveConfig();
			p.sendMessage(ChatColor.GREEN + "You Have 0 Iron Crowns and 0 Struk-Shards");

		}
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("mp")) {
			if (args.length == 0) {
				p.sendMessage(ChatColor.GOLD + "Money Pouch" + ChatColor.WHITE + "" + ChatColor.BOLD + "► " + ChatColor.GREEN + " Please do /mp pay <strukshard/ironcrown> <player> <amount>");
				return true;
			} else if(args[0].equalsIgnoreCase("open")) {
				openMP(p);
				return true;
			} else if(args[0].equalsIgnoreCase("pay")) {
			if(args.length == 0) {
				p.sendMessage(ChatColor.GOLD + "Money Pouch" + ChatColor.WHITE + "" + ChatColor.BOLD + "► " + ChatColor.GREEN + " Please do /mp pay <strukshard/ironcrown> <player> <amount>");
			} else if(args[1].equalsIgnoreCase("ironcrown")) {
				Player target = Bukkit.getPlayer(args[2]);
				if(target != null) {
					int amount = Integer.parseUnsignedInt(args[3]);
					if(target != Bukkit.getPlayer(p.getName())) {
					if(getConfig().getInt("PlayerData." + p.getName() + ".IronCrownBal") >= amount) {
						getConfig().set("PlayerData." + p.getName() + ".IronCrownBal", getConfig().getInt("PlayerData." + p.getName() + ".IronCrownBal") - amount);
						getConfig().set("PlayerData." + target.getName() + ".IronCrownBal", getConfig().getInt("PlayerData." + target.getName() + ".IronCrownBal") + amount);
						saveConfig();
						
						p.sendMessage(ChatColor.GOLD + "Money Pouch" + ChatColor.WHITE + "" + ChatColor.BOLD + "► " + ChatColor.GRAY + amount + " Iron Crowns " + ChatColor.WHITE + "were sent to " + ChatColor.GRAY + "" + target.getName());
						target.sendMessage(ChatColor.GOLD + "Money Pouch" + ChatColor.WHITE + "" + ChatColor.BOLD + "► " + ChatColor.GRAY + amount + " Iron Crowns " + ChatColor.WHITE + "were sent to you by " + ChatColor.GRAY + "" + p.getName());


						return true;
					} else {
						p.sendMessage(ChatColor.GOLD + "Money Pouch" + ChatColor.WHITE + "" + ChatColor.BOLD + "► " + ChatColor.RED + " You do not have sufficient funds!");
						return true;
					}
					} else if(p.isOp()){
						getConfig().set("PlayerData." + target.getName() + ".IronCrownBal", getConfig().getInt("PlayerData." + target.getName() + ".IronCrownBal") + amount);
						saveConfig();
						
						p.sendMessage(ChatColor.GOLD + "Money Pouch" + ChatColor.WHITE + "" + ChatColor.BOLD + "► " + ChatColor.GRAY + amount + " Iron Crowns " + ChatColor.WHITE + "were sent to your balance!");

						return true;
					} else {
						p.sendMessage(ChatColor.GOLD + "Money Pouch" + ChatColor.WHITE + "" + ChatColor.BOLD + "► " + ChatColor.RED + " You cannot send money to yourself!");
						return true;
					}
				} else {
					p.sendMessage(ChatColor.GOLD + "Money Pouch" + ChatColor.WHITE + "" + ChatColor.BOLD + "► " + ChatColor.RED + " Please specify a valid Player!");
					return true;
				}
			} 
			if(args[1].equalsIgnoreCase("strukshard")) {
				Player target = Bukkit.getPlayer(args[2]);
				int amount = Integer.parseUnsignedInt(args[3]);
				if(target != null) {
					if(target != Bukkit.getPlayer(p.getName())) {
						if(getConfig().getInt("PlayerData." + p.getName() + ".StrukShardBal") >= amount) {
							getConfig().set("PlayerData." + p.getName() + ".StrukShardBal", getConfig().getInt("PlayerData." + p.getName() + ".StrukShardBal") - amount);
							getConfig().set("PlayerData." + target.getName() + ".StrukShardBal", getConfig().getInt("PlayerData." + target.getName() + ".StrukShardBal") + amount);
							saveConfig();
							
							p.sendMessage(ChatColor.GOLD + "Money Pouch" + ChatColor.WHITE + "" + ChatColor.BOLD + "► " + ChatColor.GRAY + amount + " Struk-Shards " + ChatColor.WHITE + "were sent to " + ChatColor.GRAY + "" + target.getName());
							target.sendMessage(ChatColor.GOLD + "Money Pouch" + ChatColor.WHITE + "" + ChatColor.BOLD + "► " + ChatColor.GRAY + amount + " Struk-Shards " + ChatColor.WHITE + "were sent to you by " + ChatColor.GRAY + "" + p.getName());
	
							return true;
						} else {
							p.sendMessage(ChatColor.GOLD + "Money Pouch" + ChatColor.WHITE + "" + ChatColor.BOLD + "► " + ChatColor.RED + " You do not have sufficient funds!");
							return true;
						}
					  } else if(p.isOp()){
							getConfig().set("PlayerData." + target.getName() + ".StrukShardBal", getConfig().getInt("PlayerData." + target.getName() + ".StrukShardBal") + amount);
							saveConfig();
							
							p.sendMessage(ChatColor.GOLD + "Money Pouch" + ChatColor.WHITE + "" + ChatColor.BOLD + "► " + ChatColor.GRAY + amount + " Struk-Shards " + ChatColor.WHITE + "were sent to your balance!");

							return true;
						} else {
							p.sendMessage(ChatColor.GOLD + "Money Pouch" + ChatColor.WHITE + "" + ChatColor.BOLD + "► " + ChatColor.RED + " You cannot send money to yourself!");
							return true;
						}
				}else {
					p.sendMessage(ChatColor.GOLD + "Money Pouch" + ChatColor.WHITE + "" + ChatColor.BOLD + "► " + ChatColor.RED + " Please specify a valid Player!");
					return true;
				}
				} else {
					p.sendMessage(ChatColor.GOLD + "Money Pouch" + ChatColor.WHITE + "" + ChatColor.BOLD + "► " + ChatColor.RED + " Invalid Currency! Currency Types: ironcrown / strukshard");
					return true;
				}
			}
			} 

		
		return false;
	}

}
