
public class FirePunch extends Attack{

    private int powerPoints = 15;
    private final int precision = 100;
    private final int power = 75;

    public FirePunch(){}

    @Override
    public void attack(Pokemon pokemon) {
        if (Math.random() <= precision/100 & powerPoints > 0) {
            double newHealth = pokemon.getHealth()-(power/(0.5*pokemon.getDefense()));
            int newHealthInt = (int) newHealth;
            pokemon.setHealth(newHealthInt);

            if(Math.random() > 0.7){
                System.out.println("The pokemon has burn!");
            }

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
