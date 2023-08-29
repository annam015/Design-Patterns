package flyweight.classes;

import java.util.HashMap;

public class SpectatorFactory {
	private HashMap<Integer, ISpectator> spectators;

	public SpectatorFactory() {
		this.spectators = new HashMap<>();
	}
	
	public ISpectator getSpectator(int id, float height, float width, String color) {
		if(this.spectators.get(id) != null)
		{
			return this.spectators.get(id);
		} else {
			ISpectator spectator = new Spectator(id, height, width, color);
			this.spectators.put(id, spectator);
			return spectator;
		}		
	}
}