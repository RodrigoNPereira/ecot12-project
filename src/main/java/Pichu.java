public class Pichu extends Pokemon {

    public Pichu(String name) {
        super(name);
    }

    @Override
    public Pikachu callEvolution() {
        HeldItem item = this.getItem();
        if (item.getName().equals("Thunderstone")){
            System.out.println("The Pichu has evolved!");
            return new Pikachu(this.getName());
        }
        System.out.println("Without the Thunderstone it won't evolve!");
        return null;
    }
}