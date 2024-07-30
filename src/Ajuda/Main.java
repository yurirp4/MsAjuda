package Ajuda;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import mkremins.fanciful.FancyMessage;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		ConsoleCommandSender c = Bukkit.getConsoleSender();
		c.sendMessage("§8===================");
		c.sendMessage("§7Nome:§7MsAjuda");
		c.sendMessage("§7Criador:§ayurirp4");
		c.sendMessage("§7Stats: §aAtivo");
		c.sendMessage("§7Versão: 1.0");
		c.sendMessage("§8===================");
		if (!new File(getDataFolder(), "config.yml").exists()) {
			saveDefaultConfig();
		}
	}

	@Override
	public void onDisable() {
		ConsoleCommandSender c = Bukkit.getConsoleSender();
		c.sendMessage("§8===================");
		c.sendMessage("§7Nome:§7MsAjuda");
		c.sendMessage("§7Criador:§cyurirp4");
		c.sendMessage("§7Stats: §cDesativado");
		c.sendMessage("§7Versão: §c1.0");
		c.sendMessage("§8===================");
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§cErro Voce Nao e Um Player");
			return true;
		}
		Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("ajuda"))
	    {
	      if (args.length == 0)
	      {
	        p.sendMessage("§4§cUse /ajuda [pagina]");
	        return true;
	      }
		if (args[0].equalsIgnoreCase("1")) {	
			 FancyMessage x = new FancyMessage("Ajuda")
	                	.color(ChatColor.YELLOW)
	                	.then("§8[§b»§8]")
	                 .tooltip("§aVAI PRA PROXIMA PAGINA")
	                 .command("/ajuda 2").tooltip("VAI PRA PROXIMA PAGINA ");
	                x.send(p);
			for (String msg : getConfig().getStringList("Pagina_1")) {
                p.sendMessage(msg.replace("&", "§"));
                }
		}
		}
			if (args[0].equalsIgnoreCase("2")) {
				 FancyMessage x = new FancyMessage("Ajuda")
		                	.color(ChatColor.YELLOW)
		                	.then("§8[§b»§8]")
		                 .tooltip("VAI PRA PROXIMA PAGINA")
		                 .command("/ajuda 3").tooltip("§aVAI PRA PROXIMA PAGINA ");
		                x.send(p);
			for (String msg : getConfig().getStringList("Pagina_2")) {
				p.sendMessage(msg.replace("&", "§"));
			}
				}
			if (args[0].equalsIgnoreCase("3")) {
				 FancyMessage x = new FancyMessage("Ajuda")
		                	.color(ChatColor.YELLOW)
		                	.then("§8[§b»§8]")
		                 .tooltip("§aVAI PRA PROXIMA PAGINA")
		                 .command("/ajuda 4").tooltip("VAI PRA PROXIMA PAGINA ");
		                x.send(p);
				for (String msg : getConfig().getStringList("Pagina_3")) {
					p.sendMessage(msg.replace("&", "§"));
				}
			}
			if (args[0].equalsIgnoreCase("4")) {
				 FancyMessage x = new FancyMessage("Ajuda")
		                	.color(ChatColor.YELLOW)
		                	.then("§8[§b»§8]")
		                 .tooltip("§aVAI PRA PROXIMA PAGINA")
		                 .command("/ajuda 5").tooltip("VAI PRA PROXIMA PAGINA ");
		                x.send(p);
				for (String msg : getConfig().getStringList("Pagina_4")) {
					p.sendMessage(msg.replace("&", "§"));
				}
			}
			if (args[0].equalsIgnoreCase("help")) {
				p.sendMessage("§a/ajuda [Pagina]");
				p.sendMessage("§a/ajuda list");
				p.sendMessage("§a/ajuda reload");
				p.sendMessage("§a/ajuda info");
				p.sendMessage("§a/ajuda ?");
			}
			if (args[0].equalsIgnoreCase("5")) {
				 FancyMessage x = new FancyMessage("Ajuda")
		                	.color(ChatColor.YELLOW)
		                	.then("§8[§b»§8]")
		                 .tooltip("§aVAI PRA PROXIMA PAGINA")
		                 .command("/ajuda 6").tooltip("VAI PRA PROXIMA PAGINA ");
		                x.send(p);
				for (String msg : getConfig().getStringList("Pagina_5")) {
					p.sendMessage(msg.replace("&", "§"));
				}
			}
			if (args[0].equalsIgnoreCase("6")) {
				 FancyMessage x = new FancyMessage("Ajuda")
		                	.color(ChatColor.YELLOW)
		                	.then("§8[§b»§8]")
		                 .tooltip("§aVAI PRA PROXIMA PAGINA")
		                 .command("/ajuda 7").tooltip("VAI PRA PROXIMA PAGINA ");
		                x.send(p);
				for (String msg : getConfig().getStringList("Pagina_6")) {
					p.sendMessage(msg.replace("&", "§"));
				}
			}
			if (args[0].equalsIgnoreCase("7")) {
				 FancyMessage x = new FancyMessage("Ajuda")
		                	.color(ChatColor.YELLOW)
		                	.then("§8[§b»§8]")
		                 .tooltip("§aVAI PRA PROXIMA PAGINA")
		                 .command("/ajuda 8").tooltip("VAI PRA PROXIMA PAGINA ");
		                x.send(p);
				for (String msg : getConfig().getStringList("Pagina_7")) {
					p.sendMessage(msg.replace("&", "§"));
				}
			}
			if (args[0].equalsIgnoreCase("8")) {
				 FancyMessage x = new FancyMessage("Ajuda")
		                	.color(ChatColor.YELLOW)
		                	.then("§8[§b»§8]")
		                 .tooltip("§aVAI PRA PROXIMA PAGINA")
		                 .command("/ajuda 9").tooltip("VAI PRA PROXIMA PAGINA ");
		                x.send(p);
				for (String msg : getConfig().getStringList("Pagina_8")) {
					p.sendMessage(msg.replace("&", "§"));
				}
			}
			if (args[0].equalsIgnoreCase("9")) {
				 FancyMessage x = new FancyMessage("Ajuda")
		                	.color(ChatColor.YELLOW)
		                	.then("§8[§b«§8]")
		                 .tooltip("§aVAI PRA Volta PAGINA")
		                 .command("/ajuda 8").tooltip("VAI PRA Volta PAGINA ");
		                x.send(p);
				for (String msg : getConfig().getStringList("Pagina_9")) {
					p.sendMessage(msg.replace("&", "§"));
				}
			}
			if (args[0].equalsIgnoreCase("list")) {
				p.sendMessage("§7Lista De Paginas");
				p.sendMessage("§apagina1 , pagina2 , pagina3 , pagina4 ,pagina 5");
				p.sendMessage("§apagina6 , pagina7 , pagina8 , pagina9");
				
			}
			if (args[0].equalsIgnoreCase("reload")) {
				if (!p.hasPermission("msajuda.reload")) {
					p.sendMessage("§cSem Permissão!");
					return true;
				}
					reloadConfig();
					p.sendMessage("§eMsAjuda Reiniciado Com Sucesso");
				}
			if (args[0].equalsIgnoreCase("?")) {
				p.sendMessage("§cExemplo: /ajuda 1");
			}
			if (args[0].equalsIgnoreCase("info")){
				p.sendMessage("§aAuthor: §7yurirp4");
				p.sendMessage("§aVersão: §71.0");
				p.sendMessage("§aSkype: §7Filipe silva amy");
				p.sendMessage("§aDescription: §7Um Plugin Para Ajudar os Players");
			}
			return false;
	}
}
