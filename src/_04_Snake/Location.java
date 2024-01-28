package _04_Snake;

public class Location {

	private int x;

	private int y;

	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public int getX() {
		return x;
	}

	public boolean equals(Location lock) {
		if (lock.x == x && lock.y == y) {
			return true;
		} else {

			return false;
		}
	}

	enum Direction {

		UP, DOWN, LEFT, RIGHT
	}
}
