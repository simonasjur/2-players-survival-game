package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Observer.BossSubject;
import Observer.ConcreteBossMinionObserver;
import Observer.IBossMinionObserver;

class BossSubjectSetDeadTests {

	@Test
	void testSetDead_IsDeadTrue() {
		BossSubject boss = new BossSubject();
		
		boss.setDead(true);
		
		assertEquals(true, boss.isDead());
	}
	
	@Test
	void testSetDead_IsDeadFalse() {
		BossSubject boss = new BossSubject();
		
		boss.setDead(false);
		
		assertEquals(false, boss.isDead());
	}	
	
}
