public class AlolanRaichu extends Pokemon {

    public AlolanRaichu(String name) {
        super(name);
    }

    @Override
    public Pokemon callEvolution() {
        System.out.println("There is a new Egg!");
        return new EggPichu(this.getName());

    }
}