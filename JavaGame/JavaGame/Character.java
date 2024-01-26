package JavaGame;

import java.util.ArrayList;

public class Character { //All Status of Characters
    private ArrayList<Ability> abilities = new ArrayList<>();

    String Name;
    int EXP;
    private int EXPLVUP;
    int LV;

    int HP;
    int AP;

    int Pwr;
    int Def;
    int Int;
    int Agl;

    String status;

    String Master;

    int maxHP = LV * 7;
    private int gold;

    public Character(String Name, int EXP, int LV, int HP, int AP, int Pwr, int Def, int Int, int Agl, String status, String Master, int maxHP) {
        this.Name = Name;
        this.EXP = EXP;
        this.LV = LV;

        this.HP = HP;
        this.AP = AP;

        this.Pwr = Pwr;
        this.Def = Def;
        this.Int = Int;
        this.Agl = Agl;

        this.status = status;

        this.Master = Master;

        this.maxHP = maxHP;

    }
    public ArrayList<Ability> getAbilities() {
        return abilities;
    }

    public String getName() {
        return Name;
    }
    public int getEXP() {
        return EXP;
    }
    public int getEXPLVUP() {
        return EXPLVUP;
    }
    public int getLV() {
        return LV;
    }
    public boolean shouldLVUP() {
        return this.EXP >= this.EXPLVUP;
    }


    public int getHP() {
        return HP;
    }
    public int getAP() {
        return AP;
    }


    public int getPwr() {
        return Pwr;
    }
    public int getDef() {
        return Def;
    }
    public int getInt() {
        return Int;
    }
    public int getAgl() {
        return Agl;
    }


    public String getStatus() {
        return status;
    }
    public String getMaster() {
        return Master;
    }
    public int getGold() {
        return gold;
    }

    public boolean isAlive() {
        return HP > 0;
    }
    public int getAttackDamage() {
        
        return Pwr * 2; // Example: Damage is twice the power stat
    }
    public void heal(int amount) {
        // Add logic to ensure healing doesn't exceed maximum HP
        HP = Math.min(HP + amount, getMaxHP());
    }
    public void takeDamage(int damage) {
        // Ensure damage doesn't go below 0
        HP = Math.max(0, HP - damage);
    }
    public void decreaseAP(int amount) {
        // Ensure AP doesn't go below 0
        AP = Math.max(0, AP - amount);
    }
    public int getMaxHP() {
        return maxHP; 
    }
        
    private void calcEXPLVUP() {
        this.EXPLVUP = this.LV * 17;
    }
    public void gainExp(int amount) {
        this.EXP += amount;
        if (this.EXP >= this.EXPLVUP) {
            LVUP();
        }
    }
    private void LVUP() {
        this.LV++;
        this.EXP = 0; // Reset experience to 0 for the next level
        calcEXPLVUP();

        // Increase player stats upon leveling up
        this.maxHP += 7; // Increase maxHP by 7
        this.HP = this.maxHP; // Restore HP to max upon leveling up
        this.AP += 2; // Increase AP by 2
        this.Pwr += 2; // Increase Power by 2
        this.Def += 1; // Increase Defense by 1
        this.Int += 1; // Increase Intelligence by 1
        this.Agl += 1; // Increase Agility by 1

        System.out.println("Congratulations! You leveled up to LV " + this.LV + "!");
        System.out.println("Your stats have increased:");
        System.out.println("Max HP: " + this.maxHP);
        System.out.println("AP: " + this.AP);
        System.out.println("Pwr: " + this.Pwr);
        System.out.println("Def: " + this.Def);
        System.out.println("Int: " + this.Int);
        System.out.println("Agl: " + this.Agl);    
    }
    public void gainGold(int amount) {
        if (amount > 0) {
            gold += amount;
            System.out.println("You gained " + amount + " gold! Total gold: " + gold);
        }
    }

    public void addAbility(Ability ability) {
        abilities.add(ability);
    }
    public void restoreHPToMax() {
        this.HP = this.maxHP;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    public void setEXP(int EXP) {
        this.EXP = EXP;
    }
    public void setLV(int LV) {
        this.LV = LV;
    }


    public void setHP(int HP) {
        this.HP = HP;
    }
    public void setAP(int AP) {
        this.AP = AP;
    }


    public void setPwr(int Pwr) {
        this.Pwr = Pwr;
    }
    public void setDef(int Def) {
        this.Def = Def;
    }
    public void setAgl(int Agl) {
        this.Agl = Agl;
    }


    public void setStatus(String status) {
        this.status = status;
}
    public void setMaster(String Master) {
        this.Master = Master;
    }


    public String toString() {
        return "Name: "+Name+"\nEXP: "+EXP+"\nLV:"+LV+"\nHP: "+HP+"\nAP: "+AP+"\nPwr: "+Pwr+"\nDef: "+Def+"\nInt: "+Int+"\nAgl: "+Agl+"\nStatus: "+status+"\nMaster: "+Master;
    }
}//