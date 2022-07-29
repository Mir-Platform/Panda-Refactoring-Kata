package pandaRefactoringKata;

public class Panda {

    private final PandaTypeEnum type;
    private final int dan;
    private final double numberOfBamboos;
    private final boolean isSleeping;

    public Panda(PandaTypeEnum type, int dan, double numberOfBamboos, boolean isSleeping) {
        this.type = type;
        this.dan = dan;
        this.numberOfBamboos = numberOfBamboos;
        this.isSleeping = isSleeping;
    }

    public double getSpeed() {
        switch (type) {
            case GIANT:
                return getBaseSpeed();
            case KUNG_FU:
                return Math.max(0, getBaseSpeed() - getLoadFactor() * dan);
            case RED:
                return (isSleeping) ? 0 : getBaseSpeed(numberOfBamboos);
            default:
                throw new RuntimeException("Should be unreachable");
        }
    }

    private double getBaseSpeed(double numberOfBamboos) {
        return Math.min(24.0, numberOfBamboos * getBaseSpeed());
    }

    private double getLoadFactor() {
        return 2.0;
    }

    private double getBaseSpeed() {
        return 12.0;
    }

}
