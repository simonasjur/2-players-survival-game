package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Observer.BossSubject;

class BossSubjectHitTests {

	@Test
	void testSubjectHit_HealthReduce() {
		BossSubject subject = new BossSubject();
		subject.setHealth(100);
		
		subject.hit(10);
		
		assertEquals(90, subject.getHealth());
	}
	
	@Test
	void testSubjectHit_SetDead() {
		BossSubject subject = new BossSubject();
		subject.setHealth(100);
		
		subject.hit(101);
		
		assertEquals(true, subject.isDead());
	}

}
