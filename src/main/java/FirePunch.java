
public class FirePunch extends Attack{

    private int powerPoints = 15;
    private final int precision = 100;
    private final int power = 75;

    public FirePunch(){}

    @Override
    public int attack(int health, int defense) {
        if (Math.random() <= precision/100 & powerPoints > 0) {
            double newHealth = health-(power/(0.01*defense));
            int newHealthInt = (int) newHealth;
            

            if(Math.random() > 0.7){
                System.out.println("The pokemon has burn!");
            }

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
