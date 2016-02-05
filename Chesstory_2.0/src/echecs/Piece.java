package echecs;

import java.util.ArrayList;

public class Piece {
	private String name;
	private char code, color;
	private MovePool movePool;
	private ArrayList<Case> accessibleCells = new ArrayList<>();

	public Piece(String name, char code, MovePool movePool) {
		this.name = name;
		this.code = code;
		this.color = (Character.isLowerCase(code)) ? 'b' : 'w';
		this.movePool = movePool;
	}

	public Piece(Piece that) {
		this.name = that.name;
		this.code = that.code;
		this.color = that.color;
		this.movePool = that.movePool;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the code
	 */
	public char getCode() {
		return code;
	}

	/**
	 * @return The arrayList which contains the possible moves of the piece
	 */
	public MovePool getMovePool() {
		return movePool;
	}

	public void emptyMovePool() {
		movePool.emptyMovePool();
	}

	public ArrayList<Case> getAccessibleCells() {
		return accessibleCells;
	}

	public void addAccessibleCells(Case cell) {
		accessibleCells.add(cell);
	}

	public void delAccessibleCells(Case cell) {
		if (accessibleCells.contains(cell))
			accessibleCells.remove(cell);
	}

	public void emptyAccessibleCells() {
		accessibleCells = new ArrayList<>();
	}
	
	public void addMove(Move move){
		movePool.addMove(move);
	}
	public void delMove(Move move){
		movePool.delMove(move);
	}
	public void setVertical(){
		movePool.setVertical();
	}
	public void setHorizontal(){
		movePool.setHorizontal();
	}
	public void setDiagonal(){
		movePool.setDiagonal();
	}
	
	public void addMovePiece(Piece that){
		this.movePool.addMultipleMoves(that.getMovePool());
	}
}