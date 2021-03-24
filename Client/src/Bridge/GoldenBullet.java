package Bridge;

import java.awt.Color;

public class GoldenBullet extends BulletTypeAbstraction{


	public GoldenBullet(int x, int y, double angle, BulletModeInplementor mode) {
		this.x = x;
		this.y = y;
		this.r = 8;
		this.color = Color.YELLOW;
		
		this.damage = 10;
		rad = Math.toRadians(angle);
		dx = Math.cos(rad);
		dy = Math.sin(rad);
		speed = 10;
		
		this.mode = mode;
	}
}
