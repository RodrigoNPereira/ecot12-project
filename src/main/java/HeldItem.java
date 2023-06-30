public class HeldItem {
	private String name;
	private int value;
	private String effect;

	public HeldItem(String name, int value, String effect) {
		this.value = value;
		this.effect = effect;
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	
	
}
