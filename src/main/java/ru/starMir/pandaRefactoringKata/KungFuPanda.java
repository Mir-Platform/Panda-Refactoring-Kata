package ru.starMir.pandaRefactoringKata;

public class KungFuPanda extends Panda {
    protected final int dan;

    public KungFuPanda(int dan) {
        super();
        this.dan = dan;
    }

    @Override
    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * dan);
    }

    protected double getLoadFactor() {
        return 2.0;
    }
}
