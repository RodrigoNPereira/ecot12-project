public class EggPichu extends Pokemon {

    public EggPichu(String name) {
        super(name);
    }

    @Override
    public Pichu callEvolution() {
        System.out.println("The Egg has hatched!");
        return new Pichu(this.getName());
    }
}