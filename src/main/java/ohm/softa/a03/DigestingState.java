package ohm.softa.a03;

public class DigestingState extends State {
    private final int remainingAwakeTime;

    protected DigestingState(int duration, int remainingAwakeTime) {
        super(duration);
        this.remainingAwakeTime = remainingAwakeTime;
    }

    @Override
    State successor(Cat cat) {
        return new PlayfulState(remainingAwakeTime - cat.getDigest());
    }
}
