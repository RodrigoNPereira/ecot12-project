public class FleurCannon extends Attack{
    private int powerPoints = 5;
    private final int precision = 90;
    private final int power = 130;

    public FleurCannon(){}

    @Override
    public void attack(Pokemon pokemon) {
        if (Math.random() <= precision/100 & powerPoints > 0) {
            double newHealth = pokemon.getHealth()-(power/(0.5*pokemon.getDefense()));
            int newHealthInt = (int) newHealth;
            pokemon.setHealth(newHealthInt);

            System.out.println("The attack was successful!");
            System.out.println("The pokemon health is: "+ pokemon.getHealth());
            this.powerPoints -= 1;
        }
        else{
            System.out.println("Oh, you missed the attack!");
            System.out.println("The pokemon health is: "+ pokemon.getHealth());
            this.powerPoints -= 1;
        }
        
    }
}
