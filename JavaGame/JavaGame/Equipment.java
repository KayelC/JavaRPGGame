package JavaGame;

public class Equipment {
    private int gold;
    private String item;

    public Equipment(int gold, String item) {
        this.gold = gold;
        this.item = item;
    }

    public int getGold() {
        return gold;
    }

    public String getItem() {
        return item;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
    public void setItem(String item) {
        this.item = item;
    }
}//
