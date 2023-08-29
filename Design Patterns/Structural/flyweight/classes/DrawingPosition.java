package flyweight.classes;

public class DrawingPosition {
	private int row;
	private int column;
	
	public DrawingPosition(int row, int column) {
		this.row = row;
		this.column = column;
	}

	@Override
	public String toString() {
		return "DrawingPosition [row = " + row + ", column = " + column + "]\n";
	}
}