
public abstract class Attack{
    private int powerPoints;
    private int precision;
    private int power;

    public int getPowerPoints() {
        return powerPoints;
    }
    public void setPowerPoints(int powerPoints) {
        this.powerPoints = powerPoints;
    }

    public int getPrecision() {
        return precision;
    }

    public int getPower() {
        return power;
    }

    public abstract int attack(int health, int defense);
}