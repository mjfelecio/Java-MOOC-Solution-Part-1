public class Timer {
    private ClockHand second;
    private ClockHand centiSecond;

    public Timer (){
        this.second = new ClockHand(60);
        this.centiSecond = new ClockHand(100);
    }

    public void advance() {
        this.centiSecond.advance();

        if (this.centiSecond.value() == 0) {
            this.second.advance();
        }
    }

    public String toString() {
        return second + ":" + centiSecond;
    }
}
