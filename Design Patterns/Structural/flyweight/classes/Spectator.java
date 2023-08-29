package flyweight.classes;

public class Spectator implements ISpectator {
	private int id;
	private float height;
	private float width;
	private String color;
	
	public Spectator(int id, float height, float width, String color) {
		this.id = id;
		this.height = height;
		this.width = width;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Spectator [id = " + id + ", height = " + height + ", width = " + width + ", color = " + color + "]";
	}

	@Override
	public void drawSpectator(DrawingPosition drawingPosition) {
		System.out.println(this.toString() + " -> " + drawingPosition.toString());
	}
}