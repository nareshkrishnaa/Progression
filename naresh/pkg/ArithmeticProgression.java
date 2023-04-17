package naresh.pkg;

public class ArithmeticProgression extends Progression {
    protected long increment;

    public ArithmeticProgression(){
        increment = 1;
        current=0;
    }

    public ArithmeticProgression(long increment) {
        super(0);
        this.increment = increment;

    }

    public ArithmeticProgression(long start, long increment) {
       current=start;
        this.increment = increment;
    }

    @Override
    protected void advance() {
        current+=increment;
    }
}
