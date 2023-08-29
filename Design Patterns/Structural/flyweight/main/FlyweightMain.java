package flyweight.main;

import flyweight.classes.DrawingPosition;
import flyweight.classes.SpectatorFactory;

public class FlyweightMain {

	public static void main(String[] args) {		
		SpectatorFactory factory = new SpectatorFactory();
		
		DrawingPosition drawingPosition1 = new DrawingPosition(5, 10);
		DrawingPosition drawingPosition2 = new DrawingPosition(5, 11);
		DrawingPosition drawingPosition3 = new DrawingPosition(6, 15);
		
		factory.getSpectator(1, 10, 5, "red").drawSpectator(drawingPosition1);
		factory.getSpectator(2, 12, 6, "green").drawSpectator(drawingPosition2);
		factory.getSpectator(1, 0, 0, null).drawSpectator(drawingPosition3);
	}

}