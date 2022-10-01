package me.partlysunny.commands.subcommands;

import me.partlysunny.commands.RPGCommand;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import java.util.Collection;

public class HelpSubCommand implements RPGSubCommand {
    @Override
    public String getId() {
        return "help";
    }

    @Override
    public String getDescription() {
        return "Get a list of all commands.";
    }

    @Override
    public String getUsage() {
        return "";
    }

    @Override
    public void execute(CommandSender executor, String[] args) {
        Collection<RPGSubCommand> commands = RPGCommand.subCommands.values();
        executor.sendMessage(ChatColor.YELLOW + "List of commands (run with /sbl <command>):");
        for (RPGSubCommand c : commands) {
            executor.sendMessage(ChatColor.WHITE + c.getId() + c.getUsage() + ": " + c.getDescription());
        }
    }
}
