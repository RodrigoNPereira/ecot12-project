
public class Burn extends Status{
	private boolean burning;
	
	@Override
	public void effect(Pokemon pokemon) {
		this.burning = true;
		System.out.println("Your Pokemon is burning!");
	}
}
