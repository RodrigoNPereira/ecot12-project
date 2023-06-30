public class Pikachu extends Pokemon {

    public Pikachu(String name) {
        super(name);
    }

    @Override
    public AlolanRaichu callEvolution() {
        HeldItem item = this.getItem();
        if (item.getName().equals("Alolan Thunderstone")){
            System.out.println("The Pikachu has evolved!");
            return new AlolanRaichu(this.getName());
        }
        System.out.println("Without the Alolan Thunderstone it wont evolve!");
        return null;
    }
}