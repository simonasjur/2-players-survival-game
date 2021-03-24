package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Observer.BossSubject;
import Observer.ConcreteBossMinionObserver;

class ChangeMinionParamsTests {

	@Test
	void testBossHealthLessThanOrEqualsToZero_SetMinionDeadTrue() {
		BossSubject subject = new BossSubject();		
		subject.setHealth(0);	
		ConcreteBossMinionObserver observer = new ConcreteBossMinionObserver(subject);
		
		observer.changeMinionParams();
		
		assertEquals(true, observer.isDead());
	}
	
	@Test
	void testBossDeadTrue_SetMinionDeadTrue() {
		BossSubject subject = new BossSubject();		
		subject.setDead(true);		
		ConcreteBossMinionObserver observer = new ConcreteBossMinionObserver(subject);
		
		observer.changeMinionParams();
		
		assertEquals(true, observer.isDead());
	}
	
	@Test
	void testBossHealthLessThanOrEqualsToZero_UpdateMinionDeadTrue() {
		BossSubject subject = new BossSubject();
		subject.setHealth(0);
		ConcreteBossMinionObserver observer = new ConcreteBossMinionObserver(subject);
		
		observer.changeMinionParams();
		
		assertEquals(true, observer.isDeadUpdated());
	}
	
	@Test
	void testBossDeadTrue_UpdateMinionDeadTrue() {
		BossSubject subject = new BossSubject();
		subject.setDead(true);
		ConcreteBossMinionObserver observer = new ConcreteBossMinionObserver(subject);
		
		observer.changeMinionParams();
		
		assertEquals(true, observer.isDeadUpdated());
	}
	
	@Test
	void testBossHealthLessThanOrEqualsTo30_SetMinionSpeedPlus3() {
		BossSubject subject = new BossSubject();
		subject.setHealth(30);
		ConcreteBossMinionObserver observer = new ConcreteBossMinionObserver(subject);
		
		observer.changeMinionParams();
		
		assertEquals(8, observer.getSpeed());
	}
	
	@Test
	void testBossHealthLessThanOrEqualsTo70_SetMinionSpeedPlus2() {
		BossSubject subject = new BossSubject();
		subject.setHealth(70);
		ConcreteBossMinionObserver observer = new ConcreteBossMinionObserver(subject);
		
		observer.changeMinionParams();
		
		assertEquals(7, observer.getSpeed());
	}

}
