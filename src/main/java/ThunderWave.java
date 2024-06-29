public class ThunderWave extends Attack{
    private int powerPoints = 20;
    private final int precision = 100;

    public ThunderWave(){}

    @Override
    public int attack(int health, int defense) {
        if (Math.random() <= precision/100 & powerPoints > 0) {

            System.out.println("The attack was successful!");
            System.out.println("The pokemon is paralyzed!");
            System.out.println("The pokemon health is: "+ health);
            this.powerPoints -= 1;
            return health;
        }
        else{
            System.out.println("Oh, you missed the attack!");
            this.powerPoints -= 1;
            return health;
        }
    }
    
}
