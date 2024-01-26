package JavaGame;

class Ability {
    private String name;
    private int baseDamage;
    private int apCost; // AP (Action Points) cost

    public Ability(String name, int baseDamage, int apCost) {
        this.name = name;
        this.baseDamage = baseDamage;
        this.apCost = apCost;
    }

    public String getName() {
        return name;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public int getApCost() {
        return apCost;
    }

    public int calculateDamage(int intelligence) {
        // Damage calculation based on intelligence
        return baseDamage + (intelligence * 2);
    }
}//