
public abstract class Pokemon {
	private String name;
	private int health;
	private int defense;
	private Region region;
	private Ability ability;
	private Attack attacks[] = new Attack[4];
	private HeldItem item;
	private Status status;
	private Type type1;
	private Type type2;

	public Pokemon(String name) {
		this.name = name;
	}
	
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

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public Region getRegion() {
        return region;
    }
 
    public void setRegion(Region region) {
        this.region = region;
    }

	public Ability getAblity() {
        return ability;
     }
 
     public void setAbility(Ability ability) {
        this.ability = ability;
    }

	public Attack getAttack(int index) {
		return this.attacks[index];
	}

	public void setAttack(Attack attack, int index){
		this.attacks[index] = attack;
	}

	public HeldItem getItem(){
		return this.item;
	}

	public void setItem(HeldItem item){
		this.item = item;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Type getType1() {
		return this.type1;
	}

	public void setType1(Type type1) {
		this.type1 = type1;
	}

	public Type getType2() {
		return this.type2;
	}

	public void setType2(Type type2) {
		this.type2 = type2;
	}
	
}
