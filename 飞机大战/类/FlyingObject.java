package 飞机大战;

import java.awt.image.BufferedImage;

/** 飞行物 */
public abstract class FlyingObject {
	protected BufferedImage image; // 图片
	protected int width; // 宽
	protected int height; // 高
	protected int x; // x坐标
	protected int y; // y坐标

	/** 飞行物走一步 */
	public abstract void step();

	/** 检测是否出界 */
	public abstract boolean outOfBounds();

	/** 检测敌人(敌机+小敌机)是否被子弹击中 this:敌人 bullet:子弹 */
	public boolean shootBy(Bullet bullet) {
		int x1 = this.x; // x1:敌人的x
		int x2 = this.x + this.width; // x2:敌人的x+敌人的宽
		int y1 = this.y; // y1:敌人的y
		int y2 = this.y + this.height; // y2:敌人的y+敌人的高（构建敌人矩形域）
		int x = bullet.x + 28; // x:子弹的x
		int y = bullet.y; // y:子弹的y

		return x >= x1 && x <= x2 && y >= y1 && y <= y2; // x在x1与x2之间，并且，y在y1与y2之间，即为撞上了
		// （这是一个点是否在矩形域内的判断）
	}

}
