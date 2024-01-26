package JavaGame;
import java.util.*;
public class Enemy extends Character{
    private List<Ability> abilities;

    Item itemDrop;
    int goldDrop;

    public Enemy(String Name, int EXP, int LV, int HP, int AP, int Pwr, int Def, int Int, int Agl, String status, String Master, int maxHP, Item itemDrop, int goldDrop) {
        super(Name, EXP, LV, HP, AP, Pwr, Def, Int, Agl, status, Master, maxHP);
        this.abilities = new ArrayList<>();
    
        this.abilities.add(new Ability("Hadoken", 5, 1));
    
        this.itemDrop = itemDrop;
        this.goldDrop = goldDrop;
    }
    
    public List<Ability> getEnemyAbilities() {
        return abilities;
    }

    public int performNormalAttack() {
        // Implement logic for the enemy's normal attack
        int damage = getAttackDamage();
        return damage;
    }

    public int getGoldDrop() {
        return goldDrop;
    }
    public Item getitemDrop() {
        return itemDrop;
    }
    public String toString() {
        StringBuilder abilitiesString = new StringBuilder("Abilities: ");
        for (Ability ability : abilities) {
            abilitiesString.append(ability.getName()).append(", ");
        }
        return super.toString() + "\n" + abilitiesString.toString() + "\nGold Dropped: " + goldDrop + " Item Dropped: " + itemDrop;
    }
    
    public void useAbility(Ability ability, Character target) {
        int damage = ability.calculateDamage(getInt());
        target.takeDamage(damage);
        System.out.println(getName() + " used " + ability.getName() + " and dealt " + damage + " damage to you!");
    }
}//