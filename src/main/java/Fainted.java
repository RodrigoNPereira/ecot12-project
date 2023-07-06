
public class Fainted extends Status{
	
	private Boolean unspawn;
	
	@Override
	public void effect(Pokemon pokemon) {
		if (pokemon.getHealth() <= 0){
			unspawn = true;
		}
	}

	public boolean getunspwn() {
		return this.unspawn;
	}
}
