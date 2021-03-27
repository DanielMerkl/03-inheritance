package ohm.softa.a03;

abstract class State {
    private int time = 0;
    private final int duration;

    protected State(int duration) {
        this.duration = duration;
    }

    State tick(Cat cat) {
        time++;
        return time < duration ? this : successor(cat);
    }

    abstract State successor(Cat cat);

    public int getTime() {
        return time;
    }

    public int getDuration() {
        return duration;
    }
}
