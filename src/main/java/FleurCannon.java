public class FleurCannon extends Attack{
    private int powerPoints = 5;
    private final int precision = 90;
    private final int power = 130;

    public FleurCannon(){}

    @Override
    public int attack(int health, int defense) {
        if (Math.random() <= precision/100 & powerPoints > 0) {
            double newHealth = health-(power/(0.5*defense));
            int newHealthInt = (int) newHealth;

            System.out.println("The attack was successful!");
            this.powerPoints -= 1;
            return newHealthInt;
        }
        else{
            System.out.println("Oh, you missed the attack!");
            this.powerPoints -= 1;
            return health;
        }
        
    }
}
