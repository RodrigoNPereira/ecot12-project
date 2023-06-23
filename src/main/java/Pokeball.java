public class Pokeball {
    private String name;
    private int effectviness;
    private String sideEffect;

    public Pokeball(String name, int effectviness, String sideEffect) {
        this.name = name;
        this.effectviness = effectviness;
        this.sideEffect = sideEffect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEffectviness() {
        return effectviness;
    }

    public void setEffectviness(int effectviness) {
        this.effectviness = effectviness;
    }

    public String getSideEffect() {
        return sideEffect;
    }

    public void setSideEffect(String sideEffect) {
        this.sideEffect = sideEffect;
    }
}