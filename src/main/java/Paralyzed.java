import java.util.Random;

public class Paralyzed extends Status{
	private Boolean mayAttack;
	
	public Boolean getMayAttack() {
		return mayAttack;
	}

	@Override
	public void effect(Pokemon pokemon) {
		Random random = new Random();
		mayAttack = random.nextBoolean(); // when the attack occours, it should virify if mayAttack is true, otherwise, the attack should not happen
	}
}
