package edu.ktu.signalrclient;

import java.awt.Color;

import Bridge.BulletTypeAbstraction;
import Bridge.BulletModeInplementor;

public class NormalBullet extends BulletTypeAbstraction{


	public NormalBullet(int x, int y, double angle, BulletModeInplementor mode) {
		this.x = x;
		this.y = y;
		this.r = 8;
		this.color = Color.WHITE;
		
		this.damage = 5;
		rad = Math.toRadians(angle);
		dx = Math.cos(rad);
		dy = Math.sin(rad);
		speed = 10;
		
		this.mode = mode;
	}
}
