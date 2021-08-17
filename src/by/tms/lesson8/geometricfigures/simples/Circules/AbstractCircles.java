package by.tms.lesson8.geometricfigures.simples.Circules;

import by.tms.lesson8.geometricfigures.simples.AbstractFiguresSimples;

public abstract class AbstractCircles extends AbstractFiguresSimples {

    private int radius;
    private double degrees;

    public AbstractCircles(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public AbstractCircles(int x, int y, int radius, double degrees) {
        super(x, y);
        this.radius = radius;
        this.degrees = degrees;
    }

    public int getRadius() {
        return radius;
    }

    public double getDegrees() {
        return degrees;
    }
}
