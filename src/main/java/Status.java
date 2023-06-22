
public abstract class Status {
	private int timeToVanish;

	public int getTimeToVanish() {
		return timeToVanish;
	}

	public void setTimeToVanish(int timeToVanish) {
		this.timeToVanish = timeToVanish;
	}
	
	public abstract void effect(Pokemon pokemon);
}
