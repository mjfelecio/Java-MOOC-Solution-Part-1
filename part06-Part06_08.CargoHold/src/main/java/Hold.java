import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcasesInHand;
    private int totalWeight = 0;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcasesInHand = new ArrayList<>();
    }



    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight + suitcase.totalWeight() <= maximumWeight) {
            suitcasesInHand.add(suitcase);
            totalWeight += suitcase.totalWeight();
        }
    }

    public void printItems() {
        for (Suitcase suitcase : suitcasesInHand) {
            suitcase.printItems();
        }
    }




    public String toString() {
        if (suitcasesInHand.isEmpty()) {
            return "no suitcases";

        } else if (suitcasesInHand.size() == 1) {
            return "1 suitcase (" + totalWeight + " kg)";

        }

        return suitcasesInHand.size() + " suitcases (" + totalWeight + " kg)";
    }
}
