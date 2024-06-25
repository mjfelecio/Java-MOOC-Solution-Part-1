
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        return this.year == compared.year && this.month == compared.month &&
                this.day < compared.day;
    }

    public void advance() {
        if (day >= 30) {
            month++;
            day = 1;

            if (this.month >= 12) {
                this.year++;
                this.month = 1;
            }
        } else {
            day++;

        }
    }

    public void advance (int howManyDays){

        for (int i = 0; i < howManyDays; i++) {

            if (day >= 30) {
                month++;
                day = 1;

                if (this.month >= 12) {
                    this.year++;
                    this.month = 1;
                }
            } else {
                day++;
            }

        }
    }

    public SimpleDate afterNumberOfDays (int days){
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);

        newDate.advance(days);

        return newDate;
    }
}
