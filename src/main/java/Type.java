import java.util.List;

public class Type {
    private String name;
    private List<Type> weakness;
    private List<Type> strengths;

    public Type(String name, List<Type> weakness, List<Type> strengths) {
        this.name = name;
        this.weakness = weakness;
        this.strengths = strengths;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Type> getWeakness() {
        return weakness;
    }

    public void setWeakness(List<Type> weakness) {
        this.weakness = weakness;
    }

    public List<Type> getStrengths() {
        return strengths;
    }

    public void setStrengths(List<Type> strengths) {
        this.strengths = strengths;
    }
}