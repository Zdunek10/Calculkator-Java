package kalkulator;
import java.awt.Image;
import java.awt.*;

import javax.swing.ImageIcon;

public class Fireball {
	int y, x;
	Image img;
	boolean visible;

	public Fireball(int startX, int startY) {
		x = startX;
		y = startY;

		ImageIcon newFireball = new ImageIcon("C:/fireball.png");
		img = newFireball.getImage();
		visible = true;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public boolean getVisible() {
		return visible;
	}
	public Image getImage() {
		return img;
	}
	// public
	 public void move()
	{
		x = x + 2;
		if (x > 1200)
			visible = false;
	}
}
