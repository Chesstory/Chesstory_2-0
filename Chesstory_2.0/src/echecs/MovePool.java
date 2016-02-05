package echecs;

import java.util.ArrayList;

/**
 * Represents the list of moves a piece can do
 * 
 * @author Guillemot Baptiste
 *
 */
public class MovePool {
	private ArrayList<Move> movePool = new ArrayList<>();

	public MovePool() {
	}

	public MovePool(MovePool that) {
		this.movePool = that.movePool;
	}

	public void addMove(Move move) {
		if (!movePool.contains(move))
			movePool.add(move);
	}

	public void delMove(Move move) {
		if (movePool.contains(move))
			movePool.remove(move);
	}

	public void emptyMovePool() {
		movePool.clear();
	}

	public void setHorizontal() {
		movePool.add(new Move(1, new Position(1, 0), 99));
	}

	public void delHorizontal() {
		delMove(new Move(1, new Position(1, 0), 99));
	}

	public void setVertical() {
		movePool.add(new Move(1, new Position(0, 1), 99));
	}

	public void delVertical() {
		delMove(new Move(1, new Position(0, 1), 99));
	}

	public void setDiagonal() {
		movePool.add(new Move(1, new Position(1, 1), 99));
	}

	public void delDiagonal() {
		delMove(new Move(1, new Position(1, 1), 99));
	}

	public int getSize() {
		return movePool.size();
	}

	public Move get(int index) {
		if (index <= movePool.size())
			return movePool.get(index);
		else
			return null;
	}

	public void addMultipleMoves(MovePool moveList) {
		for (int i = 0; i < moveList.getSize(); i++) {
			if (!movePool.contains(moveList.get(i)))
				movePool.add(moveList.get(i));
		}
	}
}