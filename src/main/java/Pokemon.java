
public abstract class Pokemon {
	private String name;
	private int health;
	private int attacklvl;
	private int specialAttack;
	private int defense;
	private int specialDefense;
	private int speed;
	
	public Pokemon(String name, int health, int attacklvl, int specialAttack, int defense, int specialDefense, int speed) {
	this.name = name;
	this.health = health;
	this.attacklvl = attacklvl;
	this.specialAttack = specialAttack;
	this.defense = defense;
	this.specialDefense = specialDefense;
	this.speed = speed;
	}
	
	public abstract void Callattack();
	public abstract Pokemon callEvolution();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttacklvl() {
		return attacklvl;
	}

	public void setAttacklvl(int attacklvl) {
		this.attacklvl = attacklvl;
	}

	public int getSpecialAttack() {
		return specialAttack;
	}

	public void setSpecialAttack(int specialAttack) {
		this.specialAttack = specialAttack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getSpecialDefense() {
		return specialDefense;
	}

	public void setSpecialDefense(int specialDefense) {
		this.specialDefense = specialDefense;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// public Pokemon callEvolution(){
		
	// }
	
	
}
