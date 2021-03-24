package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.Test;

import Command.Command;
import Command.CommandChangePlayerColor;
import edu.ktu.signalrclient.Player;

class CommandChangePlayerColorTests {

	@Test
	void testExecute() {
		Player player = new Player();
		player.setTeamColor(new Color((int)(Math.random() * 0x1000000)));
		Color oldColor = player.getTeamColor();
		Command changePlayerColor = new CommandChangePlayerColor(player);
		
		changePlayerColor.execute();
		
		assertNotEquals(oldColor.getRGB(), player.getTeamColor().getRGB());
	}

}
