import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gift;

    public Package () {
        this.gift = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.gift.add(gift);
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Gift w : gift) {
            totalWeight += w.getWeight() ;
        }
        return totalWeight;
    }
}