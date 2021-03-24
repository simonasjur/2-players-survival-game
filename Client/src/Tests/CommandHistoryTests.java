package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Command.Command;
import Command.CommandChangePlayerColor;
import Command.CommandHistory;
import edu.ktu.signalrclient.Player;

class CommandHistoryTests {

	@Test
	void testCommandHistoryPush() {
		CommandHistory commandHistory = new CommandHistory();
		Player player = new Player();
		Command command = new CommandChangePlayerColor(player);
		
		commandHistory.push(command);
		
		assertEquals(false, commandHistory.isEmpty());
	}
	
	@Test
	void testCommandHistoryPop() {
		CommandHistory commandHistory = new CommandHistory();
		Player player = new Player();
		Command command = new CommandChangePlayerColor(player);
		
		commandHistory.push(command);
		commandHistory.pop();
		
		assertEquals(true, commandHistory.isEmpty());
	}
	
	@Test
	void testCommandHistoryPopWhenHistoryEmpty() {
		CommandHistory commandHistory = new CommandHistory();
		
		Command command = commandHistory.pop();
		
		assertEquals(null, command);
	}
}
