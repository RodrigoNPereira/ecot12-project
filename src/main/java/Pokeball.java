public class Pokeball {
    private String name;
    private float effectviness;
    private String sideEffect;
    private Pokemon capture;

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

    public float getEffectviness() {
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

    public Pokemon getCapture() {
        return capture;
    }

    public void capturePokemon(Pokemon pokemon) {
        if(Math.random() <= this.effectviness/100){

            this.capture = pokemon;
            System.out.println("The Pokemon was captured!");
        }else{
            System.out.println(this.effectviness/100);
        }
    }
}