public class Item {
    String name;
    int attack;
    int defence;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    int weight;

    public Item(String name, int attack, int defence, int durability, int weight) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.durability = durability;
        this.weight = weight;
    }

    int durability;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }


}
