
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    private static final double AFFORDABLE_PRICE = 2.5;
    private static final double HEARTY_PRICE = 4.3;

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
         double change = payment;

        if (payment >= AFFORDABLE_PRICE) {
            this.money += AFFORDABLE_PRICE;
            change = payment - AFFORDABLE_PRICE;
            affordableMeals++;

            return change;
        }
        return change;
    }

    public double eatHeartily(double payment) {
        double change = payment;

        if (payment >= HEARTY_PRICE) {
            this.money += HEARTY_PRICE;
            change = payment - HEARTY_PRICE;

            heartyMeals++;

            return change;
        }
        return change;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= AFFORDABLE_PRICE) {
            card.takeMoney(AFFORDABLE_PRICE);
            affordableMeals++;

            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= HEARTY_PRICE) {
            card.takeMoney(HEARTY_PRICE);
            heartyMeals++;

            return true;
        }
        return false;

    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
