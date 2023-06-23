public class ThunderWave extends Attack{
    private int powerPoints = 20;
    private final int precision = 100;
    private final int power = 0;

    public ThunderWave(){}

    @Override
    public void attack(Pokemon pokemon) {
        if (Math.random() <= precision/100 & powerPoints > 0) {

            System.out.println("The attack was successful!");
            System.out.println("The pokemon is paralyzed!");
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
