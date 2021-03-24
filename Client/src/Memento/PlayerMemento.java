package Memento;

import java.awt.Color;

import Builder.Hero;
import Decorator.Weapon;
import Strategy.IShootStrategy;

public class PlayerMemento {
	
	protected int x, y;
	protected int velX, velY;
	protected int healthPoints;
	protected int points;
	protected int size;
	protected boolean shooting;
	protected long shootingTimer;
	protected long shootingDelay;
	protected boolean recovering;
	protected long recoveryTimer;
	protected long burntTimer;
	protected long poisonedTimer;
	protected long strategyTimer;
	protected String bulletType;
	protected Hero selectedHero;
	protected Weapon defaultWeapon;
	protected Color teamColor;
	protected String nickname;
	protected boolean isReady;
	protected boolean isPoisoned;
	protected boolean isBurning;
	protected int poisonTick;
	protected int burnTick;	
	protected IShootStrategy shootStrategy;
	protected boolean isDead;
	
	public PlayerMemento(int x, int y, int velX, int velY, int healthPoints, int points, int size, boolean shooting,
			long shootingTimer, long shootingDelay, boolean recovering, long recoveryTimer, long burntTimer,
			long poisonedTimer, long strategyTimer, String bulletType, Hero selectedHero, Weapon defaultWeapon,
			Color teamColor, String nickname, boolean isPoisoned, boolean isBurning, int poisonTick,
			int burnTick, IShootStrategy shootStrategy, boolean isDead) {
		super();
		this.x = x;
		this.y = y;
		this.velX = velX;
		this.velY = velY;
		this.healthPoints = healthPoints;
		this.points = points;
		this.size = size;
		this.shooting = shooting;
		this.shootingTimer = shootingTimer;
		this.shootingDelay = shootingDelay;
		this.recovering = recovering;
		this.recoveryTimer = recoveryTimer;
		this.burntTimer = burntTimer;
		this.poisonedTimer = poisonedTimer;
		this.strategyTimer = strategyTimer;
		this.bulletType = bulletType;
		this.selectedHero = selectedHero;
		this.defaultWeapon = defaultWeapon;
		this.teamColor = teamColor;
		this.nickname = nickname;
		this.isPoisoned = isPoisoned;
		this.isBurning = isBurning;
		this.poisonTick = poisonTick;
		this.burnTick = burnTick;
		this.shootStrategy = shootStrategy;
		this.isDead = isDead;
	}
	
	public boolean isDead() {
		return isDead;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getVelX() {
		return velX;
	}

	public int getVelY() {
		return velY;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public int getPoints() {
		return points;
	}

	public int getSize() {
		return size;
	}

	public boolean isShooting() {
		return shooting;
	}

	public long getShootingTimer() {
		return shootingTimer;
	}

	public long getShootingDelay() {
		return shootingDelay;
	}

	public boolean isRecovering() {
		return recovering;
	}

	public long getRecoveryTimer() {
		return recoveryTimer;
	}

	public long getBurntTimer() {
		return burntTimer;
	}

	public long getPoisonedTimer() {
		return poisonedTimer;
	}

	public long getStrategyTimer() {
		return strategyTimer;
	}

	public String getBulletType() {
		return bulletType;
	}

	public Hero getSelectedHero() {
		return selectedHero;
	}

	public Weapon getDefaultWeapon() {
		return defaultWeapon;
	}

	public Color getTeamColor() {
		return teamColor;
	}

	public String getNickname() {
		return nickname;
	}

	public boolean isReady() {
		return isReady;
	}

	public boolean isPoisoned() {
		return isPoisoned;
	}

	public boolean isBurning() {
		return isBurning;
	}

	public int getPoisonTick() {
		return poisonTick;
	}

	public int getBurnTick() {
		return burnTick;
	}

	public IShootStrategy getShootStrategy() {
		return shootStrategy;
	}

 
	

}
