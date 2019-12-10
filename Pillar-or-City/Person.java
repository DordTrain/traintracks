import java.util.ArrayList;

public class Person {
    static ArrayList<Item> inv = new ArrayList<Item>(5);

    public Person(String name, int health, int water) {
        this.name = name;
        this.health = health;
        this.water = water;

    }

    String name;

    int health;

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    int water;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void addtoInv(Item item) {
        inv.add(item);
    }
    public void invPrint() {
        String tory = "";
        for (int i = 0; i < inv.size(); i++) {
            if (i == 0) {
                tory+=inv.get(i).name;
            }
            else {
                tory+=", "+inv.get(i).name;
            }

        }
        System.out.println("You are carrying "+tory+".");

    }





}
