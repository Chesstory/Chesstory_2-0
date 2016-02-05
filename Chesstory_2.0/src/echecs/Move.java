package echecs;

/**
 * This class represents a move, with a length, a direction and the times it can
 * be done.
 * 
 * @author GUILLEMOT Baptiste
 *
 */
public class Move {
	private int length;
	private Position direction;
	private int iteratif;
	// TODO change name

	public Move(int length, Position direction, int iteratif) {
		this.length = length;
		this.direction = direction;
		this.iteratif = iteratif;
	}

	public Move(int length, Position direction) {
		this.length = length;
		this.direction = direction;
		this.iteratif = 0;
	}

	public Move(Move that) {
		this.length = that.length;
		this.direction = that.direction;
		this.iteratif = that.iteratif;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length
	 *            the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return the direction
	 */
	public Position getDirection() {
		return direction;
	}

	/**
	 * @param direction
	 *            the direction to set
	 */
	public void setDirection(Position direction) {
		this.direction = direction;
	}

	/**
	 * @return the iteratif
	 */
	public int getIteratif() {
		return iteratif;
	}

	/**
	 * @param iteratif
	 *            the iteratif to set
	 */
	public void setIteratif(int iteratif) {
		this.iteratif = iteratif;
	}
}
