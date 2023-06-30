import java.util.Random;

public class Paralyzed extends Status{
	private Boolean mayAttack;
	
	public Boolean getMayAttack() {
		return mayAttack;
	}

	@Override
	public void effect(Pokemon pokemon) {
		Random random = new Random();
		mayAttack = random.nextBoolean();
		System.out.println("Your Pokemon is paralyzed!");
	}
}
