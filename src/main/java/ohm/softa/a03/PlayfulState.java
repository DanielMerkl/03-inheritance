package ohm.softa.a03;

public class PlayfulState extends State {
    protected PlayfulState(int duration) {
        super(duration);
    }

    @Override
    State successor(Cat cat) {
        return new SleepingState(cat.getSleep());
    }
}
